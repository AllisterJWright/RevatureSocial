import { Component, OnInit } from '@angular/core';
import { Posting } from '../Posting';
import { Storage } from '../Temp';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  posting : Posting[] = Storage;

  constructor() { }

  ngOnInit() {
  }

}
