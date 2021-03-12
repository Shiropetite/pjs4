import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Todo} from '../../Todo';

@Injectable({
  providedIn: 'root'
})
export class TodoService {
  url = 'http://localhost:8080/api/todos';

  constructor(
    private http: HttpClient
  ) { }

  getTodos(): Observable<Todo[]> {
    console.log('get todos');
    return this.http.get<Todo[]>(this.url);
  }

  addTodo(todo: Todo): Observable<Todo[]> {
    console.log('add todo');
    return this.http.post<Todo[]>(this.url, todo);
  }

  changeCheckTodo(todo: Todo | undefined): Observable<Todo[]> {
    console.log('check todo');
    return this.http.put<Todo[]>(this.url, todo);
  }

  deleteTodo(id: number): Observable<Todo[]> {
    console.log('delete todo');
    return this.http.delete<Todo[]>(this.url + '/' + id);
  }

}
