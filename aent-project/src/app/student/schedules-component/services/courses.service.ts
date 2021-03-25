import { Injectable } from '@angular/core';
import {Observable, of} from 'rxjs';
import {Course} from '../course';
import {HOURS} from '../hours';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CoursesService {
  url = 'http://localhost:8080/api/course';

  constructor( private http: HttpClient ) { }

  getTodayCourses(): Observable<Course[]> {
    return this.http.get<Course[]>(this.url + '/' + sessionStorage.getItem('id'));
  }
}
