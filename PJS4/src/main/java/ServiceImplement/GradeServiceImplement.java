package ServiceImplement;

import Repository.GradeRepository;
import com.enteam.app.demo.Grade;
import org.springframework.stereotype.Service;
import Service.GradeService;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class GradeServiceImplement implements GradeService {
    private GradeRepository gradeRepository;
    public GradeServiceImplement (GradeRepository gradeRepository){
        this.gradeRepository = gradeRepository;
    }
    public ArrayList<Grade> getGrades(int id_Student) {
        ArrayList<Grade> grades = new ArrayList<Grade>();
        Optional<Grade>[] grade = gradeRepository.findGradeByIdStudent();
        for (Optional<Grade> g: grade) {
            grades.add(g.get());
        }
        return grades;


    }
}
