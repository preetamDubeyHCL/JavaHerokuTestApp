package com.java.github.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/****************************************************************************************
 * This controller is the main page of the Heroku Java UI 
 * This will be called everytime the Heroku Java webapp is loaded
 ****************************************************************************************/
@Controller
@RequestMapping("/")
public class WelcomePageController {
	public static String CURRENT_CLASS		 		= "WelcomePageController";
	/**
	 * This method gets called when the main page of the Heroku GDPR UI is called 
	 * @return  
	 */
	@RequestMapping(method = RequestMethod.GET, produces = "text/html")
	public String welcome(Model model) {
		String CURRENT_METHOD = "welcome";		
		System.out.println(CURRENT_CLASS+" ::: "+CURRENT_METHOD+":: Inside method");
		return "welcome";
	}
}