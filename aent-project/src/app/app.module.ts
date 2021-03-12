import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {FormsModule} from '@angular/forms';
import { TaskComponent } from './Todo-component/task/task.component';
import { TodoListComponent } from './Todo-component/todo-list/todo-list.component';
import { NewTaskComponent } from './Todo-component/new-task/new-task.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { NoopAnimationsModule } from '@angular/platform-browser/animations';
import { DemoMaterialModule } from './material-module';
import {HttpClientModule} from '@angular/common/http';
import localeFr from '@angular/common/locales/fr';
import {registerLocaleData} from '@angular/common';
registerLocaleData(localeFr, 'fr');

@NgModule({
  declarations: [
    AppComponent,
    TaskComponent,
    TodoListComponent,
    NewTaskComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    NgbModule,
    NoopAnimationsModule,
    DemoMaterialModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
