import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListingOnlyItemsComponent } from './listing-only-items.component';

describe('ListingOnlyItemsComponent', () => {
  let component: ListingOnlyItemsComponent;
  let fixture: ComponentFixture<ListingOnlyItemsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListingOnlyItemsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListingOnlyItemsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
