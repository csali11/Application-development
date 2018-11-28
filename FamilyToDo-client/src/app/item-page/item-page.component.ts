import { Component, OnInit, Input } from '@angular/core';
import { Observable } from 'rxjs';
import { Todo, TodoService } from '../todo.service';
import { ItemsService } from '../items.service';

@Component({
  selector: 'app-item-page',
  templateUrl: './item-page.component.html',
  styleUrls: ['./item-page.component.css']
})
export class ItemPageComponent implements OnInit {
  
  constructor(private itemsService: ItemsService) { }
  ngOnInit() {
  }
}
