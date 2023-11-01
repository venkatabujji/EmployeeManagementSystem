package com.example2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.example2.config.JwtFilter;



@SpringBootApplication
public class Ems1Application {

	@SuppressWarnings("rawtypes")
	@Bean
	public FilterRegistrationBean jwtFilter()
	{
		final FilterRegistrationBean registrationBean=new FilterRegistrationBean();
			registrationBean.setFilter(new JwtFilter());
		   registrationBean.addUrlPatterns("/api/*");
			return registrationBean;
	
	}
	public static void main(String[] args) {
		SpringApplication.run(Ems1Application.class, args);
	}

}
