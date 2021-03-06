import { Component, OnInit, Input } from '@angular/core';
import { Observable } from 'rxjs';

import { Todo } from '../todo.service';
import { User, UserService } from '../user-service.service';

@Component({
  selector: 'app-todo-list',
  templateUrl: './todo-list.component.html',
  styleUrls: ['./todo-list.component.css']
})
export class TodoListComponent implements OnInit {

  @Input() private todos: Observable<Todo[]>;
  private currentUser: Observable<User>;  
  constructor(private userService : UserService) { }

  ngOnInit() {
    this.currentUser=this.userService.getCurrentUser();
  }

}
