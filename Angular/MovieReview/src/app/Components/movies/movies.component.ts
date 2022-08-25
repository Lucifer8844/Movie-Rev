import { Component, OnInit } from '@angular/core';
import { Movie } from 'src/app/classes/movie';
import { MoviesService } from 'src/app/Services/movies.service';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {


  movies:Movie[]=[]

  constructor(private movieserv:MoviesService) { }

  ngOnInit(): void {
this.movieserv.getMovieList().subscribe(res=>{this.movies=res;console.log(this.movies)})

  }

}
