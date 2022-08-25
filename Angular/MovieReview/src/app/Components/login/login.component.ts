import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/Services/user.service';

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

  constructor(private userserv:UserService) { }

  ngOnInit(): void {
  }

  login(){
    
    this.userserv.doLogin(this.user).subscribe(result=>{this.res=result;console.log(this.res)});
  }


}
