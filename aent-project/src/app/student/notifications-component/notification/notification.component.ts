import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-notification',
  templateUrl: './notification.component.html',
  styleUrls: ['./notification.component.css']
})
export class NotificationComponent implements OnInit {
notificationContent = 'J\'ai tout mangé le chocolat';
  constructor() { }

  ngOnInit(): void {
  }

}
