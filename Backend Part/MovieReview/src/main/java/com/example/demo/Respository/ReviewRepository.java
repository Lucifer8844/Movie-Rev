package com.example.demo.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Review;


public interface ReviewRepository extends JpaRepository<Review,Integer>{

}

