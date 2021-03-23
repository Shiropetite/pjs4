import { Injectable } from '@angular/core';
import {Observable, of} from 'rxjs';
import {announcements} from '../../mock-announcements';
import {Announcement} from '../../Announcement';

@Injectable({
  providedIn: 'root'
})

export class AnnouncementsService {

  constructor() { }

  getAnnouncements(): Observable<Announcement[]>{
    return of(announcements);
  }
}
