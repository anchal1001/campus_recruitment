import { Component } from '@angular/core';
import { CollegeService } from '../college.service';
import { FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';
import { College } from 'app/college';
import { CategoryService } from 'app/category.service';

@Component({
  selector: 'app-college-list',
  templateUrl: './college-list.component.html',
  styleUrls: ['./college-list.component.css']
})
export class CollegeListComponent {
  id: number;

college:College= {
  collegeId: 0,
  collegeName: '',

  contactPerson: '',
  email : '',
  phoneNumber: 0,
  website: '',
  location: '',
  

  category: {
    categoryId: 0,
    // other properties of the category if any
  }


};
categories: any;
getAllCategories(){}

  // 
  
  // categoryService: any;
updateCollege() {
  this.collegeService.editCollegeById(this.id, this.college).subscribe({
    next:(data) => {
      console.log(data)
      console.log(this.categories)
      this.router.navigate(['/college-list']);
    },


    error:(err)=>{

      console.log(err)
    }
  }
  );}
// }
//   id(id: any, college: { collegeId: string; collegeName: string; contactPerson: string; email: string; phoneNumber: string; website: string; location: string; category: { categoryId: string; }; }) {
//     throw new Error('Method not implemented.');
//   }
onUpdateClick(college: College) {
this.college= college
}

deleteCollege(collegeId: number) {
  this.collegeService.deleteCollege(collegeId).subscribe( data => {
    console.log(data);
    // this.getAllCategory();
    window.location.reload();
    console.log('hello');
    
  })
}
  redirectToUserPage() {
    this.router.navigate(['/user']);
  }
  
  colleges: any[] = [];
  constructor(private formBuilder: FormBuilder, private router: Router,private collegeService: CollegeService, private categoryService: CategoryService) {
  
  }

  ngOnInit() {
    // this.getCategoryApi()
    // this.college.category={categoryId:0}
    if (this.categoryService) {
      this.getCategoryApi();
    } else {
      console.error('CategoryService is undefined or not properly injected.');
    }
    
    this.collegeService.getAllCollege().subscribe((data: any) => {
      this.colleges = data;
    });
  }
  redirectToCollege() {
    this.router.navigate(['/college']);}

    getCategoryApi(){
      this.categoryService.getAllCategory().subscribe({
        next:(data)=>{
          console.log(data);
          
          this.categories=data
        }
      })
  }

}
