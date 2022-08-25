package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.UserService;
import com.example.demo.model.MessageResp;
import com.example.demo.model.UserInfo;

@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:4200")
public class UserController {
	
	@Autowired UserService us;
	@Autowired PasswordEncoder encode;
	
//	Register user
	
	@PostMapping("/register")
	@CrossOrigin("http://localhost:4200")
	public MessageResp registerUser(@RequestBody UserInfo u) {
		
		UserInfo existuseremail=us.validateByEmail(u.getEmail());
		UserInfo existusername=us.validateByUsername(u.getUsername());
		
		if(existuseremail==null) {
			
			if(existusername==null) {
				
				u.setPassword(encode.encode(u.getPassword()));
			
			return us.saveUser(u);
			}else {
				return new MessageResp("Username already exist,please try another...");
			}
			
		}else {
			return new MessageResp("Email already exist,please try another...");
		}
		
	}
	
	@PostMapping("/login")
	public UserDetails login(@RequestBody UserInfo u) {
		UserDetails ud=us.loadUserByUsername(u.getUsername());
		return ud;
		
		
	}
	
	
	
	
	
}
