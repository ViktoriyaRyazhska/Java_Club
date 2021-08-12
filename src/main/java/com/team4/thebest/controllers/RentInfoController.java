package com.team4.thebest.controllers;

import com.team4.thebest.models.RentInfo;
import com.team4.thebest.models.RentStatus;
import com.team4.thebest.services.BookService;
import com.team4.thebest.services.RentInfoService;
import com.team4.thebest.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.time.ZoneId;

@Controller
@RequestMapping("/rent-info")
@AllArgsConstructor
public class RentInfoController {

    private final RentInfoService rentInfoService;
    private final BookService bookService;
    private final UserService userService;

    @GetMapping("/request/{id}/{user_id}")
    public String create(@PathVariable Long id, @PathVariable("user_id") Long userId) {
        RentInfo rentInfo = new RentInfo();
        rentInfo.setUser(userService.findById(userId));
        rentInfo.setBook(bookService.findById(id));
        rentInfo.setRentStatus(RentStatus.REQUESTED);
        rentInfo.setRentDate(LocalDateTime.now(ZoneId.of("Europe/Kiev")));
        rentInfo.setRequiredReturnDate(LocalDateTime.now(ZoneId.of("Europe/Kiev")).plusDays(30));
        rentInfoService.save(rentInfo);
        return "redirect:/view-books";
    }

    @GetMapping("/return/{id}/{user_id}")
    public String returnBook(@PathVariable Long id, @PathVariable("user_id") Long userId) {
        RentInfo rentInfo = rentInfoService.findByBookIdAndUserId(id, userId);
        if (rentInfo != null) {
            rentInfo.setReturnDate(LocalDateTime.now(ZoneId.of("Europe/Kiev")));
            rentInfo.setRentStatus(RentStatus.RETURNED);
            rentInfoService.update(rentInfo);
        }
        return "redirect:/view-books";
    }
}
