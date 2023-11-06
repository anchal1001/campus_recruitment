import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { UserComponent } from './user/user.component';
import { RegisterComponent } from './register/register.component';
import { CollegeComponent } from './college/college.component';
import { CategoryComponent } from './category/category.component';


const routes: Routes = [
  { path:'', component:LoginComponent},
  { path:'user', component:UserComponent},
  { path:'register', component:RegisterComponent},
  { path:'category', component:CategoryComponent},
  { path:'college', component:CollegeComponent},



];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
