export class User{
    username : string;
    password : string;
    email : string;
    displayName : string;
    displayImg : string;
    
    constructor(username : string, password : string, email : string, displayName : string, displayImg : string){
        this.username = username;
        this.password = password;
        this.email = email;
        this.displayName = displayName;
        this.displayImg = displayImg;
    }

}