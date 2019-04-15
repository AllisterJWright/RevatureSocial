import { Component, OnInit } from '@angular/core';
import { bSocialApi} from '../services/api.service';
import {HttpClient} from '@angular/common/http';
import { Users } from '../Objects/User';
import { Posts } from '../Objects/Post';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})


export class HomeComponent implements OnInit {

  user:Users;
  postList: Posts[];

  constructor(private _http : HttpClient, private _Api: bSocialApi) { }
  ngOnInit() {
  }

}
