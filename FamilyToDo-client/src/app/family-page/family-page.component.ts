import { Component, OnInit } from '@angular/core';
import { FamilyService } from '../family.service';

@Component({
  selector: 'app-family-page',
  templateUrl: './family-page.component.html',
  styleUrls: ['./family-page.component.css']
})
export class FamilyPageComponent implements OnInit {

  constructor(private familyService: FamilyService) { }

  ngOnInit() {
  }

}
