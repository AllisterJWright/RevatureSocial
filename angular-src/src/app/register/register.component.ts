import { Component, OnInit, Input } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { User } from '../User';
import { ConnectService } from '../connect.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  firstFormGroup : FormGroup;
  secondFormGroup : FormGroup;
  thirdFormGroup : FormGroup;
  fourthFormGroup : FormGroup;
  Alpha : any
  
  @Input() user : User;

  constructor(private _formBuilder: FormBuilder, private conn : ConnectService) { }

  ngOnInit() {

  this.firstFormGroup = this._formBuilder.group({ firstCtrl:['',Validators.required]});
  this.secondFormGroup = this._formBuilder.group({ secondCtrl:['',Validators.required]});
  this.thirdFormGroup = this._formBuilder.group({ thirdCtrl:['',Validators.required]});
  this.fourthFormGroup = this._formBuilder.group({ fourthCtrl:['',Validators.required]});

  }

  Bind(){
    let Halves = this.firstFormGroup.value.firstCtrl.split(",");
    this.user = new User(Halves[0], Halves[1], this.secondFormGroup.value.secondCtrl,  this.thirdFormGroup.value.thirdCtrl, this.fourthFormGroup.value.fourthCtrl);

    console.log(this.user);

  this.Alpha = this.conn.registerUser(this.user);

  }



}
