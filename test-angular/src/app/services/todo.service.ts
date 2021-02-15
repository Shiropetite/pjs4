import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class TodoService {

  constructor() { }

  addTodo(): void {
    console.log('add todo');
  }

  changeCheckTodo(): void {
    console.log('check todo');
  }

  deleteTodo(): void {
    console.log('delete todo');
  }

}
