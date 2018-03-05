package com.rahul.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rahul.service.demo.GenericWelcomeService;
import com.rahul.service.demo.WelcomeService;

@Controller
public class WelcomeController {
	
@Autowired
	private GenericWelcomeService welcomeService;
	@RequestMapping("/")
	// http://localhost:8080/spring-mvc-demo-1/
	public String doWelcome(Model model) {
		
//1.retriving the process data 
	//	WelcomeService welcomeService = new WelcomeService();
		List<String> welcomeMessage = welcomeService.getWelcomeMessage("rahul");
	
	//2. add data to attribute
		model.addAttribute("myWelcomeMessage",welcomeMessage);
		
		//3. return logical view name
		
		return "welcomeNew"; /// /WEB_INF/views/welcomeNew.jsp
		
	}
}
