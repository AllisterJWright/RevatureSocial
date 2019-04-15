export class User{
    FName : string;
    LName : string;
    Email : string;
    UName : string;
    Pic : string;
    Other : string;
    
    constructor(Fname: string, Lname: string, email: string, Uname: string, other: string){
        this.FName = Fname;
        this.LName = Lname;
        this.Email = email;
        this.UName = Uname;
        this.Other = other;
    }

}