package Repository;

import data.Student;
import data.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TodoRepository extends JpaRepository<Todo,Long> {

    public Optional<Student> findStudentByStudentEquals(long id);

    public Optional<Todo> findTodoByTickIsTrueOOrderByDate();

}
