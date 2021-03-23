import {Component, Input} from '@angular/core';
import {Notification} from '../Notification';


@Component({
  selector: 'app-notification',
  templateUrl: './notification.component.html',
  styleUrls: ['./notification.component.css']
})
export class NotificationComponent {
  @Input() notification: Notification | undefined ;

}
