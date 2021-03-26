import {Component, Input, OnInit, ViewChild, ViewChildren} from '@angular/core';
import {Todo} from '../Todo';
import {NewTaskComponent} from '../new-task/new-task.component';
import {MatDialog} from '@angular/material/dialog';
import {TodoService} from '../services/todo.service';

@Component({
  selector: 'app-todo-list',
  templateUrl: './todo-list.component.html',
  styleUrls: ['./todo-list.component.scss']
})
export class TodoListComponent implements OnInit {
  tasks: Todo[] = [];
  todo: Todo | undefined;

  ngOnInit(): void {
  }

  constructor(public dialog: MatDialog, private service: TodoService) {
    this.getTodos();
  }

  openDialog(): void {
    const dialogRef = this.dialog.open(NewTaskComponent, {
      width: '250px',
      data: {todo: this.todo}
    });

    dialogRef.afterClosed().subscribe(result => {
      if (result !== undefined) {
        this.service.addTodo(result).subscribe();
        setTimeout(() =>
          {
            this.getTodos();
          }, 700);
      }
    });
  }


  getTodos(): void {
    this.service.getTodos().subscribe(
      response => this.tasks = response,
      error => this.tasks = []
    );
  }

}
