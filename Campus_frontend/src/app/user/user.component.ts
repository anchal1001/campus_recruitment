import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Router } from '@angular/router';

import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { User } from 'app/user';
import { UserService } from '../service.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})

export class UserComponent {

 user1 = localStorage.getItem('user')
 
 user: User = new User();
 //  
 // user!: User;
 
 // data: Object;
 
 
 constructor(private formBuilder: FormBuilder, private router: Router, private userService: UserService) {
    console.log("user ",this.user1);
  
    // this.user = this.userService.user;
  }



redirectToRegister() {
  this.router.navigate(['/register']);
}
// redirectToCategory() {
//   this.router.navigate(['/category']);}

redirectToAllCategory() {
  this.router.navigate(['/category-list']);
}


redirectToAllCollege() {
  this.router.navigate(['/college-list']);
}
  
// this.user.role=roleId;
//  this.user.var roleId=Object.entries(data)[2][1].roleId;
// name=Object.entries(data)[2][1].username;

// }

}


    // if (this.employeeForm.valid) {
 
  
