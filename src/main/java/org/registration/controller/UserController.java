package org.registration.controller;

import org.registration.entity.User;
import org.registration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController
{
	@Autowired
	UserService service;
	
	@GetMapping("/")
	public String register(Model m)
	{
		User user = new User();
		m.addAttribute("user", user);
		return "register";
	}
	@PostMapping("/registerUser")
	public String registerUser(@ModelAttribute("user") User user)
	  {
		System.out.println(user);
		
		if(user.getPass().equals(user.getConfPass()))
		{
			service.registerUser(user);
			return "home";
		}
		else		
		     return "err";
	}	
}