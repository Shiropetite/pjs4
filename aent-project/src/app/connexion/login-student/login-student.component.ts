import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormControl, FormGroup} from '@angular/forms';
import {LoginService} from '../service/login.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login-student',
  templateUrl: './login-student.component.html',
  styleUrls: ['./login-student.component.scss']
})
export class LoginStudentComponent implements OnInit {
  loginForm: FormGroup;

  constructor(private fB: FormBuilder, private serviceLogin: LoginService, private router: Router) { }

  ngOnInit(): void {
    this.initForm();
  }

  initForm(): void {
    this.loginForm = this.fB.group({
      login: '',
      password: ''
    });
  }

  onSubmit(): void {
    const login = this.loginForm.value.login;
    const password = this.loginForm.value.password;
    let student = null;
    this.serviceLogin.login(login, password).subscribe(response => student = response);
    setTimeout(() =>
    {
      if (student != null) {
        sessionStorage.setItem('id', student.id);
        sessionStorage.setItem('email', student.email);
        sessionStorage.setItem('nom', student.nom);
        sessionStorage.setItem('prenom', student.prenom);

        this.router.navigateByUrl(('/home_student/' + student.id));
      }
    }, 500);
  }

}
