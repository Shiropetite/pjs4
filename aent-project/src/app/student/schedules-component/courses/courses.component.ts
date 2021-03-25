import { Component, OnInit } from '@angular/core';
import {Course} from '../course';
import {MatDialog} from '@angular/material/dialog';
import {CourseDetailsComponent} from '../course-details/course-details.component';
import {formatDate} from '@angular/common';
import {CoursesService} from '../services/courses.service';
import {HOURS} from '../hours';

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
    setTimeout(() =>
    {
      // on vérifie s'il y a des trou et on comble avec des cours 'null'
      HOURS.forEach( (date) => {
        let course = null;
        this.courses.forEach((c) => {
          c.date = new Date(c.date);
          if (c.date.getHours() === date.getHours() && c.date.getMinutes() === date.getMinutes()) {
            course = c;
          }
        });
        if (course == null) {
          const d =  new Date(Date.now());
          d.setHours(date.getHours());
          d.setMinutes(date.getMinutes());
          d.setSeconds(date.getSeconds());
          this.courses.push({id: null, date: d,
            subject: null, teacher: '',  room: ''});
        }
      });

      // on trie les cours par ordre croissant de date
      this.courses.sort((course1, course2) => {
        // @ts-ignore
        return course1.date - course2.date;
      });
    }, 500);
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
    if (course.id === null) {
      return;
    }
    this.selectedCourse = course;
    this.openCourseDetailsDialog();
  }
}
