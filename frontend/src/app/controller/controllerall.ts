import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { BehaviorSubject } from 'rxjs';

@Injectable()
export class Controllerall {
  public API = '//localhost:3020';

  constructor(private http: HttpClient) { }


  getTimereceive(): Observable<any> {
    return this.http.get(this.API + '/Timereceive');
  }

  getEquipment(): Observable<any> {
    return this.http.get(this.API + '/Equipment');
  }

  getMember(): Observable<any> {
    return this.http.get(this.API + '/Member');
  }
}
