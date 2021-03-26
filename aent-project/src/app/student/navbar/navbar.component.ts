import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss']
})
export class NavbarComponent implements OnInit {
  name = sessionStorage.getItem('prenom');
  id = sessionStorage.getItem('id');

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  deconnexion(): void {
    sessionStorage.clear();
  }

  goToGrades(): void {
    this.router.navigateByUrl('grades_student/' + this.id);
  }

  goToHome(): void {
    this.router.navigateByUrl('home_student/' + this.id);
  }
}
