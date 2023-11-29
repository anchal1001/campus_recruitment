import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class RoundService {
  baseUrl = 'http://localhost:8888/api/round';

  constructor(private http: HttpClient) {}




  getAllRound(){
    return this.http.get(`${this.baseUrl}/getAll`)
  }
}
