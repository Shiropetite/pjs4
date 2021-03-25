package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ressouces.Grade;
import ressouces.Student;
import ressouces.Subject;

import java.util.List;
import java.util.Optional;

public interface GradeRepository extends JpaRepository<Grade,Long> {
    public Optional<List<Grade>> findGradesByStudentaAndAndSubject(Student student, Subject subject);
}
