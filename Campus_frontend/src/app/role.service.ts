import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";

@Injectable(
    {
        providedIn: 'root',
      }
)
export class RoleService{
    baseUrl = 'http://localhost:8888/api/roles';

  constructor(private http: HttpClient) {}

  getAllRoles(){
    return this.http.get(this.baseUrl)
  }

}