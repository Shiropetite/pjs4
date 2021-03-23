import {Component, OnInit} from '@angular/core';
import {Announcement} from '../Announcement';
import {announcements} from '../mock-announcements';

@Component({
  selector: 'app-announcements',
  templateUrl: './announcements.component.html',
  styleUrls: ['./announcements.component.css']
})
export class AnnouncementsComponent implements OnInit {
  announcements: Announcement[] = announcements;
  constructor() {
  }

  ngOnInit(): void {
  }
}
