import { Component, OnInit, Input } from '@angular/core';
import { Observable, of } from 'rxjs';
import { Router } from '@angular/router';

@Component({
  selector: 'app-item-list',
  templateUrl: './item-list.component.html',
  styleUrls: ['./item-list.component.css']
})
export class ItemListComponent implements OnInit {

  @Input() private items: Observable<Set<string> | string[]> | string[];
  constructor(private router: Router) { }

  ngOnInit() {

    if (!(this.items instanceof Observable)) {
      this.items = of(this.items);
    }
  }

  handleClick(item) {
    this.router.navigateByUrl('/item/' + item);
  }

}