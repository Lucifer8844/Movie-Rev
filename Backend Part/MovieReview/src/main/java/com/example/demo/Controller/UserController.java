package com.example.demo.Controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ReviewService;
import com.example.demo.model.UserInfo;

@RestController
@RequestMapping("/controller")
public class UserController {
	ReviewService RevSer;//creating a service class object
	
	@GetMapping("/getUserDetails")
	public UserInfo getUserDetails()  { //this is the same name of the pojo class USerInfo class which contains in the UserInfo.java file
		
		
		return null;
	}
	
	@PostMapping("/")
	public UserInfo function1() {
		
		return null;
		
	}
	/*
	//The basic structure is given but the entire body/logic is not complete.
	@PostMapping(path= "/addUserDetails", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addEmployee(@RequestBody UserInfo user) throws Exception
    {
        //Logic to retrieve data from RequestBody
        System.out.println(user);
        //Extract data from user object
       
        return null;      
        //
    }*/
}
