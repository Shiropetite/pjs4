import {Class} from './class';

export interface Grade {
  id: number;
  title: string;
  grade: number;
  divider: number;
  coef: number;
  classes: Class;
}
