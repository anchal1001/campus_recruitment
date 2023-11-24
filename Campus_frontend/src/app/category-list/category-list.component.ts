import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { CategoryService } from '../category.service';
import { Observable } from 'rxjs';
import { category } from 'app/Category';

@Component({
  selector: 'app-category-list',
  templateUrl: './category-list.component.html',
  styleUrls: ['./category-list.component.css'],
})
export class CategoryListComponent {

  category = {
    categoryName: '',
    categoryRole: '',
    ctc: '',
  };

  categoryToUpdate = {
    categoryName: '',
    categoryRole: '',
    categoryCtc: '',
  };

  id: number;
  resclg: any[] = [];

  redirectToUserPage() {
    this.router.navigate(['/user']);
  }

  redirectToAllCollege() {
    this.router.navigate(['/college-list']);
  }

  categories: any[] = [];
  constructor(
    private formBuilder: FormBuilder,
    private router: Router,
    private categoryService: CategoryService
  ) {}

  ngOnInit() {
    // this.id = this.category.categoryId;
    this.categoryService.getAllCategory().subscribe((data: any) => {
      console.log('hi', data);
      this.categories = data;
      console.log(this.categories);
    });
  }
  // getAllCategories() {
  //   // Replace 'your_api_endpoint/categories' with the actual API endpoint for fetching category data
  //   return this.http.get('your_api_endpoint/categories');
  // }
  onUpdateClick(category:any){
    this.redirectToAllCategory();
    this.category = category
  }
  redirectToCategory() {
    this.router.navigate(['/category']);
  }

  onCollegeById(id: number) {
    console.log('category Clicked', id);
    this.categoryService.getCollegeByCampusId(id).subscribe({
      next: (res) => {
        this.resclg = res;
        console.log('RESPONSE === ,', res);
      },
    });
  }
  //  editCategory(categoryId:any) {
  //    this.categoryToUpdate =categoryId ;
  //  }

  // updateStudent(){
  //   console.log("category Clicked",this.category.categoryId);
  //   this.categoryService.editCampusById(this.categoryToUpdate).subscribe(
  //     (resp) => {
  //       console.log(resp);
  //     },
  //     (err) => {
  //       console.log(err);
  //     }
  //   );
  // }

  updateCategory() {
    this.categoryService.editCampusById(this.id, this.category).subscribe({
      next:(data) => {
        console.log(data)
        this.redirectToAllCategory();
      },
        complete: () => {
        console.log('complete update category');
     
        
        this.redirectToAllCategory();
        
      },
      error:(err)=>{
  
        console.log(err)
      }
    }
    );
  }
  redirectToAllCategory() {
    this.router.navigate(['/category-list']);
  }


  deleteCategory(categoryId: number){
    this.categoryService.deleteCategory(categoryId).subscribe( data => {
      console.log(data);
      // this.getAllCategory();
    })
  }
}
