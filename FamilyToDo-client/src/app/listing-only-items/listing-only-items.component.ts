import { Component, OnInit, Input } from '@angular/core';
import { Observable } from 'rxjs';

import { Items, ItemsService } from '../items.service';
import { User, UserService } from '../user-service.service';

@Component({
  selector: 'app-listing-only-items',
  templateUrl: './listing-only-items.component.html',
  styleUrls: ['./listing-only-items.component.css']
})
export class ListingOnlyItemsComponent implements OnInit {
  @Input() private items: Observable<Items[]>;
  private currentUser: Observable<User>;  
  
  constructor(private userService : UserService) { }


  ngOnInit() {
    this.currentUser=this.userService.getCurrentUser();
  }
}
