import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { RecruitedYear } from 'RecruitedYear';

@Injectable({
  providedIn: 'root',
})
export class SchedulerService {
  constructor(private http: HttpClient) {}

  baseurl = 'http://localhost:8888/api/recruitedyear';

  ScheduleDrive(recruitedyear: RecruitedYear) {
    return this.http.post(`${this.baseurl}/create`, {
      academicYear: recruitedyear.academicYear,
      category: [recruitedyear.category],
      college: [recruitedyear.college],
    });
  }
}
