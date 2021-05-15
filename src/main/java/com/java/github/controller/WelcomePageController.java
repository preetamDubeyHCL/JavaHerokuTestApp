package com.java.github.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/****************************************************************************************
 * This controller is the main page of the Heroku Java UI 
 * This will be called everytime the Heroku Java webapp is loaded
 ****************************************************************************************/
@Controller
public class WelcomePageController {
	public static String CURRENT_CLASS		 		= "WelcomePageController";
	/**
	 * This method gets called when the main page of the Heroku GDPR UI is called 
	 * @return  
	 */
	@RequestMapping(value = {"/welcome", "/"})
	public String welcome(Model model) {
		String CURRENT_METHOD = "welcome";		
		System.out.println(CURRENT_CLASS+" ::: "+CURRENT_METHOD+":: Inside method");
		return "welcome";
	}
}