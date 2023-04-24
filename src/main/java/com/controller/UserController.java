package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.entity.UserEntity;
import com.repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	UserRepository userRepo;

	@GetMapping("/signup")
	public String signup() {
		System.out.println("====");
		return "Signup";
	}

	@PostMapping("/saveuser")
	public String saveUser(UserEntity user) {
		userRepo.save(user);
		return "Signup";
	}

	@GetMapping("/listusers")
	public String listUsers(Model model) {

		List<UserEntity> users = userRepo.findAll();
		model.addAttribute("users", users);
		return "ListUsers";
	}

	@GetMapping("/deleteuser")
	public String deleteUser(@RequestParam("userId") Integer userId) {
		userRepo.deleteById(userId);
		return "redirect:/listusers";
	}

	@GetMapping("/viewuser")
	public String viewUser(@RequestParam("userId") Integer userId, Model model) {
		UserEntity user = userRepo.findById(userId).get();
		model.addAttribute("user", user);
		return "ViewUser";
	}

}
