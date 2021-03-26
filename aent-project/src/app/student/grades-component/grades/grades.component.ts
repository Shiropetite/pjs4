import { Component, OnInit } from '@angular/core';
import {Semester} from '../semester';
import {Grade} from '../grade';
import {GradeService} from '../service/grade.service';

@Component({
  selector: 'app-grades',
  templateUrl: './grades.component.html',
  styleUrls: ['./grades.component.scss']
})
export class GradesComponent implements OnInit {
  grades: Grade[] = [];
  semesters: Semester[] = [];

  constructor(private service: GradeService) { }

  ngOnInit(): void {
    this.getGrades();
    setTimeout(() =>
    {
      this.getSemester();
    }, 500);
  }

  getGrades(): void {
    this.service.getTodos().subscribe(
      response => this.grades = response,
      error => this.grades = []);
  }

  getSemester(): void {
    this.grades.forEach((grade) => {
      const semester = grade.classes.ue.semester;
      if (!this.semesters.find(s => semester.id === s.id))  {
        this.semesters.push(semester);
      }
    });
  }

}
