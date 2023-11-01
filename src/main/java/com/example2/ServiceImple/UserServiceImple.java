package com.example2.ServiceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example2.Entity.User;
import com.example2.Repository.UserRepository;
import com.example2.Service.UserService;
import com.example2.Util.Converter;





@Service
public class  UserServiceImple implements UserService
{
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private Converter converter;
	
	
	
	@Override
	public User login(String userName, String userPassword) 
	{
		 User user=userRepository.findByUserNameAndPassword(userName, userPassword);
		 return user;
	}



	@Override
	public List<User> getAllusers() {
		List<User> users=userRepository.findAll();
		return users;
	}
	
	//@Transactional
	//public String sigUp(@RequestBody String username,@RequestBody String password ) {
		
	//}/
}








