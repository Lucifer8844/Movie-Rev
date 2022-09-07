import { Component, OnInit, TestabilityRegistry } from '@angular/core';
import { Router } from '@angular/router';
import { Movie } from 'src/app/classes/movie';
import { MoviesService } from 'src/app/Services/movies.service';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {


  movies:Movie[]=[]
  msg:any='';

  constructor(private movieserv:MoviesService,private router:Router) { }

  ngOnInit(): void {
this.movieserv.getMovieList().subscribe(res=>{this.movies=res;console.log(this.movies)})
if(localStorage.getItem("reviewMsg")!=undefined){
  alert(localStorage.getItem("reviewMsg"));
}
localStorage.removeItem("reviewMsg");

  }

  movie(data:any){
    localStorage.setItem("movieTempId",data.movieId);
    localStorage.setItem("movieTempName",data.moviename);
// let test=JSON.parse(data);

  
    
    localStorage.setItem("movie",JSON.stringify(data))
    this.router.navigate(["/review"]);
    
  }

}
