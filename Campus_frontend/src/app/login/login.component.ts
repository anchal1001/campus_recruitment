// import { Component } from '@angular/core';
// import { Router } from '@angular/router';
// import { User } from '../user';
// import { UserService } from '../service.service';

// @Component({
//   selector: 'app-login',
//   templateUrl: './login.component.html',
//   styleUrls: ['./login.component.css'],
// })

// export class LoginComponent {
//   user: User = new User();

//   model: any = {};
//   getData: boolean;
//   constructor(private userService:UserService,
//     private router:Router) { }

//   onLogin() {
//     var email = this.model.email;
//     var password = this.model.password;
//     this.userService.loginUser(email, password).
//     subscribe({

//     }

//     );
//   }
// }
import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { FormBuilder, FormControl, FormGroup } from '@angular/forms';

import { Router, Routes } from '@angular/router';
import { User } from '../user';
import { ToastrService } from 'ngx-toastr';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})
export class LoginComponent {
  // currentUser: any;
  loginApiError: string;
  user: User = new User();
  login : FormGroup;
  // toastr: any;


  // password: string = "";
  // username: string = "";

  constructor(
    private http: HttpClient,
    private router: Router,
  ) {}

  onLogin() {
    console.log(this.user.email,this.user.password);
    this.http
      .post('http://localhost:8888/api/user/login', {
        email:this.user.email,
        password:this.user.password
      }, {
        responseType: 'json',
      })
      .subscribe({
        next: (data) => {
          console.log('data', data);
        
          this.router.navigate(['/user']);
        },
        complete: () => {
          console.log('complete');
        },
        error: (err) => {
          console.log('error', err);
          alert(this.loginApiError = err.error.message);
          console.log(this.loginApiError);
          // alert("Login failed");
        },
      });
  }
}
