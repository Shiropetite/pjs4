import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable, of} from 'rxjs';
import {Todo} from '../Todo';

@Injectable({
  providedIn: 'root'
})
export class TodoService {
  url = 'http://localhost:8080/api/todos';

  constructor( private http: HttpClient ) { }

  getTodos(): Observable<Todo[]> {
    return this.http.get<Todo[]>(this.url + '/' + sessionStorage.getItem('id'));
  }

  addTodo(todo: Todo): Observable<Todo[]> {
    return this.http.post<Todo[]>(this.url + '/' + sessionStorage.getItem('id'), todo);
  }

  changeCheckTodo(todo: Todo | undefined): Observable<Todo[]> {
    return this.http.put<Todo[]>(this.url, todo);
  }

  deleteTodo(id: number): Observable<Todo[]> {
    return this.http.delete<Todo[]>(this.url + '/' + id);
  }

}
