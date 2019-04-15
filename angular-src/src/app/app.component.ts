import { Component } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {bSocialApi} from './services/api.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'P2';

  //response object
  Resp: any;
  id: number;
  //user: Users[];

  _url = 'http://localhost:8080/BSocialSpringMVC';

  constructor(private _http : HttpClient, private _Api: bSocialApi){
  }

  onInit(){
    //add api method and subscribe because its an observable
    
  }
  
}
