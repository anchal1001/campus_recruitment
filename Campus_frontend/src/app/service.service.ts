import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})

export class UserService {
  constructor(private http: HttpClient) {}

  loginUser(email: string, password: string):Observable<Object> {
    return this.http.post('http://localhost:8888/api/user/login', {
      email: email,
      password: password,
    });
  }
}
