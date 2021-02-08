import {Component, Input, OnInit} from '@angular/core';
import {Todo} from '../Todo';

@Component({
  selector: 'app-task',
  templateUrl: './task.component.html',
  styleUrls: ['./task.component.scss']
})
export class TaskComponent implements OnInit {
  @Input() task: Todo | undefined;

  constructor() {}

  ngOnInit(): void {
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
    return date.getDate() + '/' + (date.getMonth() + 1) + '/' + date.getFullYear();
  }

}
