import { Component, OnInit } from '@angular/core';
import {  Router } from '@angular/router';

import { MoviesService } from 'src/app/Services/movies.service';

@Component({
  selector: 'app-review',
  templateUrl: './review.component.html',
  styleUrls: ['./review.component.css']
})
export class ReviewComponent implements OnInit {

  constructor(private moviereview:MoviesService,private router:Router) { }

  movie:any=[]
  

 review={
  "characterDevelopmentScore": 0,
  "cinematographyScore": 0,
  "dramaScore": 0,
  "horrorScore": 0,
  "userInfo":Number(localStorage.getItem("uid")),
  "movie":Number(localStorage.getItem("movieTempId"))
 }
 result:any;

  ngOnInit(): void {
this.movie.movieid=localStorage.getItem("movieTempId");
this.movie.moviename=localStorage.getItem("movieTempName");

  }

reviewMovie(){

this.moviereview.save(this.review).subscribe(res=>{localStorage.setItem("reviewMsg",res.msg);this.router.navigate(["/movies"])})
}

}
