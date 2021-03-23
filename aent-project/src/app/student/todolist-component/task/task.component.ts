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

  ngOnInit(): void { }

  check(): void {
    this.service.changeCheckTodo(this.task).subscribe();
  }

  delete(): void {
    this.service.deleteTodo(this.task.id).subscribe();
    setTimeout(() => { location.reload(); }, 500);
  }

  isToday(): boolean {
    const today = new Date();
    if (today === this.task.date) {
      return true;
    }
    else {
      return false;
    }
  }

}
