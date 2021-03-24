package Repository;

import data.Course;
import data.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseRepository extends JpaRepository<Course,Long> {

    public  Optional<Course> findByStudentsEquals(Student[] stud);
}
