import {Component, Input, OnInit} from '@angular/core';
import {Notification} from '../Notification';

@Component({
  selector: 'app-notification',
  templateUrl: './notification.component.html',
  styleUrls: ['./notification.component.css']
})
export class NotificationComponent implements OnInit {
  @Input() notification: Notification;

  constructor() { }

  ngOnInit(): void {
  }

}
