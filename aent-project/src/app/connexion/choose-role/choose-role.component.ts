import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-choose-role',
  templateUrl: './choose-role.component.html',
  styleUrls: ['./choose-role.component.scss']
})
export class ChooseRoleComponent implements OnInit {

  constructor() { }

  ngOnInit(): void { }

  connectToProfessor(): void {
    sessionStorage.setItem('role', 'professor');
  }

  connectToStudent(): void {
    sessionStorage.setItem('role', 'student');
  }
}
