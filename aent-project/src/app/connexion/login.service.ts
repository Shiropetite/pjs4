import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor() { }

  login(login: string, password: string): number {
    // TODO : lié a un back
    return 1;
  }

}
