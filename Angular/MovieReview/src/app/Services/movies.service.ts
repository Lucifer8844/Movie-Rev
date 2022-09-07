import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Review } from '../classes/review';

@Injectable({
  providedIn: 'root'
})
export class MoviesService {
  

  constructor(private http:HttpClient) { }

getMovieList():Observable<any>
{
  return this.http.get("http://localhost:9090/movies/list");
}
save(data: any):Observable<any>{

  console.log(data)
  return this.http.post("http://localhost:9090/review/save",data);
  
}

}
