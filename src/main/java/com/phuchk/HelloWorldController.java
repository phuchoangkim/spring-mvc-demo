package com.phuchk;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController{
	
	@RequestMapping("/show-hello-world-form-page")
	public String showHelloWordFormPage() {
		return "hello-world-form-page";
	}
	
	@RequestMapping("/show-hello-world-page")
	public String showHelloWordPage() {
		return "hello-world-page";
	}
	
	@RequestMapping("/using-spring-model")
	public String usingSpringModel(HttpServletRequest request, Model model) {
		
		// Get name
		String theName = request.getParameter("name");
		
		// Set output
		String output = "HI, " + theName.toUpperCase(); 
		
		// Create Model
		model.addAttribute("nameUsingModel", output);
		
		return "hello-world-page";
	}
	
	@RequestMapping("/using-request-param")
	public String usingRequestParam(@RequestParam("name") String theName, Model model ) {
		
		// Set output
		String output = "Hey, " + theName.toUpperCase();
		
		// Create model
		model.addAttribute("nameUsingRequestParam", output);
		
		return "hello-world-page";
		
	}
}