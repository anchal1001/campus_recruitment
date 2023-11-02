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



  constructor(private formBuilder: FormBuilder, private router: Router) {
  
  }
redirectToRegister() {
  this.router.navigate(['/register']);
}
}






    // if (this.employeeForm.valid) {
   
  
