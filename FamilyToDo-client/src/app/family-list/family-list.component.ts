import { Component, OnInit, Input } from '@angular/core';
import { Family } from '../family.service';
import { User, UserService } from '../user-service.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-family-list',
  templateUrl: './family-list.component.html',
  styleUrls: ['./family-list.component.css']
})
export class FamilyListComponent implements OnInit {
  @Input() private family: Observable<Family[]>;
  private currentUser: Observable<User>;  
  
  constructor(private userService : UserService) { }


  ngOnInit() {
    this.currentUser=this.userService.getCurrentUser();
  }
}
