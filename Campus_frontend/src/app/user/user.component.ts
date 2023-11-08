import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Router } from '@angular/router';

import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})

export class UserComponent {
redirectToAllCollege() {
  this.router.navigate(['/college-list']);
}




  constructor(private formBuilder: FormBuilder, private router: Router) {
  
  }
redirectToRegister() {
  this.router.navigate(['/register']);
}
// redirectToCategory() {
//   this.router.navigate(['/category']);}

redirectToAllCategory() {
  this.router.navigate(['/category-list']);
}

}







    // if (this.employeeForm.valid) {
   
  
