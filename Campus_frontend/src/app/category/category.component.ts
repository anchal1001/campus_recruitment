import { Component, OnInit } from '@angular/core';
import { category} from '../Category';
import { HttpClient } from '@angular/common/http';
import { CategoryService } from '../category.service';
import { Router, RouterLink } from '@angular/router';

@Component({
  selector: 'app-category',
  templateUrl: './category.component.html',
  styleUrls: ['./category.component.css']
})
export class CategoryComponent implements OnInit {

  category: category = new category();


ngOnInit(): void {

}
constructor(private http: HttpClient, private router: Router,
  private categoryService: CategoryService){}

  onSubmit() {
    console.log("implement")
    this.categoryService.addCategory(this.category).subscribe({
      next: (data) => {
        // this.router.navigate(['/user']);
      },
      complete: () => {
        console.log('complete');
      },
      error: (err) => {
        console.log('error', err);
      },
    });
    }

}
