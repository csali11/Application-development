import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { map } from 'rxjs/operators';

export type Todo = {
  author: string,
  text: string, 
  items: string[]
}

@Injectable({
  providedIn: 'root'
})
export class TodoService {

  constructor() { }


  findAll(): Observable<Todo[]> {
    return of([
      {
        author:"Mary",
        text:"Dad has to chop some logs.",
        items:["Axe"]
      },
      {
        author:"John",
        text:"Clean the livingroom",
        items:["Towel"]
      },
      {
        author:"John",
        text:"Marry has homework to do.",
        items:["Notebook"]
      },
      {
        author:"Bill",
        text:"I have to clean my room.",
        items:["Broom"]
      },
    ]);
  }
  

  findByPredicate(predicate): Observable<Todo[]> {
    return this.findAll().pipe(map(x => x.filter(predicate)));
  }
}
