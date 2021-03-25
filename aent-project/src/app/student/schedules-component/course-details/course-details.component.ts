import { Component, OnInit, Inject } from '@angular/core';
import {MAT_DIALOG_DATA} from '@angular/material/dialog';
import { COURSES } from '../mock-courses';
import {Course} from '../course';


@Component({
  selector: 'app-course-details',
  templateUrl: './course-details.component.html',
  styleUrls: ['./course-details.component.scss']
})
export class CourseDetailsComponent implements OnInit {

  constructor(@Inject(MAT_DIALOG_DATA) public data: Course) { }

  ngOnInit(): void { }

}
