import {Component, OnInit} from '@angular/core';
import {Notification} from '../Notification';
import {notifications} from '../mock-notifications';

@Component({
  selector: 'app-notifications',
  templateUrl: './notifications.component.html',
  styleUrls: ['./notifications.component.css']
})
export class NotificationsComponent implements OnInit {
  notifications: Notification[] = notifications;
  constructor() {
  }

  ngOnInit(): void {
  }

}
