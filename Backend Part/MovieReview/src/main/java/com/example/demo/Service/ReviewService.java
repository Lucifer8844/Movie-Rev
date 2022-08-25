package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Respository.ReviewRepository;

@Service
public class ReviewService {
	@Autowired
	ReviewRepository RevRepo;//creating reference variable for Repository class
	
	

}
