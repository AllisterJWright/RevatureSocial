import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from './User';

@Injectable({
  providedIn: 'root'
})
export class ConnectService {

  URL = '';

  registerUser(user : User){
    this._http.post(this.URL + 'insertUser', user).subscribe;
  }

  loginUser(){
    this._http.get(this.URL,).subscribe(
      data => {
        return data;
      },
      error => {
        console.log("Error");
        alert("Wrong Username or Password.");
      }

    )
  }


  constructor(private _http: HttpClient) { }
}
