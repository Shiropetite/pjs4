import { Component, OnInit } from '@angular/core';
import { COURSES } from '../mock-courses';
import {Course} from '../course';
import {MatDialog} from '@angular/material/dialog';
import {CourseDetailsComponent} from '../course-details/course-details.component';
import {formatDate} from '@angular/common';

@Component({
  selector: 'app-courses',
  templateUrl: './courses.component.html',
  styleUrls: ['./courses.component.scss']
})
export class CoursesComponent implements OnInit {
  today: string;
  courses = COURSES;
  selectedCourse?: Course;

  constructor(public dialog: MatDialog) {}

  ngOnInit(): void {
    this.getDate();
  }

  getDate(): void {
    const day = formatDate(Date.now(), 'EEEE', 'fr');
    const dayNumber = formatDate(Date.now(), 'd', 'fr');
    const month = formatDate(Date.now(), 'MMMM', 'fr');

    // TODO : voir comment traiter les semaines
    this.today = 'Semaine 1 - ' + day.charAt(0).toUpperCase() + day.substring(1) + ' '
      + dayNumber + ' ' + month.charAt(0).toUpperCase() + month.substring(1);
  }

  openCourseDetailsDialog(selectedCourse: Course | undefined): void {
    this.dialog.open(CourseDetailsComponent,  {
      data : {
      }
    });
  }

  onSelect(course: Course): void {
    // @ts-ignore
    this.openCourseDetailsDialog();
    this.selectedCourse = course;
  }
}
