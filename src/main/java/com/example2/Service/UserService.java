package com.example2.Service;

import java.util.List;

import com.example2.Entity.User;


public interface UserService
{
	 User login(String userName, String userPassword);
	 List<User> getAllusers();
		
}
