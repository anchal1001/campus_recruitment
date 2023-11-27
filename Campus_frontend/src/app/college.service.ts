import { Injectable } from '@angular/core';
import { College } from './college';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { category } from './Category';
import { co } from '@fullcalendar/core/internal-common';

@Injectable({
  providedIn: 'root'
})
export class CollegeService {
  // [x: string]: any;
  baseUrl = 'http://localhost:8888/api/college';

  constructor(private http: HttpClient) {}

  
  registercollege(college: College): Observable<object> {
    console.log(college);
    return this.http.post(
      `${this.baseUrl}/create`,
      
       
        { 
          collegeName: college.collegeName,
          contactPerson: college.contactPerson,
          email:college.email,
          phoneNumber:college.phoneNumber,
          website:college.website,
          location:college.location,

        
          category: college.category

        },
        {
          responseType: 'json',
        }
      );
  }
  getAllCollege(){
    return this.http.get(`${this.baseUrl}/getAll`)
  }

  editCollegeById(id: number,college: College): Observable<any>{
    const requestBody = {
      // categoryName: category.categoryName,
      // categoryRole: category.categoryRole,
      // ctc: category.ctc
      collegeId:college.collegeId,



     
      collegeName: college.collegeName,
      contactPerson: college.contactPerson,
      email: college.email,
      phoneNumber: college.phoneNumber,
      website: college.website,
      location: college.location,
      category: {
        categoryId: college.category.categoryId,
      }
    };
    
      return this.http.put(`${this.baseUrl}/update/${college.collegeId}`, requestBody);
    

  }
  
  deleteCollege(collegeId: number): Observable<Object>{
    return this.http.delete(`${this.baseUrl}/delete/${collegeId}`);

  }

  

}
  


