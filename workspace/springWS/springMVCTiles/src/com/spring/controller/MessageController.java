package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MessageController {
	
	@RequestMapping("/msg")
	public String goMessage(Model m)
	{
		String message = "Hello User";  
		m.addAttribute("message",message); 
		return "msg";
	}
	

}
