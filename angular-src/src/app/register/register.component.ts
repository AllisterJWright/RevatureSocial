import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { bSocialApi} from '../services/api.service';
import { Users } from '../Objects/User';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor(private _http : HttpClient, private _Api: bSocialApi) { }

  ngOnInit() {
  }

}
