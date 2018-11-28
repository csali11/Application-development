import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { map } from 'rxjs/operators';

export type Family = {
  name:string,
  age:number,
  permission: string
}

@Injectable({
  providedIn: 'root'
})
export class FamilyService {

  constructor() { }

  findAll(): Observable<Family[]>{
    return of ([
      {
        name: "Marry",
        age: 13,
        permission:"child"
      },
      {
        name: "Ted",
        age: 43,
        permission:"parent"
      },
      {
        name: "Cloe",
        age: 39,
        permission:"parent"
      },
      {
        name: "Bill",
        age: 9,
        permission:"child"
      },
      {
        name: "JOhn",
        age: 15,
        permission:"child"
      },
    ]);
  }
  findByPredicate(predicate): Observable<Family[]> {
    return this.findAll().pipe(map(x => x.filter(predicate)));
  }

}
