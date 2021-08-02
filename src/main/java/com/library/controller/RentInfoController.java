package com.library.controller;

import com.library.entity.RentInfo;
import com.library.entity.RentStatus;
import com.library.entity.User;
import com.library.service.BookService;
import com.library.service.RentInfoService;
import com.library.service.UserService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

@Controller
@RequestMapping("/rent-info")
public class RentInfoController {

    private final RentInfoService rentInfoService;
    private final BookService bookService;
    private final UserService userService;

    public RentInfoController(RentInfoService rentInfoService, BookService bookService, UserService userService) {
        this.rentInfoService = rentInfoService;
        this.bookService = bookService;
        this.userService = userService;
    }

    @GetMapping("/request/{id}/{user_id}")
    public String create(@PathVariable Long id, @PathVariable("user_id") Long userId) {
        RentInfo rentInfo = new RentInfo();
        rentInfo.setUser(userService.findById(userId));
        rentInfo.setBook(bookService.findById(id));
        rentInfo.setRentStatus(RentStatus.REQUESTED);
        rentInfo.setRentDate(LocalDateTime.now(ZoneId.of("Europe/Kiev")));
        rentInfo.setRequiredReturnDate(LocalDateTime.now(ZoneId.of("Europe/Kiev")).plusDays(30));
        rentInfoService.save(rentInfo);
        return "redirect:/";
    }

    @GetMapping("/return/{id}")
    public String returnBook(@PathVariable Long id, Authentication authentication) {
        User user = (User) authentication.getPrincipal();
        RentInfo rentInfo = rentInfoService.findById(id);
        rentInfo.setReturnDate(LocalDateTime.now(ZoneId.of("Europe/Kiev")));
        rentInfo.setRentStatus(RentStatus.RETURNED);
        rentInfoService.update(rentInfo);
        return "redirect:/user/" + user.getId();
    }

    @PreAuthorize("hasAnyAuthority('ADMIN', 'MANAGER')")
    @GetMapping("/give/{id}")
    public String give(@PathVariable Long id) {
        RentInfo rentInfo = rentInfoService.findById(id);
        rentInfo.setRentStatus(RentStatus.ACTIVE);
        rentInfoService.update(rentInfo);
        return "redirect:/rent-info";
    }

    @GetMapping("/cancel/{id}")
    public String cancel(@PathVariable Long id) {
        RentInfo rentInfo = rentInfoService.findById(id);
        rentInfo.setRentStatus(RentStatus.CANCELED);
        rentInfoService.update(rentInfo);
        return "redirect:/rent-info";
    }

    @PreAuthorize("hasAnyAuthority('ADMIN', 'MANAGER')")
    @GetMapping("/status/{rent-status}")
    public String getAllByRentStatus(@PathVariable(name = "rent-status") String rentStatus, Model model) {
        List<RentInfo> rentInfoList =
                rentInfoService.findByRentStatus(RentStatus.valueOf(RentStatus.class, rentStatus.toUpperCase()));
        model.addAttribute("rentInfoList", rentInfoList);
        return "rent-list";
    }

    @PreAuthorize("hasAnyAuthority('ADMIN', 'MANAGER')")
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        rentInfoService.remove(id);
        return "redirect:/rent-info";
    }

    @PreAuthorize("hasAnyAuthority('ADMIN', 'MANAGER')")
    @GetMapping
    public String getAll(Model model) {
        List<RentInfo> rentInfoList = rentInfoService.findAll();
        model.addAttribute("rentInfoList", rentInfoList);
        return "rent-list";
    }
}
