import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { CategoryService } from '../category.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-category-list',
  templateUrl: './category-list.component.html',
  styleUrls: ['./category-list.component.css']
})
export class CategoryListComponent {
id:number;
resclg: any[] = [];

redirectToUserPage() {
  this.router.navigate(['/user']);
}

redirectToAllCollege() {
  this.router.navigate(['/college-list']);
}



  categories: any[] = [];
  constructor(private formBuilder: FormBuilder, private router: Router,private categoryService: CategoryService) {
  
  }




  ngOnInit() {
    this.categoryService.getAllCategory().subscribe((data: any) => {
      this.categories = data;
      console.log(this.categories)
    });
  }
  // getAllCategories() {
  //   // Replace 'your_api_endpoint/categories' with the actual API endpoint for fetching category data
  //   return this.http.get('your_api_endpoint/categories');
  // }
  
  redirectToCategory() {
    this.router.navigate(['/category']);}

    onCollegeById(id:number){
      console.log("category Clicked",id);
      this.categoryService.getCollegeByCampusId(id).subscribe({
        next:(res)=>{
          this.resclg= res;
            console.log("RESPONSE === ,",res)
        }
      })
      
      //define your logic
    }

}
