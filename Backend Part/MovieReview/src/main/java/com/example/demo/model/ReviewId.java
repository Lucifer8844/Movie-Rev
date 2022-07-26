package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter

@AllArgsConstructor
@NoArgsConstructor

@Table(name="ReviewId")
public class ReviewId {
	
	@Id
	
	String ReviewId;
	Integer MovieName;
	Integer HorrorScore;
	Integer DramaScore;
	Integer CinematographyScore;
	Integer CharacterDevelopmentScore;
	

}
