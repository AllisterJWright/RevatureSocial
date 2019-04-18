import { Component, OnInit } from '@angular/core';
import { ConnectService } from '../connect.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {



  constructor(private conn : ConnectService) { }

  ngOnInit() {

  }

  Log( ULog : any){
    this.conn.loginUser(ULog.value);
    console.log(ULog.value);
  }
  

}
