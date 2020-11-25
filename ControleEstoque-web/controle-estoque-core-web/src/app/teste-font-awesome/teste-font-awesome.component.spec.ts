import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TesteFontAwesomeComponent } from './teste-font-awesome.component';

describe('TesteFontAwesomeComponent', () => {
  let component: TesteFontAwesomeComponent;
  let fixture: ComponentFixture<TesteFontAwesomeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TesteFontAwesomeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TesteFontAwesomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
