package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;
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
@Table(name="Movies")
public class Movies {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="movieId")
	Integer MovieId;
	@Column(name="description")
	String Description;
	@Column(name="movieName")
	String Moviename;
	
	String imgurl;
	
//	@OneToOne(targetEntity = Review.class)
//	
//	Integer reviewid;

//	public Integer getMovieId() {
//		return MovieId;
//	}
//
//	public void setMovieId(Integer movieId) {
//		MovieId = movieId;
//	}
//
//	public String getDescription() {
//		return Description;
//	}
//
//	public void setDescription(String description) {
//		Description = description;
//	}
//
//	public String getMoviename() {
//		return Moviename;
//	}
//
//	public void setMoviename(String moviename) {
//		Moviename = moviename;
//	}
//
//	public String getImgurl() {
//		return imgurl;
//	}
//
//	public void setImgurl(String imgurl) {
//		this.imgurl = imgurl;
//	}

	
	
	
	

}
