import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/Services/user.service';
import { Router } from "@angular/router";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user={
    "username":'',
    "password":''
  }

  res:any;

  constructor(private userserv:UserService,private router:Router) { }

  ngOnInit(): void {
  }

  login(){
    
    this.userserv.doLogin(this.user).subscribe(
      result=>{
        this.res=result;
        if(this.res.username==this.user.username)
        {
          console.log(this.res);
          localStorage.setItem("uid",this.res.userid)
          localStorage.setItem("username",this.res.username)
          localStorage.setItem("user",JSON.stringify(this.res))
          
          this.router.navigate(["/movies"]);
        }
        else{
          console.log("unauthorize access");
        }
      });
  }


}
