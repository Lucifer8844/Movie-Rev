package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter  //Setters and getter methods from lombok
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity

@Table(name="USerInfo")
public class UserInfo {
	//table name/pojo class this directly goes to the UserController.java there in the getmapping part for getting the details
		//contains the entity of table or the columns of the tables
		
		@Id //specifies that it is a primary key
		@GeneratedValue(strategy = GenerationType.AUTO)//This specifies that the USerId will be generated automatically
		String UserId;
		String Username;
		String Password;
		String Email;
		String ReviewId;

}
