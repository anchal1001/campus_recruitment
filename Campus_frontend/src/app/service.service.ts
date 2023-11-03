import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './user';

@Injectable({
  providedIn: 'root',
})
export class UserService {
  baseUrl = 'http://localhost:8888/api/user';

  constructor(private http: HttpClient) {}

  loginUser(email: string, password: string): Observable<Object> {
    return this.http.post(`${this.baseUrl}/login`, {
      email: email,
      password: password,
    });
  }

  registerUser(user: User): Observable<object> {
    console.log(user);
    return this.http.post(
      `${this.baseUrl}/registration`,
      {
        email: user.email,
        password: user.password,
        name: user.name,
        role: user.role
      },
      {
        responseType: 'json',
      }
    );
  }
}
