import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Student} from '../Student';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  url = 'http://localhost:8080/api/student';

  constructor( private http: HttpClient ) { }

  login(login: string, password: string): Observable<Student>  {
    return this.http.put<Student>(this.url, login + ',' + password);
  }

}
