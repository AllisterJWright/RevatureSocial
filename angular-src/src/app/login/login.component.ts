import { Component, OnInit } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { bSocialApi} from '../services/api.service';
import { Users } from '../Objects/User';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  title = 'P2';

  //response object
  Resp: any;
  id: number;
  //user: Users[];

  _url = 'http://localhost:8080/BSocialSpringMVC/Login';

  constructor(private _http : HttpClient, private _Api: bSocialApi){
  }

  ngOnInit(){
    //add api method and subscribe because its an observable
    
  }
  
}
