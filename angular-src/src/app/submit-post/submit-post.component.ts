import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { bSocialApi } from '../services/api.service';

@Component({
  selector: 'app-submit-post',
  templateUrl: './submit-post.component.html',
  styleUrls: ['./submit-post.component.css']
})
export class SubmitPostComponent implements OnInit {

  constructor(private _http : HttpClient, private _Api: bSocialApi) { }

  ngOnInit() {
  }

}
