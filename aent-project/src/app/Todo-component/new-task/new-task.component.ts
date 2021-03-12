import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';
import {Todo} from '../../Todo';


@Component({
  selector: 'app-new-task',
  templateUrl: './new-task.component.html',
  styleUrls: ['./new-task.component.scss']
})
export class NewTaskComponent implements OnInit {
  public error = '';

  constructor(
    public dialogRef: MatDialogRef<NewTaskComponent>,
    @Inject(MAT_DIALOG_DATA) public data: Todo) {}

  ngOnInit(): void {
  }

  onNoClick(): void {
    this.dialogRef.close();
  }

  onClick(data: Todo): void {
    if (data.date === undefined || data.description === undefined){
      this.error = 'error';
    }
    else {
      this.dialogRef.close(data);
      this.error = '';
    }

  }

}
