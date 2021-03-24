import {Component, OnInit} from '@angular/core';
import {Announcement} from '../Announcement';
import {AnnouncementsService} from './services/announcements.service';


@Component({
  selector: 'app-announcements',
  templateUrl: './announcements.component.html',
  styleUrls: ['./announcements.component.css']
})
export class AnnouncementsComponent implements OnInit {
  announcements: Announcement[] | undefined;
  constructor(private service: AnnouncementsService) {
  }
  ngOnInit(): void {
    this.getAnnouncements();
  }
  getAnnouncements(): void{
    this.service.getAnnouncements().subscribe(response => this.announcements = response);
  }
  getAnnouncementsCount(): number | undefined{
    // tslint:disable-next-line:no-unused-expression
    return this.announcements?.length;
  }
}
