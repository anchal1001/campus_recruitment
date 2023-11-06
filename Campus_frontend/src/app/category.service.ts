import { Injectable } from '@angular/core';
import { category } from './Category';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CategoryService {
  baseUrl = 'http://localhost:8888/api/category';

  constructor(private http: HttpClient) { }

  addCategory(category: category): Observable<object> {
  console.log(category);
  return this.http.post(
    `${this.baseUrl}/create`,
    {
      categoryName: category.categoryName,
      categoryRole: category.categoryRole,
      ctc: category.ctc,
   

}
  )}
}



   
