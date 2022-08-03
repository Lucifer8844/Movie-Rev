package com.example.demo.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.UserInfo;

public interface ReviewRepository extends JpaRepository<UserInfo,String>{

}
