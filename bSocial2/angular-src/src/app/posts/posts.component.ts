import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-posts',
  templateUrl: './posts.component.html',
  styleUrls: ['./posts.component.css']
})
export class PostsComponent implements OnInit {
  IUrl : string = '../../assets/Bee2.png';
  fileToUpload : File = null;

  constructor() { }

  ngOnInit() {
  }

  handleFileInput(file : FileList){
    this.fileToUpload = file.item(0);

    var reader = new FileReader();
    reader.onload = (event:any) => {
      this.IUrl = event.target.result;
    }
    reader.readAsDataURL(this.fileToUpload);
  }

}
