package com.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/Home")
public class HelloWorldController {

	@RequestMapping("/Welcome")
	public ModelAndView helloWorld() {
		String message = "sup";
		
		return new ModelAndView("welcome", "message", message);
	}
	
	@RequestMapping("/Test")
	@ResponseBody
	public String Test() {
		
		return "lul";
	}
}
