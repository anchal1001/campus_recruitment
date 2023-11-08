import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { CategoryService } from '../category.service';

@Component({
  selector: 'app-category-list',
  templateUrl: './category-list.component.html',
  styleUrls: ['./category-list.component.css']
})
export class CategoryListComponent {
redirectToUserPage() {
  this.router.navigate(['/user']);
}



  categories: any[] = [];
  constructor(private formBuilder: FormBuilder, private router: Router,private categoryService: CategoryService) {
  
  }




  ngOnInit() {
    this.categoryService.getAllCategory().subscribe((data: any) => {
      this.categories = data;
    });
  }
  // getAllCategories() {
  //   // Replace 'your_api_endpoint/categories' with the actual API endpoint for fetching category data
  //   return this.http.get('your_api_endpoint/categories');
  // }
  
  redirectToCategory() {
    this.router.navigate(['/category']);}

}
