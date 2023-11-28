// import { Component } from '@angular/core';
// import dayGridPlugin from '@fullcalendar/daygrid';
// import { CalendarOptions,DateSelectArg,EventInput  } from '@fullcalendar/core';

import { ChangeDetectorRef, Component, signal, ViewChild, ElementRef, Renderer2 } from '@angular/core';
// import { Store } from '@ngrx/store';
import {
  CalendarOptions,
  DateSelectArg,
  EventApi,
  EventClickArg,
  EventInput,
} from '@fullcalendar/core';
import interactionPlugin from '@fullcalendar/interaction';
import dayGridPlugin from '@fullcalendar/daygrid';

// import timeGridPlugin from '@fullcalendar/timegrid';
// import listPlugin from '@fullcalendar/list';
// import { INITIAL_EVENTS, createEventId } from './event-utils';
import timeGridPlugin from '@fullcalendar/timegrid';
import listPlugin from '@fullcalendar/list';
import { INITIAL_EVENTS, createEventId } from './event-utils';
import { HttpClient } from '@angular/common/http';
import { CollegeService } from 'app/college.service';
import { CategoryService } from 'app/category.service';
import { Router } from '@angular/router';
import { CalendarModule } from 'primeng/calendar';
import { IDropdownSettings, } from 'ng-multiselect-dropdown';

@Component({
  selector: 'app-scheduler',
  templateUrl: './scheduler.component.html',
  styleUrls: ['./scheduler.component.css'],
})

export class SchedulerComponent {
selectedCategory: any;
selectedCollege: any;
onGenerateRoundSubmit(scheduleForm: any):void {
  this.selectedCategory = scheduleForm.value.category;
  this.selectedCollege = scheduleForm.value.college;
  console.log("scheduleForm value:",scheduleForm);
  
  // this.selectedCategory = scheduleForm.value.category;

}
  // scheduleEvent() {
  // throw new Error('Method not implemented.');
  // }
  id: number;
  @ViewChild('modalFakeBtn') modalBtn: ElementRef;
  categories: any = [];

  dateSelected = false;

  // college: College =new College()
  areCategoryAdded: false;
  category: any;
  resclg: any[] = [];

  ngOnInit() {
    this.getCategoryApi();
    //  this.college.category={categoryId:0}
  }

  getAllCategories() {}

  getCategoryApi() {
    this.categoryService.getAllCategory().subscribe({
      next: (data) => {
        console.log(data);

        this.categories = data;
      },
    });
  }

  calendarVisible = signal(true);
  calendarOptions = signal<CalendarOptions>({
    plugins: [interactionPlugin, dayGridPlugin, timeGridPlugin, listPlugin],
    headerToolbar: {
      left: 'prev,next today',
      center: 'title',
      right: 'dayGridMonth,timeGridWeek,timeGridDay,listWeek',
    },
    initialView: 'dayGridMonth',
    initialEvents: INITIAL_EVENTS, // alternatively, use the `events` setting to fetch from a feed
    weekends: true,
    editable: true,
    selectable: true,
    selectMirror: true,
    dayMaxEvents: true,
    select: this.handleDateSelect.bind(this),

    events: this.categories,

    eventClick: this.handleEventClick.bind(this),
    eventsSet: this.handleEvents.bind(this),
    /* you can update a remote database when these fire:
    eventAdd:
    eventChange:
    eventRemove:
    */
  });
  currentEvents = signal<EventApi[]>([]);

  constructor(
    private changeDetector: ChangeDetectorRef, // private http: HttpClient,
    private router: Router,
    private collegeService: CollegeService,
    private categoryService: CategoryService,
  ) {}

  handleCalendarToggle() {
    this.calendarVisible.update((bool) => !bool);
  }

  handleWeekendsToggle() {
    this.calendarOptions.mutate((options) => {
      options.weekends = !options.weekends;
    });
  }

  // previous one..kinda workng..
  //   handleDateSelect(selectInfo: DateSelectArg) {
  //     const title = prompt('Please enter a new title for your event');
  //     // const title = console.log("hey");
  //   const calendarApi = selectInfo.view.calendar;

  //     // $('#schedule-add').modal('show');
  // this.dateSelected=true
  //     // calendarApi.unselect(); // clear date selection

  //     if (title) {

  //       calendarApi.addEvent({
  //         id: createEventId(),
  //         title,
  //         start: selectInfo.startStr,
  //         end: selectInfo.endStr,
  //         allDay: selectInfo.allDay
  //       });
  //     }

  //   }
  onCollegeById(id: number) {
    console.log('category Clicked', id);
    this.categoryService.getCollegeByCampusId(id).subscribe({
      next: (res) => {
        this.resclg = res;
        console.log('RESPONSE === ,', res);
      },
    });
  }

  // new one..
  handleDateSelect(selectInfo: DateSelectArg) {
    console.log('here...');
    this.modalBtn.nativeElement.click()
  }

  handleEventClick(clickInfo: EventClickArg) {
    if (
      confirm(
        `Are you sure you want to delete the event '${clickInfo.event.title}'`
      )
    ) {
      clickInfo.event.remove();
    }
  }

  handleEvents(events: EventApi[]) {
    this.currentEvents.set(events);
    this.changeDetector.detectChanges(); // workaround for pressionChangedAfterItHasBeenCheckedError
  }
}

// Example usage
// const options = ['Option 1', 'Option 2', 'Option 3'];
// createCustomSelector(options);
