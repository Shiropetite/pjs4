import { Injectable } from '@angular/core';
import {Notification} from '../../Notification';
import {Observable, of} from 'rxjs';
import {notifications} from '../../mock-notifications';

@Injectable({
  providedIn: 'root'
})

export class NotificationsService {
  constructor() { }

  getNotifications(): Observable<Notification[]>{
        return of(notifications);
  }
}
