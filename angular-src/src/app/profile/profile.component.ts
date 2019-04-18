import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {
  IUrl : string = '../../assets/gen-Ava.jpg';
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
