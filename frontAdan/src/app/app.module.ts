import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {AnnouncementComponent} from './announcement/announcement.component';
import {NotificationComponent} from './notification/notification.component';
import {NoopAnimationsModule} from '@angular/platform-browser/animations';
import {MatCardModule} from '@angular/material/card';

import {AnnouncementsComponent} from './announcements/announcements.component';
import {NotificationsComponent} from './notifications/notifications.component';
import {registerLocaleData} from '@angular/common';
import localeFr from '@angular/common/locales/fr';

registerLocaleData(localeFr, 'fr');


@NgModule({
  declarations: [
    AppComponent,
    AnnouncementComponent,
    NotificationComponent,
    AnnouncementsComponent,
    NotificationsComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        NoopAnimationsModule,
        MatCardModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
