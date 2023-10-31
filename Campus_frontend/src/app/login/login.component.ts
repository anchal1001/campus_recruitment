import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../user';
import { UserService } from '../service.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})

export class LoginComponent {
  user: User = new User();

  model: any = {};
  getData: boolean;
  constructor(private userService:UserService,
    private router:Router) { }

  onLogin() {
    var email = this.model.email;
    var password = this.model.password;
    this.userService.loginUser(email, password).
    subscribe({

    }
     
    );
  }
}
