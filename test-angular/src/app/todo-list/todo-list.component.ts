import {Component, Input, OnInit, ViewChild, ViewChildren} from '@angular/core';
import {Todo} from '../Todo';
import {todos} from '../todos';
import {NewTaskComponent} from '../new-task/new-task.component';
import {MatDialog} from '@angular/material/dialog';

@Component({
  selector: 'app-todo-list',
  templateUrl: './todo-list.component.html',
  styleUrls: ['./todo-list.component.scss']
})
export class TodoListComponent implements OnInit {
  tasks: Todo[] = todos;
  todo: Todo | undefined;

  ngOnInit(): void {
  }

  constructor(public dialog: MatDialog) {}

  openDialog(): void {
    const dialogRef = this.dialog.open(NewTaskComponent, {
      width: '250px',
      data: {todo: this.todo}
    });

    dialogRef.afterClosed().subscribe(result => {
      console.log('The dialog was closed');
      this.tasks.push(result);
    });
  }


}
