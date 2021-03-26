import { Injectable } from '@angular/core';
import {Observable} from 'rxjs';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class NotificationService {
  url = 'http://localhost:8080/api/notificationFeed';

  constructor( private http: HttpClient ) { }

  getNotifications(): Observable<Notification[]>{
    return this.http.get<Notification[]>(this.url + '/' + sessionStorage.getItem('id'));
  }
}
