import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './Components/home/home.component';
import { LoginComponent } from './Components/login/login.component';
import { MoviesComponent } from './Components/movies/movies.component';
import { SignupComponent } from './Components/signup/signup.component';
import { ReviewComponent } from './Components/review/review.component';
import { AboutComponent } from './Components/about/about.component';

const routes: Routes = [
  {path:'login',component:LoginComponent},
{path:'register',component:SignupComponent,pathMatch:'full'},
{path:'movies',component:MoviesComponent,pathMatch:'full'},
{path:'review',component:ReviewComponent,pathMatch:'full'},
{path:'about',component:AboutComponent,pathMatch:'full'},

{path:'**',component:HomeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
