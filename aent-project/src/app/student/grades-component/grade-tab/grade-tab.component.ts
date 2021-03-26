import {Component, Input, OnInit} from '@angular/core';
import {Class} from '../class';
import {UE} from '../ue';
import {Grade} from '../grade';

@Component({
  selector: 'app-grade-tab',
  templateUrl: './grade-tab.component.html',
  styleUrls: ['./grade-tab.component.scss']
})
export class GradeTabComponent implements OnInit {
  ues: UE[] = [];
  classes: Class[] = [];
  @Input() grades: Grade[];


  constructor() {
  }

  ngOnInit(): void {
    this.getUE();
    console.log(this.ues);
    this.getClasse();
  }

  getGradesBtClasse(c: Class): Grade[] {
    const g = [];
    this.grades.forEach((grade) => {
      if (grade.classes.id === c.id) {
        g.push(grade);
      }
    });
    return g;
  }

  getClasseByUE(ue: UE): Class[] {
    const cl = [];
    this.classes.forEach((c) => {
      if (c.ue.id === ue.id) {
        cl.push(c);
      }
    });
    return cl;
  }

  getUE(): void {
    this.grades.forEach((grade) => {
      const ue = grade.classes.ue;
      if (!this.ues.find(s => ue.id === s.id)) {
        this.ues.push(ue);
      }
    });
  }

  getClasse(): void {
    this.grades.forEach((grade) => {
      const classe = grade.classes;
      if (!this.classes.find(s => classe.id === s.id)) {
        this.classes.push(classe);
      }
    });
  }

  calculMoyenne(classe: Class): number {
    let sum = 0;
    let divider = 0;
    this.classes.forEach((c) => {
      if(c.id === classe.id) {
        this.grades.forEach((grade) => {
          if (grade.classes.id === c.id) {
            sum += ((grade.grade * 20) / grade.divider) * grade.coef;
            divider += grade.coef;
          }
        });
      }
    });
    return (sum / divider);
  }

  calculMoyenneG(ue: UE): number {
    let sum = 0;
    let divider = 0;
    this.ues.forEach((u) => {
      if(ue.id === u.id) {
        this.classes.forEach((c) => {
          if (c.ue.id === u.id) {
            sum += this.calculMoyenne(c) * c.coeff;
            divider += c.coeff;
          }
        });
      }
    });
    return (sum / divider);
  }
}
