import {Injectable} from '@angular/core';
import {Observable} from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class bSocialApi{

    private _LoginURL = "http://localhost:8080/BSocialSpringMVC/Login.app";
    private _RegisterURL = "http://localhost:8080/BSocialSpringMVC/Register.app";
    private _HomeURL = "http://localhost:8080/BSocialSpringMVC/Home.app";
    private _ProfileURL = "http://localhost:8080/BSocialSpringMVC/Profile.app";
    private _CreatePostURL = "http://localhost:8080/BSocialSpringMVC/CreatePost.app";


    constructor(private _http: HttpClient){}

   // getUserLogin(user): Observable<any>{
 
       // post return this._http.post<any>(this._LoginURL, user);
        // '/validate'
    //}

    // getRegister(): Observable<any>{
       // post return this._http.post<any>(this._RegisterURL, user); 
        // '/insert'
    //}

    // Home(): Observable<any>{
        // '/Home'
        // shows all post ever made
    //}

    // Profile(): Observable<any>{
         //this._URL = "http://localhost:8080/BSocialSpringMVC/Profile.app";
        // '/Profile'
        //grabs all display info of the user
        //shows all post by username
    //}

    // CreatePost(): Observable<any>{
        // maybe find a boostrap card creator or a get
        // return this._http.post<any>(this._CreatePostURL, post);
        //shows all post by username
    //}
}