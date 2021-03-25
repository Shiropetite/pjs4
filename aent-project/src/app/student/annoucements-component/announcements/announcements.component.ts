import { Component, OnInit } from '@angular/core';
import {Announcement} from '../Announcement';
import {AnnouncementService} from '../service/announcement.service';

@Component({
  selector: 'app-announcements',
  templateUrl: './announcements.component.html',
  styleUrls: ['./announcements.component.css']
})
export class AnnouncementsComponent implements OnInit {
  announcements: Announcement[] = [];

  constructor(private serviceAnnouncement: AnnouncementService) {  }

  ngOnInit(): void {
    this.getAnnouncements();
  }

  getAnnouncements(): void {
    this.serviceAnnouncement.getAnnouncements().subscribe(
      (response) => this.announcements = response,
      () => this.announcements = []
    );
  }

  getAnnouncementsCount(): number {
    return this.announcements.length;
  }
}
