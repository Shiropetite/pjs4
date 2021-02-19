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
  tasks: Todo[] | undefined;
  todo: Todo | undefined;
  error: string | undefined;

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
      this.service.addTodo(result).subscribe();
      this.getTodos();
    });
  }

  getTodos(): void {
    console.log(this.service.getTodos().subscribe(
      response => this.tasks = response,
      // TODO : faire qqlchose quand erreur
      error => this.error = error
    ));
  }

}
