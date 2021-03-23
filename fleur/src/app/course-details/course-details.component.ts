import { Component, OnInit, Inject } from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';
import { COURSES } from '../mock-courses';
import {Course} from '../course';
import {CoursesComponent} from '../courses/courses.component';


@Component({
  selector: 'app-course-details',
  templateUrl: './course-details.component.html',
  styleUrls: ['./course-details.component.scss']
})
export class CourseDetailsComponent implements OnInit {


  displayedColumns: string[] = [ 'hour', 'name', 'room', 'teacher'];
  courses = COURSES;


  constructor(
    @Inject(MAT_DIALOG_DATA) public data: Course) {

  }

  ngOnInit(): void {
    console.log(this.data);

  }


}
