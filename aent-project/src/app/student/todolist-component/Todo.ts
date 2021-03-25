export class Todo {
  constructor(
    public id: number,
    public date: Date,
    public title: string,
    public description: string,
    public tick: boolean,
  ) { }
}
