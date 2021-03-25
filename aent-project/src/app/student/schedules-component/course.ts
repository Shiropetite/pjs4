export interface Course {
  id: number;
  date: Date;
  subject: {
    id: number,
    name: string,
    abbr: string
  };
  room: string;
  teacher: string;
}
