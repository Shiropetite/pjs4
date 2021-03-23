import {Component, Input} from '@angular/core';
import {Announcement} from '../Announcement';
import {announcements} from '../mock-announcements';

@Component({
  selector : 'app-announcement',
  templateUrl: './announcement.component.html',
  styleUrls: ['./announcement.component.css']
})
export class AnnouncementComponent {
  @Input() announcement: Announcement | undefined ;

}
