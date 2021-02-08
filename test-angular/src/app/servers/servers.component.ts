import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-servers',
  templateUrl: './servers.component.html',
  styleUrls: ['./servers.component.scss']
})
export class ServersComponent implements OnInit {
  allowedNewServer = false;
  serverCreationStatus = 'No server was created';
  serverName = 'Testserver';

  constructor() {
    setTimeout(() => {
      this.allowedNewServer = true;
    }, 2000);
  }

  ngOnInit(): void {
  }

  // tslint:disable-next-line:typedef
  onUpdateServerName(event: any) {
    this.serverName = (event.target as HTMLInputElement).value;
  }

  // tslint:disable-next-line:typedef
  onCreateServer() {
    this.serverCreationStatus = 'Server was created ! Name is ' + this.serverName;
  }

}
