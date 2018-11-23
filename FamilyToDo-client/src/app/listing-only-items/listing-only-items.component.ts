import { Component, OnInit, Input } from '@angular/core';
import { Todo } from '../todo.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-listing-only-items',
  templateUrl: './listing-only-items.component.html',
  styleUrls: ['./listing-only-items.component.css']
})
export class ListingOnlyItemsComponent implements OnInit {
  @Input() private todos: Observable<Todo[]>;
  
  constructor() { }

  ngOnInit() {
  }
}
