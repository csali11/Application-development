import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AbutPageComponent } from './abut-page.component';

describe('AbutPageComponent', () => {
  let component: AbutPageComponent;
  let fixture: ComponentFixture<AbutPageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AbutPageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AbutPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
