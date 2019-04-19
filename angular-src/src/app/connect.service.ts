import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from './User';
import { Router } from '@angular/router';


@Injectable({
  providedIn: 'root'
})
export class ConnectService {

  URL = 'http://localhost:8090/bSocial';


  // Register a user by sending a user object to be parsed by the middle end.
  registerUser(User){
    return this._http.post<any>(this.URL + '/register.rev', User)
  }

  // To be finished
  loginUser(ULog : any){
    console.log(ULog);
    return this._http.post<any>(this.URL + '/Login.rev', ULog)
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
