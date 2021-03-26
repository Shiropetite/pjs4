import { Component, OnInit } from '@angular/core';
import {GRADES} from '../mock-grades';
import {CLASSES} from '../mock-class';

@Component({
  selector: 'app-grades',
  templateUrl: './grades.component.html',
  styleUrls: ['./grades.component.scss']
})
export class GradesComponent implements OnInit {

  grades = GRADES;
  courses = CLASSES;


  constructor() {

  }

  ngOnInit(): void {
  }



}
