package com.library.controller;

import com.library.entity.RentInfo;
import com.library.entity.RentStatus;
import com.library.entity.User;
import com.library.service.RentInfoService;
import com.library.service.RoleService;
import com.library.service.UserService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
    private final RoleService roleService;
    private final RentInfoService rentInfoService;
    private final PasswordEncoder passwordEncoder;

    public UserController(UserService userService, RoleService roleService, RentInfoService rentInfoService, PasswordEncoder passwordEncoder) {
        this.userService = userService;
        this.roleService = roleService;
        this.rentInfoService = rentInfoService;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/create")
    public String create(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "user-form";
    }

    @PostMapping("/create")
    public String create(@Validated @ModelAttribute("user") User user, BindingResult result) {
        if (result.hasErrors()) {
            return "user-form";
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(roleService.findById(1L));
        user.setCreationDate(LocalDateTime.now(ZoneId.of("Europe/Kiev")));
        userService.save(user);
        return "redirect:/user/" + user.getId();
    }

    @PreAuthorize("hasAnyAuthority('ADMIN', 'MANAGER') or hasAuthority('READER') and authentication.principal.id == #id")
    @GetMapping("/{id}")
    public String read(@PathVariable Long id, Model model) {
        User user = userService.findById(id);
        Integer amountReadBooks = userService.amountReadBooks(id);
        Optional<Double> averageReadingTimeReturnedBooks = userService.readingTimeOfBooks(RentStatus.RETURNED, id);
        Optional<Double> averageReadingTimeCurrentBooks = userService.readingTimeOfBooks(RentStatus.ACTIVE, id);
        Integer daysClient = userService.daysOurClient(id);
        List<RentInfo> rentInfos = rentInfoService.findByUserId(id);

        averageReadingTimeCurrentBooks
                .ifPresent(t -> model.addAttribute("averageReadingTimeCurrentBooks", t));
        averageReadingTimeReturnedBooks
                .ifPresent(t -> model.addAttribute("averageReadingTimeReturnedBooks", t));

        model.addAttribute("user", user);
        model.addAttribute("amountReadBooks", amountReadBooks);
        model.addAttribute("daysClient", daysClient);
        model.addAttribute("rentInfos", rentInfos);

        return "user-info";
    }

    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('READER') and authentication.principal.id == #id")
    @GetMapping("/update/{id}")
    public String update(@PathVariable Long id, Model model) {
        User user = userService.findById(id);
        model.addAttribute("user", user);
        model.addAttribute("roles", roleService.findAll());
        return "user-update";
    }

    @PostMapping("/update")
    public String update(@Validated @ModelAttribute("user") User user,
                         BindingResult result, Model model,
                         @RequestParam("oldPassword") String oldPassword,
                         @RequestParam(value = "roleId", required = false, defaultValue = "1") long roleId) {
        User oldUser = userService.findById(user.getId());
        if (result.hasErrors()) {
            user.setRole(oldUser.getRole());
            model.addAttribute("roles", roleService.findAll());
            return "user-update";
        }
        if (!passwordEncoder.matches(oldPassword, oldUser.getPassword())) {
            result.addError(new FieldError("user", "password", "Invalid old password"));
            user.setRole(oldUser.getRole());
            model.addAttribute("roles", roleService.findAll());
            return "user-update";
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setCreationDate(oldUser.getCreationDate());
        user.setRole(roleService.findById(roleId));
        userService.save(user);
        return "redirect:/user/";
    }

    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('READER') and authentication.principal.id == #id")
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id, Authentication authentication) {
        User user = (User) authentication.getPrincipal();
        if (Objects.equals(user.getId(), id)) {
            userService.remove(id);
            SecurityContextHolder.clearContext();
            return "redirect:/login";
        }
        userService.remove(id);
        return "redirect:/user";
    }

    @GetMapping("/cancel/{id}")
    public String cancel(@PathVariable Long id, Authentication authentication) {
        User user = (User) authentication.getPrincipal();
        RentInfo rentInfo = rentInfoService.findById(id);
        rentInfo.setRentStatus(RentStatus.CANCELED);
        rentInfoService.update(rentInfo);
        return "redirect:/user/" + user.getId();
    }

    @PreAuthorize("hasAnyAuthority('ADMIN', 'MANAGER')")
    @GetMapping("/debtor")
    public String getAllWithExpiredStatus(Model model) {
        List<User> users = userService.findAllWithExpiredStatus();
        model.addAttribute("users", users);
        return "debtor-list";
    }

    @GetMapping("/debtor/update")
    public String updateDebtors() {
        rentInfoService.updateDebtors();
        return "redirect:/user/debtor";
    }

    @PreAuthorize("hasAnyAuthority('ADMIN', 'MANAGER')")
    @GetMapping
    public String getAll(Model model) {
        List<User> users = userService.findAll();
        Integer averageAge = userService.averageAge();
        Integer averageTimeWorkingWithLibrary = userService.averageTimeWorkingWithLibrary();

        model.addAttribute("users", users);
        model.addAttribute("avgAge", averageAge);
        model.addAttribute("avgTime", averageTimeWorkingWithLibrary);
        return "user-list";
    }
}
