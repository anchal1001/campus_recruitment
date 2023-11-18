import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { User } from '../user';
import { HttpClient } from '@angular/common/http';
import { Router, RouterLink } from '@angular/router';
import { UserService } from '../service.service';
import { RoleService } from '../role.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css'],
})
export class RegisterComponent implements OnInit {



  user: User = new User();
  Roles:any = []
  areRolesAdded = false

  
  ngOnInit(){
    this.getApi()
    this.user.role = {role_id: 0}
  }
  fillAddress() {
  const filladdress = document.getElementById("filladdress") as HTMLInputElement;
    const addr = (document.getElementById("address") as HTMLInputElement).value;

    if (filladdress.checked) {
      const copyaddr = addr;
      (document.getElementById("permanentAddress") as HTMLInputElement).value = copyaddr;
    } else {
      (document.getElementById("permanentAddress") as HTMLInputElement).value = '';
    }
  }

  getAllRoles(){

  }

  getApi(){
    this.roleService.getAllRoles().subscribe({
      next: (roles)=>{
        this.Roles = roles
        this.areRolesAdded = true
      }
    })
  
  }


  // ('Group director-technology'),('Admin') ,('graphics designer'),('Admin') ,('cloud engineer'),
  // ('Group lead _buisness Development') ,('Quality Analyst '),('UI/UX designer') ,('Nurturance officer'),('Intern'),('program Analyst');
  

  register: FormGroup;
  constructor(
    private http: HttpClient,
    private router: Router,
    private userService: UserService,
    private roleService: RoleService
  ) {}
  onSubmit() {
    console.log('submitted');
    this.userService.registerUser(this.user).subscribe({
      next: (data) => {
       
      },
      complete: () => {
        console.log('complete');
        this.router.navigate(['/user']);
      },
      error: (err) => {
        console.log('error', err);
        alert(err.error)
     
      },
    });
  }



//   $(document).ready(function(){
//     $("#filladdress").on("click", function(){
//          if (this.checked) { 
//                 $("#permanentAddress").val($("#address").val());
             
//     else {
//         $("permanentAddress").val('');
               
//     }
//     });
// });
//  fillAddress()
//     {
//         if (filladdress.checked == true)
//         {
//             var addr = document.getElementById("address").value;
             

           
//             var copyaddr = addr;
            
            
//             document.getElementById("permanentAddress").value = copyaddr;
        
//         }
//         else if (filladdress.checked == false)
//         {
//             document.getElementById("permanentAddress").value = '';
 
//         }
//     }
}
