import {Component, Input, OnInit} from '@angular/core';
import {Todo} from '../Todo';
import {TodoService} from '../services/todo.service';

@Component({
  selector: 'app-task',
  templateUrl: './task.component.html',
  styleUrls: ['./task.component.scss']
})
export class TaskComponent implements OnInit {
  @Input() task: Todo | undefined;

  constructor(private service: TodoService) {}

  ngOnInit(): void {
  }

  check(): void {
    this.service.changeCheckTodo();
  }

  delete(): void {
    this.service.deleteTodo();
  }

  isToday(): boolean {
    const today = new Date();
    // @ts-ignore
    if(this.toString(today) === this.toString(this.task.date)) {
      return true;
    }
    else {
      return false;
    }
  }

  toString(date: Date): string {
    let day = '';
    let month = ''
    if (date.getDate() < 10) {
      day += '0';
    }
    if (date.getMonth() + 1 < 10) {
      month += '0';
    }
    return day + date.getDate() + ' / ' + month + (date.getMonth() + 1) + ' / ' + date.getFullYear();
  }

}
