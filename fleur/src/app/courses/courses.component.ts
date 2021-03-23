import { Component, OnInit } from '@angular/core';
import { COURSES } from '../mock-courses';
import {Course} from '../course';
import {MatDialog} from '@angular/material/dialog';
import {CourseDetailsComponent} from '../course-details/course-details.component';

@Component({
  selector: 'app-courses',
  templateUrl: './courses.component.html',
  styleUrls: ['./courses.component.scss']
})
export class CoursesComponent implements OnInit {

  courses = COURSES;
  selectedCourse: Course | undefined;

  constructor(public dialog: MatDialog) {
  }

  // Après tant de alt f4 c'est ça qui fonctionne
  openCourseDetailsDialog() {
    this.dialog.open(CourseDetailsComponent,  {
      data :  this.selectedCourse,
    });
  }

  ngOnInit(): void {
  }

  onSelect(course: Course): void {
    this.selectedCourse = course;
    // @ts-ignore
    this.openCourseDetailsDialog();
  }
}
