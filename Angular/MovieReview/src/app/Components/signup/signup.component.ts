import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/Services/user.service';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

user={
  "username":'',
"password":'',
"email":''
}

msg={
  "msg":''
};
data={
  "cpassword":'',
  "condition":''
};

  constructor(private userserv:UserService) { }

  ngOnInit(): void {
  }


  register(){

if(this.data.condition){


    if(this.user.password===this.data.cpassword){

    this.userserv.register(this.user).subscribe(res=>{this.msg=res;});
    }else{
      alert("Password not matched");
    }
  }else{
  alert("please accept term and condition first");
 
}

}
}
