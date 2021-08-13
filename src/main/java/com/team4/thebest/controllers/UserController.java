package com.team4.thebest.controllers;

import com.team4.thebest.models.RentInfo;
import com.team4.thebest.models.User;
import com.team4.thebest.services.RentInfoService;
import com.team4.thebest.services.RoleService;
import com.team4.thebest.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;

@Controller
@AllArgsConstructor
public class UserController {

    private final UserService userService;
    private final RoleService roleService;
    private final PasswordEncoder encoder;
    private final RentInfoService rentInfoService;

    @PreAuthorize("hasAnyAuthority('ADMIN', 'MANAGER')")
    @GetMapping("/user-form")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "user/userform";
    }

    @PreAuthorize("hasAnyAuthority('ADMIN', 'MANAGER')")
    @PostMapping("user/save")
    public String save(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "user/userform";
        }
        if (userService.findByUsername(user.getUsername()).isPresent()) {
            model.addAttribute("notUnique", "Username taken");
            return "user/userform";
        }
        user.setPassword(encoder.encode(user.getPassword()));
        user.setRole(roleService.findById(1L));
        user.setCreationDate(LocalDateTime.now(ZoneId.of("Europe/Kiev")));
        userService.save(user);
        return "redirect:/view-users";
    }

    @PreAuthorize("hasAnyAuthority('ADMIN', 'MANAGER')")
    @GetMapping("/view-users")
    public String viewUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "user/viewusers";
    }

    @PreAuthorize("hasAnyAuthority('ADMIN', 'MANAGER')")
    @GetMapping("/edit-user/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("user", userService.getUserById(id));
        return "user/usereditform";
    }

    @PreAuthorize("hasAnyAuthority('ADMIN', 'MANAGER')")
    @PostMapping("/edit-savee")
    public String editSave(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "user/usereditform";
        }
        user.setRole(roleService.getByRoleType(user.getRole().getRoleType()));
        userService.update(user);
        return "redirect:/view-users";
    }

    @GetMapping("/delete-user/{id}")
    public String delete(@PathVariable Long id) {
        userService.delete(id);
        return "redirect:/view-users";
    }

    @GetMapping("user/search")
    public ModelAndView search(@RequestParam String keyword) {
        List<User> result = userService.search(keyword);
        ModelAndView modelAndView = new ModelAndView("user/viewusers");
        modelAndView.addObject("users", result);
        return modelAndView;
    }

    @PreAuthorize("hasAnyAuthority('ADMIN', 'MANAGER')")
    @GetMapping("user/{id}")
    public String read(@PathVariable Long id, Model model) {
        User user = userService.findById(id);

        Integer amountReadBooks = userService.amountReadBooks(id);
        Integer amountOfBooksUserIsReading = userService.amountOfBooksUserIsReading(id);
        Optional<Double> averageReadingTimeReturnedBooks = userService.readingTimeOfBooks(id);
        Integer daysClient = userService.daysOurClient(id);


        model.addAttribute("user", user);
        model.addAttribute("amountReadBooks", amountReadBooks);
        model.addAttribute("amountOfBooksUserIsReading", amountOfBooksUserIsReading);
        averageReadingTimeReturnedBooks
                .ifPresent(t -> model.addAttribute("averageReadingTimeReturnedBooks", t));
        model.addAttribute("daysClient", daysClient);

        return "user/userinfo";
    }

    @GetMapping("debtors")
    public ModelAndView getDebtors() {
        List<User> debtors = userService.getDebtors();
        ModelAndView modelAndView = new ModelAndView("user/viewusers");
        modelAndView.addObject("users", debtors);
        return modelAndView;
    }
}
