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
        items:["Axe"],
        image:"../assets/images/mary.jpg"
      },
      {
        author:"John",
        text:"Clean the livingroom",
        items:["Towel"],
        image:"../assets/images/john.jpg"
      },
      {
        author:"John",
        text:"Marry has homework to do.",
        items:["Notebook"],
        image:"../assets/images/john.jpg"
      },
      {
        author:"Bill",
        text:"I have to clean my room.",
        items:["Broom"],
        image:"../assets/images/bill.jpg"
      },
    ]);
  }
  

  findByPredicate(predicate): Observable<Todo[]> {
    return this.findAll().pipe(map(x => x.filter(predicate)));
  }
}
