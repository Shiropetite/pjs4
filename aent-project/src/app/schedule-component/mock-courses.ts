import {Course} from './course';

export const COURSES: Course[] = [
  {id: 1, date: new Date(2021, 2, 21, 8, 0),
    name: 'Anglais', teacher: 'N. FOUILLEUL',  room: 'Amphithéâtre Olympe de Gouges'},
  {id: 2, date: new Date(2021, 2, 21, 9, 30),
    name: 'CPOAV', teacher: 'Z. MIKAL',  room: 'Amphithéâtre Portier'},
  {id: 3, date: new Date(2021, 2, 21, 11, 0),
    name: 'JavaEE', teacher: 'J-F. BRETTE',  room: 'B2-13'},
  {id: 5, date: new Date(2021, 2, 21, 14, 0),
    name: 'APPMOB', teacher: 'J. BONNET',  room: 'B2-17'},
  {id: 6, date: new Date(2021, 2, 21, 15, 30),
    name: 'EXP', teacher: 'A. MAYER',  room: 'B0-6'},
];
