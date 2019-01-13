import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';//to be added somewhere
import {HomeComponent} from './home/home.component';
import {AboutComponent} from './about/about.component';
import {RegisterComponent} from './register/register.component';
import {LoginComponent} from './login/login.component';
import { from } from 'rxjs';//what is this



const routes: Routes = [
  {path:'about', component:AboutComponent},
  {path:'home', component:HomeComponent},
  {path:'login', component:LoginComponent},
  {path:'register', component:RegisterComponent},
  
  {path:'**', component:HomeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }




