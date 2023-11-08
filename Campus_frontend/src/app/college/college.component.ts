import { Component, OnInit } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { CategoryService } from '../category.service';
import { CollegeService } from '../college.service';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { College } from '../college';

@Component({
  selector: 'app-college',
  templateUrl: './college.component.html',
  styleUrls: ['./college.component.css']
})
export class CollegeComponent implements OnInit {

categories: any=[]




colleges: FormGroup
college: College =new College()
areCategoryAdded: false


constructor(
  private http: HttpClient,
  private router: Router,
  private collegeService: CollegeService,
  private categoryService: CategoryService
) {}
  // ngOnInit(): void {
  //   throw new Error('Method not implemented.');
  // }
  ngOnInit() {
   this.getCategoryApi()
   this.college.category={categoryId:0}
  }

  getAllCategories(){}


  getCategoryApi(){
    this.categoryService.getAllCategory().subscribe({
      next:(data)=>{
        console.log(data);
        
        this.categories=data
      }
    })
    
  }
onSubmit() {
  console.log('submitted');
  this.collegeService.registercollege(this.college).subscribe({
    next: (data) => {
    },
    complete: () => {
      console.log('complete');
    },
    error: (err) => {
      console.log('error', err);

      this.router.navigate(['/user']);
    },
  });
}

// }
}


