package com.java.github;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JavaHerokuApplication extends SpringBootServletInitializer {
	private static String CURRENT_CLASS		 		= "JavaHerokuApplication";
	
	/* (non-Javadoc)
	 * @see org.springframework.boot.web.support.SpringBootServletInitializer#configure(org.springframework.boot.builder.SpringApplicationBuilder)
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		String CURRENT_METHOD = "configure";		
		System.out.println(CURRENT_CLASS+" ::: "+CURRENT_METHOD+":: Inside method");
		
		setRegisterErrorPageFilter(false);
		return application.sources(JavaHerokuApplication.class);
	}
}
