package com.library.controller;

import com.library.entity.RentInfo;
import com.library.entity.RentStatus;
import com.library.entity.User;
import com.library.service.RentInfoService;
import com.library.service.RoleService;
import com.library.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
    private final RoleService roleService;
    private final RentInfoService rentInfoService;

    public UserController(UserService userService, RoleService roleService, RentInfoService rentInfoService) {
        this.userService = userService;
        this.roleService = roleService;
        this.rentInfoService = rentInfoService;
    }

    @GetMapping("/create")
    public String create(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "user-form";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute User user) {
        user.setRole(roleService.findById(1L));
        user.setCreationDate(LocalDateTime.now(ZoneId.of("Europe/Kiev")));
        userService.save(user);
        return "redirect:/user/" + user.getId();
    }

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

    @GetMapping("/update/{id}")
    public String update(@PathVariable Long id, Model model) {
        User user = userService.findById(id);
        model.addAttribute("user", user);
        model.addAttribute("roles", roleService.findAll());
        return "user-update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute("user") User user,
                         @RequestParam(value = "roleId", required = false, defaultValue = "1") long roleId) {
        User oldUser = userService.findById(user.getId());
        user.setCreationDate(oldUser.getCreationDate());
        user.setRole(roleService.findById(roleId));
        userService.save(user);
        return "redirect:/user/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        userService.remove(id);
        return "redirect:/";
    }

    @GetMapping("/debtor")
    public String getAllWithExpiredStatus(Model model) {
        List<User> users = userService.findAllWithExpiredStatus();
        model.addAttribute("users", users);
        return "debtor-list";
    }

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
