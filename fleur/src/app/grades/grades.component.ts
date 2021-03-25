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
  classes = CLASSES;
  enzoGrades = GRADES.findIndex(student => "Enzo");

  constructor() {

  }

  ngOnInit(): void {
  }


}
