import { Injectable } from '@angular/core';
import {COURSES} from '../mock-courses';
import {Observable, of} from 'rxjs';
import {Course} from '../course';
import {HOURS} from '../hours';

@Injectable({
  providedIn: 'root'
})
export class CoursesService {
  courses = COURSES;

  constructor() { }

  getTodayCourses(): Observable<Course[]> {
    const todayCourses = [];
    // on prend tout les cours donné par le back
    COURSES.forEach( (course) => {
        todayCourses.push(course);
    });

    // on vérifie s'il y a des trou et on comble avec des cours 'null'
    HOURS.forEach( (date) => {
      const course = todayCourses.find(c => c.date.getHours() === date.getHours() && c.date.getMinutes() === date.getMinutes());
      if (course == null) {
        const d =  new Date(Date.now());
        d.setHours(date.getHours());
        d.setMinutes(date.getMinutes());
        d.setSeconds(date.getSeconds());
        todayCourses.push({id: null, date: d,
          name: '', teacher: '',  room: ''});
      }
    });

    // on trie les cours par ordre croissant de date
    todayCourses.sort((course1, course2) => {
      return course1.date - course2.date;
    });

    return of(todayCourses);
  }
}
