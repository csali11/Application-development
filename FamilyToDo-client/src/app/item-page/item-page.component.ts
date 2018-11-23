import { Component, OnInit, Input } from '@angular/core';
import { Observable } from 'rxjs';
import { Todo, TodoService } from '../todo.service';

@Component({
  selector: 'app-item-page',
  templateUrl: './item-page.component.html',
  styleUrls: ['./item-page.component.css']
})
export class ItemPageComponent implements OnInit {

 

  constructor(private todoService: TodoService) { }
  ngOnInit() {
  }
}
