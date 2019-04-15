import { Component, OnInit } from '@angular/core';
import { Posting } from '../Posting';
import { Storage } from '../Temp';

@Component({
  selector: 'app-posts',
  templateUrl: './posts.component.html',
  styleUrls: ['./posts.component.css']
})
export class PostsComponent implements OnInit {

  posting : Posting[] = Storage;

  constructor() { }

  ngOnInit() {
  }

}
