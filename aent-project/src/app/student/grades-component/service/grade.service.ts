import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Grade} from '../grade';

@Injectable({
  providedIn: 'root'
})
export class GradeService {
  url = 'http://localhost:8080/api/grades';

  constructor( private http: HttpClient ) { }

  getTodos(): Observable<Grade[]> {
    return this.http.get<Grade[]>(this.url + '/' + sessionStorage.getItem('id'));
  }
}
