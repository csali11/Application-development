import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { map } from 'rxjs/operators';


export type Items = {
  name: string
}

@Injectable({
  providedIn: 'root'
})
export class ItemsService {

  constructor() { }

  findAll(): Observable<Items[]>{
    return of([
      {name:"Axe"},
      {name:"Notebook"},
      {name:"Knife"},
      {name:"Pen"},
      {name:"Book"},
      {name:"Washmachine"},
      {name:"Dishwasher"},
      {name:"Refigerator"},
    ])
  }
  findByPredicate(predicate): Observable<Items[]> {
    return this.findAll().pipe(map(x => x.filter(predicate)));
  }
}
