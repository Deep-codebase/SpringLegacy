package com.resources.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.resources.entity.Customer;
import com.resources.service.CustomerService;

@Controller
public class WelcomeController {

	@GetMapping("/login")
	 public String showloginPage() {
				
		return "login";
	}
}
