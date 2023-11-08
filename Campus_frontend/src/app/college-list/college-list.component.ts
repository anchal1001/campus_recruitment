import { Component } from '@angular/core';
import { CollegeService } from '../college.service';
import { FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-college-list',
  templateUrl: './college-list.component.html',
  styleUrls: ['./college-list.component.css']
})
export class CollegeListComponent {
  colleges: any[] = [];
  constructor(private formBuilder: FormBuilder, private router: Router,private collegeService: CollegeService) {
  
  }

  ngOnInit() {
    this.collegeService.getAllCollege().subscribe((data: any) => {
      this.colleges = data;
    });
  }

}
