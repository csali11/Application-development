import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Todo, TodoService } from '../todo.service';
import { ActivatedRoute } from '@angular/router';
import { mergeMap } from 'rxjs/operators';

@Component({
  selector: 'app-search-result-page',
  templateUrl: './search-result-page.component.html',
  styleUrls: ['./search-result-page.component.css']
})
export class SearchResultPageComponent implements OnInit {
  private todos: Observable<Todo[]>;

  constructor(private activatedRoute: ActivatedRoute, private todoService: TodoService) { }

  ngOnInit() {
    this.todos = this.activatedRoute.paramMap.pipe(mergeMap(paramMap =>
      this.todoService.findByPredicate(todo => {
        const keywords = paramMap.get('keywords').trim().split(/\s+/);
        return keywords.some(k => {
          const pattern = new RegExp(k, 'i');
          return pattern.test(todo.title) || pattern.test(todo.text)  || pattern.test(todo.author)  || pattern.test(todo.items);
        });
      })));
  }

}
