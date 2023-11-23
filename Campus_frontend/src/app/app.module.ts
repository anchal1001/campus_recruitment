import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { ToastrModule } from 'ngx-toastr';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { LoginComponent } from './login/login.component';
import { UserComponent } from './user/user.component';
import { CommonModule } from '@angular/common';
import { FormsModule }   from '@angular/forms';
import { RegisterComponent } from './register/register.component';
import { CategoryComponent } from './category/category.component';
import { CollegeComponent } from './college/college.component';
import { CollegeListComponent } from './college-list/college-list.component';
import { CategoryListComponent } from './category-list/category-list.component';
// import { SchedulerComponent } from './scheduler/scheduler.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import {DayPilotModule} from "daypilot-pro-angular";
import { SchedulerComponent } from './scheduler/scheduler.component';
import { FullCalendarModule } from '@fullcalendar/angular';
import interactionPlugin from '@fullcalendar/interaction';
import daygridPlugin from '@fullcalendar/daygrid';
// import { StoreModule } from '@ngrx/store';
// import { CalendarFeature } from './reducer';

// FullCalendarModule.registerPlugins([interactionPlugin,daygridPlugin

// ])

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    UserComponent,
    RegisterComponent,
    CategoryComponent,
    CollegeComponent,
    CollegeListComponent,
    CategoryListComponent,
    SchedulerComponent,
    // SchedulerComponent,
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
    CommonModule,
    ToastrModule.forRoot(),
    FormsModule,
    NgbModule,
    FullCalendarModule  
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
