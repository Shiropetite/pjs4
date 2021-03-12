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
  selectedCourse?: Course;

  constructor(public dialog: MatDialog) {
  }

  openCourseDetailsDialog(selectedCourse: Course | undefined) {
    this.dialog.open(CourseDetailsComponent,  {
      data : {
      }
    });
  }

  ngOnInit(): void {
  }

  onSelect(course: Course): void {
    // @ts-ignore
    this.openCourseDetailsDialog();
    this.selectedCourse = course;
  }
}
