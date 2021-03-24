import { Injectable } from '@angular/core';
import {Observable, of} from 'rxjs';
import {notifications} from '../mock-notifications';

@Injectable({
  providedIn: 'root'
})
export class NotificationService {

  constructor() { }

  getNotifications(): Observable<Notification[]>{
    // @ts-ignore
    return of(notifications);
  }
}
