import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { MDBBootstrapModule } from 'angular-bootstrap-md';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { NavbarComponent } from './student/navbar/navbar.component';
import { TaskComponent } from './student/todolist-component/task/task.component';
import { TodoListComponent } from './student/todolist-component/todo-list/todo-list.component';
import { NewTaskComponent } from './student/todolist-component/new-task/new-task.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { NoopAnimationsModule, BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MaterialModule } from './material.module';
import {HttpClientModule} from '@angular/common/http';
import localeFr from '@angular/common/locales/fr';
import {registerLocaleData} from '@angular/common';
import {ScrollingModule} from '@angular/cdk/scrolling';
import {CoursesComponent} from './student/schedules-component/courses/courses.component';
import {CourseDetailsComponent} from './student/schedules-component/course-details/course-details.component';
import {AnnouncementComponent} from './student/annoucements-component/announcement/announcement.component';
import {NotificationComponent} from './student/notifications-component/notification/notification.component';
import {NotificationsComponent} from './student/notifications-component/notifications/notifications.component';
import {AnnouncementsComponent} from './student/annoucements-component/announcements/announcements.component';
import { StudentHomeComponent } from './student/student-home/student-home.component';
import { LoginStudentComponent } from './connexion/login-student/login-student.component';
import { GradesComponent } from './student/grades-component/grades/grades.component';
import { GradeTabComponent } from './student/grades-component/grade-tab/grade-tab.component';


registerLocaleData(localeFr, 'fr');

@NgModule({
  declarations: [
    AppComponent,
    TaskComponent,
    TodoListComponent,
    NewTaskComponent,
    NavbarComponent,
    CoursesComponent,
    CourseDetailsComponent,
    AnnouncementComponent,
    AnnouncementComponent,
    NotificationComponent,
    NotificationsComponent,
    AnnouncementsComponent,
    StudentHomeComponent,
    LoginStudentComponent,
    GradesComponent,
    GradeTabComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MDBBootstrapModule.forRoot(),
    BrowserAnimationsModule,
    FormsModule,
    NgbModule,
    NoopAnimationsModule,
    MaterialModule,
    HttpClientModule,
    ReactiveFormsModule,
    ScrollingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
