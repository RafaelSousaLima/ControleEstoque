import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DocumentacaoAngularComponent } from './documentacao-angular.component';

describe('DocumentacaoAngularComponent', () => {
  let component: DocumentacaoAngularComponent;
  let fixture: ComponentFixture<DocumentacaoAngularComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DocumentacaoAngularComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DocumentacaoAngularComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
