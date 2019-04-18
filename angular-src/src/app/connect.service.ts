import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from './User';


@Injectable({
  providedIn: 'root'
})
export class ConnectService {

  URL = 'http://localhost:8080/bSocial';


  // Register a user by sending a user object to be parsed by the middle end.
  registerUser(user : User){
    console.log(user);
    return this._http.post(this.URL + '/register.rev', user).subscribe(
      res => {
        alert("Alpha");
      },
      error => {
        alert("Beta");
      }

    );
  }

  // To be finished
  loginUser(ULog : any){
    console.log(ULog);
    this._http.get(this.URL + '/Login.rev', ULog).subscribe(
      data => {
        return data;
      },
      error => {
        console.log("Error");
        alert("Wrong Username or Password.");
      }
    )
  }

  // pull post to be used
  showPost(){
    this._http.get(this.URL + 'selectPosts').subscribe(
      data => {
        return data;
      },
      error => {
        console.log("Error");
        alert("No Post");
      }
    )
  }

  constructor(private _http: HttpClient) { }
}
