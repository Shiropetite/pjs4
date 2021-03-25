import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { MDBBootstrapModule } from 'angular-bootstrap-md';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { NavbarComponent } from './navbar/navbar.component';
import { DateComponent } from './date/date.component';
import { CoursesComponent } from './courses/courses.component';
import { NotificationsComponent } from './notifications/notifications.component';
import { TodolistComponent } from './todolist/todolist.component';
import { AnnouncementsComponent } from './announcements/announcements.component';
import { registerLocaleData } from '@angular/common';
import localeFr from '@angular/common/locales/fr';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MaterialModule} from './material/material.module';
registerLocaleData(localeFr, 'fr');
import {ScrollingModule} from '@angular/cdk/scrolling';
import { CourseDetailsComponent } from './course-details/course-details.component';
import { GradesComponent } from './grades/grades.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    DateComponent,
    CoursesComponent,
    NotificationsComponent,
    TodolistComponent,
    AnnouncementsComponent,
    CourseDetailsComponent,
    GradesComponent
  ],
  entryComponents:[CourseDetailsComponent],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    MDBBootstrapModule.forRoot(),
    BrowserAnimationsModule,
    MaterialModule,
    ReactiveFormsModule,
    ScrollingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}
