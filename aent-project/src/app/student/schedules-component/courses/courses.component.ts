import { Component, OnInit } from '@angular/core';
import { COURSES } from '../mock-courses';
import {Course} from '../course';
import {MatDialog} from '@angular/material/dialog';
import {CourseDetailsComponent} from '../course-details/course-details.component';
import {formatDate} from '@angular/common';
import {CoursesService} from '../services/courses.service';

@Component({
  selector: 'app-courses',
  templateUrl: './courses.component.html',
  styleUrls: ['./courses.component.scss']
})
export class CoursesComponent implements OnInit {
  today: string;
  courses: Course[];
  selectedCourse?: Course;

  constructor(public dialog: MatDialog, private coursesService: CoursesService) {}

  ngOnInit(): void {
    this.getDate();
    this.coursesService.getTodayCourses().subscribe(courses => this.courses = courses);
  }

  toStringHours(course: Course): string {
    return course.date.getHours() + 'h' + ((course.date.getMinutes() < 10) ? '0' + course.date.getMinutes() : course.date.getMinutes());
  }

  getDate(): void {
    const day = formatDate(Date.now(), 'EEEE', 'fr');
    const dayNumber = formatDate(Date.now(), 'd', 'fr');
    const month = formatDate(Date.now(), 'MMMM', 'fr');

    // TODO : voir comment traiter les semaines
    this.today = 'Semaine 1 - ' + day.charAt(0).toUpperCase() + day.substring(1) + ' '
      + dayNumber + ' ' + month.charAt(0).toUpperCase() + month.substring(1);
  }

  openCourseDetailsDialog(): void {
    this.dialog.open(CourseDetailsComponent,  {
      data :  this.selectedCourse,
    });
  }

  onSelect(course: Course): void {
    if(course.id === null) {
      return;
    }
    this.selectedCourse = course;
    this.openCourseDetailsDialog();
  }
}
