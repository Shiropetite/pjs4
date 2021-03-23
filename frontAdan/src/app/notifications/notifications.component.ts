import {Component, OnInit} from '@angular/core';
import {Notification} from '../Notification';
import {NotificationsService} from './services/notifications.service';

@Component({
  selector: 'app-notifications',
  templateUrl: './notifications.component.html',
  styleUrls: ['./notifications.component.css']
})
export class NotificationsComponent implements OnInit {
  notifications: Notification[] | undefined;
  constructor(private service: NotificationsService) {
  }

  ngOnInit(): void {
    this.getNotification();
  }
  getNotification(): void{
    this.service.getNotifications().subscribe(response => this.notifications = response);
  }

}
