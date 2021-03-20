import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { MDBBootstrapModule } from 'angular-bootstrap-md';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { NavbarComponent } from './navbar/navbar.component';
import { CoursesComponent } from './schedule-component/courses/courses.component';
import { TaskComponent } from './Todo-component/task/task.component';
import { TodoListComponent } from './Todo-component/todo-list/todo-list.component';
import { NewTaskComponent } from './Todo-component/new-task/new-task.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { NoopAnimationsModule, BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MaterialModule } from './material.module';
import {HttpClientModule} from '@angular/common/http';
import localeFr from '@angular/common/locales/fr';
import {registerLocaleData} from '@angular/common';
import {ScrollingModule} from '@angular/cdk/scrolling';
import { CourseDetailsComponent } from './schedule-component/course-details/course-details.component';

registerLocaleData(localeFr, 'fr');

@NgModule({
  declarations: [
    AppComponent,
    TaskComponent,
    TodoListComponent,
    NewTaskComponent,
    NavbarComponent,
    CoursesComponent,
    CourseDetailsComponent
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
