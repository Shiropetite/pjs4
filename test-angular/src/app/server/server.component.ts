import {Component} from '@angular/core';

@Component({
  selector: 'app-server',
  templateUrl: './server.component.html',
  styleUrls: ['./servers.component.scss']

})
export class ServerComponent {
  serverId = 10;
  serverStatus = 'offline';

  // tslint:disable-next-line:typedef
  getServerStatus() {
    return this.serverStatus;
  }
}
