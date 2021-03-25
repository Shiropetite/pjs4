import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Announcement} from '../Announcement';

@Injectable({
  providedIn: 'root'
})
export class AnnouncementService {
  url = 'http://localhost:8080/api/announcements';

  constructor( private http: HttpClient ) { }

  getAnnouncements(): Observable<Announcement[]> {
    return this.http.get<Announcement[]>(this.url + '/' + sessionStorage.getItem('id'));
  }

}
