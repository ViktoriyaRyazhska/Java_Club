package com.softserve.team5.controller;

import java.sql.Date;
import java.time.LocalDate;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.softserve.team5.entity.JournalStatus;
import com.softserve.team5.entity.User;
import com.softserve.team5.service.interfaces.JournalService;
import com.softserve.team5.service.interfaces.RolesService;
import com.softserve.team5.service.interfaces.UserService;

@Controller
@RequestMapping("/users")
@ComponentScan("com.softserve.team5")
public class UserController {

	private final UserService userService;
	private final JournalService journalService;
	private final RolesService rolesService;
	private final PasswordEncoder passwordEncoder;

	
	@Autowired
	public UserController(UserService userService, JournalService journalService, RolesService rolesService,
			PasswordEncoder passwordEncoder) {
		this.userService = userService;
		this.journalService = journalService;
		this.rolesService = rolesService;
		this.passwordEncoder = passwordEncoder;
	}

	@GetMapping()
	public String allUsers(Model model) {
		model.addAttribute("users", userService.getAllEntities());
		return "users/allUsers";
	}

	@GetMapping("/{id}")
	public String showOneUser(@PathVariable("id") Long id, Model model) {
		model.addAttribute("user", userService.getById(id));
		return "/users/oneUser";
	}

	@DeleteMapping("/{id}")
	public String deleteUser(@PathVariable Long id, Model model) {
		userService.delete(id);
		model.addAttribute("users", userService.getAllEntities());
		return "/users/allUsers";
	}

	@GetMapping("/{id}/statistics")
	public String statisticUser(@PathVariable("id") Long id, Model model) {
		model.addAttribute("user", userService.getById(id));
		model.addAttribute("hasRead", journalService.getBooksByUser(id, JournalStatus.RETURNED));
		model.addAttribute("currReading", journalService.getBooksByUser(id, JournalStatus.GIVEN));
		model.addAttribute("clientFor", userService.isClientFor(id));
		return "users/statisticUser";
	}

	@GetMapping("/{id}/edit")
	public String editUser(@PathVariable("id") Long id, Model model) {
		model.addAttribute("user", userService.getById(id));
		return "users/editUser";
	}

	@PatchMapping("/{id}")
	public String update(@ModelAttribute("user") @Valid User user, BindingResult bindingResult,
			@PathVariable("id") Long id) {
		if (user.getBirthday() == null) {
			bindingResult.addError(new FieldError("user", "birthday", "Enter the full date"));
		}
		if (bindingResult.hasErrors()) {
			return "users/newUser";
		}
		userService.update(user, id);
		return "redirect:/users";
	}

	@GetMapping("/newUser")
	public String newUser(@ModelAttribute("user") User user) {
		return "users/newUser";
	}

	@PostMapping()
	public String create(@ModelAttribute("user") @Valid User user, BindingResult bindingResult) {
		if (user.getBirthday() == null) {
			bindingResult.addError(new FieldError("user", "birthday", "Enter the full date"));
		}
		if (bindingResult.hasErrors()) {
			return "users/newUser";
		}
		user.setRole(rolesService.getById(1L));
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		user.setRegistrationDate(Date.valueOf(LocalDate.now()));
		userService.create(user);
		return "redirect:/users";
	}

}
