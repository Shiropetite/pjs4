import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {StudentHomeComponent} from './student/student-home/student-home.component';
import {LoginStudentComponent} from './connexion/login-student/login-student.component';
import {GradesComponent} from './student/grades-component/grades/grades.component';

const routes: Routes = [
  { path: '', redirectTo: '/login_student', pathMatch: 'full' },
  { path: 'login_student', component: LoginStudentComponent },
  { path: 'home_student/:id', component: StudentHomeComponent },
  { path: 'grades_student/:id', component: GradesComponent }
];

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule {}
