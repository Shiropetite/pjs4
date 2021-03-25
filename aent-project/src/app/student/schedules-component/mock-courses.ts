import {Course} from './course';

export const COURSES: Course[] = [
  {id: 1, date: new Date(2021, 2, 23, 8, 0),
    name: 'Anglais', abbr: 'ANG', teacher: 'N. FOUILLEUL',  room: 'Amphithéâtre Olympe de Gouges'},
  {id: 2, date: new Date(2021, 2, 23, 9, 30),
    name: 'Conception et programmation objet avancées', abbr: 'CPOAV', teacher: 'Z. MIKAL',  room: 'Amphithéâtre Portier'},
  {id: 3, date: new Date(2021, 2, 23, 11, 0),
    name: 'Programmation répartie en JEE', abbr: 'JavaEE', teacher: 'J-F. BRETTE',  room: 'B2-13'},
  {id: 5, date: new Date(2021, 2, 23, 14, 0),
    name: 'Conception et développement d\'application mobile', abbr: 'APPMOB', teacher: 'J. BONNET',  room: 'B2-17'},
  {id: 6, date: new Date(2021, 2, 23, 15, 30),
    name: 'Expression', abbr: 'EXP', teacher: 'A. MAYER',  room: 'B0-6'},
];
