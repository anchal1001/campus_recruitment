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
import { UserService } from '../service.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})
export class LoginComponent {
  // currentUser: any;
  loginApiError: string;
  user: User = new User();
  login: FormGroup;
  data: Object;
  // toastr: any;

  // password: string = "";
  // username: string = "";

  constructor(
    private http: HttpClient,
    private router: Router,
    private userService: UserService
  ) {}

  onLogin() {

    console.log(this.user.email, this.user.password);
    this.userService.loginUser(this.user.email, this.user.password).subscribe({
      next: (data) => {
        console.log('data', data);
        
       var roleId=Object.entries(data)[2][1].roleId;
       this.user.role=roleId;
        this.user.name=Object.entries(data)[2][1].username;
        // $scope.userName=this.user.name;

        console.log('data',this.user);

        if(roleId==4) {

          this.router.navigate(['/user']);
        } else {
          //this.router.navigate(['/employee']);
          console.log('not admin');
        }
       
       
      },
      complete: () => {
        console.log('complete');
      },
      error: (err) => {
        console.log('error', err);
        alert((this.loginApiError = err.error.message));
        console.log(this.loginApiError);
        // alert("Login failed");
      },
    });
  }
}
