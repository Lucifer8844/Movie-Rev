package com.example.demo.Controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserInfo;

@RestController
@RequestMapping("/controller")
public class UserController {
	
	@GetMapping("/getUserDetails")
	public UserInfo getUserDetails()  { //this is the same name of the pojo class USerInfo class which contains in the UserInfo.java file
		UserInfo user=new UserInfo();
		
		user.setUserId("A101");
		user.setUsername("Sudarshan");
		user.setPassword("XYZ");//this straight away stores the values to the UserInfo into the String Password
		user.setEmail("Sudarshan@gmail.com");//this is the value that we are taking it from the USerinfo .java file and storing it into the variable "Email" in that file
		
		
		return user;
	}
	//The basic structure is given but the entire body/logic is not complete.
	@PostMapping(path= "/addUserDetails", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addEmployee(@RequestBody UserInfo user) throws Exception
    {
        //Logic to retrieve data from RequestBody
        System.out.println(user);
        //Extract data from user object
       
        return null;      
        //
    }
}
