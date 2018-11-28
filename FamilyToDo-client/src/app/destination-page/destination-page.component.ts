import { Component, OnInit } from '@angular/core';
import { DestinationService } from '../destination.service';

@Component({
  selector: 'app-destination-page',
  templateUrl: './destination-page.component.html',
  styleUrls: ['./destination-page.component.css']
})
export class DestinationPageComponent implements OnInit {

  constructor(private destinationService : DestinationService) { }

  ngOnInit() {
  }

}
