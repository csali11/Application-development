import { Component, OnInit, Input } from '@angular/core';
import { UserService, User } from '../user-service.service';
import { Observable } from 'rxjs';
import { Destination } from '../destination.service';

@Component({
  selector: 'app-destination-list',
  templateUrl: './destination-list.component.html',
  styleUrls: ['./destination-list.component.css']
})
export class DestinationListComponent implements OnInit {
  @Input() private destinations: Observable<Destination[]>;
  private currentUser: Observable<User>;  
  
  constructor(private userService : UserService) { }


  ngOnInit() {
    this.currentUser=this.userService.getCurrentUser();
  }
}
