package com.spring.MultipageMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@RequestMapping("/index")
	public String goIndex() {
		return "index";
	}
	@RequestMapping("/")
	public String goIndex1() {
		return "index";
	}

	/*
	 * @RequestMapping("/view") public String redirect() { return "viewpage"; }
	 * 
	 * @RequestMapping("/final") public String display() { return "final"; }
	 */

	@RequestMapping("/view")
	public String redirect(@RequestParam("name")String name,Model mod) {
		
		if(name.equals("admin"))
		{
			String msg ="Hello "+name;
			mod.addAttribute("user", msg);
			return "viewpage";
		}
		else {
			String msg ="Hello "+name;
			mod.addAttribute("user", msg);
			return "final";
		}
		
	}

}
