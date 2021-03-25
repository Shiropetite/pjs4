package repositories;

import ressouces.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TodoRepository extends JpaRepository<Todo, Long> {

    public Optional<Todo[]> findTodosByOwner_Id(Long owner_id);

}
