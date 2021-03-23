import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormControl, FormGroup} from '@angular/forms';
import {LoginService} from '../login.service';
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

    const id = this.serviceLogin.login(login, password);
    if (id !== 0) {
      sessionStorage.setItem('id', String(id));
      this.router.navigateByUrl('/home_student/' + id);
    }
  }

}
