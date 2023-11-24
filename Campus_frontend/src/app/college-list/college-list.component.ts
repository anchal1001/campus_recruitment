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

college = {
  collegeName: '',

  contactPerson: '',
  email : '',
  phoneNumber: '',
  website: '',
  location: '',
  
   category: {
       categoryId:'',
   }
};
categories: any;
updateCollege() {
throw new Error('Method not implemented.');
}
onUpdateClick(_t18: any) {
throw new Error('Method not implemented.');
}
editCollege(arg0: any) {
throw new Error('Method not implemented.');
}
deleteCollege(arg0: any) {
throw new Error('Method not implemented.');
}
  redirectToUserPage() {
    this.router.navigate(['/user']);
  }
  
  colleges: any[] = [];
  constructor(private formBuilder: FormBuilder, private router: Router,private collegeService: CollegeService) {
  
  }

  ngOnInit() {
    this.collegeService.getAllCollege().subscribe((data: any) => {
      this.colleges = data;
    });
  }
  redirectToCollege() {
    this.router.navigate(['/college']);}

}
