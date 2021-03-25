import { Component, OnInit } from '@angular/core';
import {NotificationService} from '../service/notification.service';

@Component({
  selector: 'app-notifications',
  templateUrl: './notifications.component.html',
  styleUrls: ['./notifications.component.css']
})
export class NotificationsComponent implements OnInit {
  notifications: Notification[] | undefined;
  constructor(private service: NotificationService) {
  }

  ngOnInit(): void {
    this.getNotification();
  }

  getNotification(): void{
    this.service.getNotifications().subscribe(response => this.notifications = response);
  }
  getNotificationCount(): number | undefined{
    if (this.notifications === undefined){
      return 0;
    }
    return this.notifications?.length;
  }
}
