import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { bSocialApi} from '../services/api.service';
import { Users } from '../Objects/User';
import { Posts } from '../Objects/Post';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  constructor(private _http : HttpClient, private _Api: bSocialApi) { }

  ngOnInit() {
  }

}
