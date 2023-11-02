package com.example2.Controller;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example2.Entity.User;
import com.example2.Service.UserService;
import com.example2.ServiceImple.EmployeeServiceImple;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import javax.persistence.*;
import javax.servlet.ServletException;

@RestController
@RequestMapping("/user")
public class UserController   
{
	@Autowired
    private UserService userService;
	
	@Autowired
    private EmployeeServiceImple eservice;
	
	
	@PostMapping("/login")
	public String validate(@RequestBody User user) throws ServletException
	{
		String jwtToken="";
		if(user.getUserName()==null || user.getPassword()==null)
		{
			throw new ServletException("Please fill in username and password");
		}
		String userName=user.getUserName();
		String userPassword=user.getPassword();
		user=userService.login(userName, userPassword);
		
		if(user==null)
		{
			throw new ServletException("User not found");
		}
		jwtToken= Jwts.builder().setSubject(userName).claim("user",user.getUserName()).setIssuedAt(new Date()).
		signWith(SignatureAlgorithm.HS256, "secretkey").compact();
		return jwtToken;
	}
	
	@GetMapping("/users")
	public List<User> getAllusers(){
		return  userService.getAllusers();
	}
	
	@PostMapping("/addusers")
	public User addUser(@RequestBody User user)
	{
		return userService.addUser(user);
	}
	
	@PostMapping("/assigndepartment/{did}/{eid}")
	public String assignDepartmentToEmployee(@PathVariable int did,@PathVariable int eid)
	{
		return eservice.assignDepartmentToEmployee(did,eid);
	}
}
