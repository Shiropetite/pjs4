import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GradeTabComponent } from './grade-tab.component';

describe('GradeTabComponent', () => {
  let component: GradeTabComponent;
  let fixture: ComponentFixture<GradeTabComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GradeTabComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GradeTabComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
