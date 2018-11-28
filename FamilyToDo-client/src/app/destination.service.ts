import { Injectable } from '@angular/core';
import { of, Observable } from 'rxjs';
import { map } from 'rxjs/operators';


export type Destination= {
  name:string;
}
@Injectable({
  providedIn: 'root'
})
export class DestinationService {

  constructor() { }

  findAll() : Observable<Destination[]>{
    return of([
      {name : "Kitchen"},
      {name : "Garage"},
      {name : "Livingroom"},
      {name : "Bedroom"},
      {name : "Toilette"},
  ]);
  }
  findByPredicate(predicate):Observable<Destination[]>{
    return this.findAll().pipe(map(x => x.filter(predicate)));
  }
}

