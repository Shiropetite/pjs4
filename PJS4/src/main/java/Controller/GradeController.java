package Controller;

import Repository.GradeRepository;
import Service.GradeService;
import ServiceImplement.GradeServiceImplement;
import com.enteam.app.demo.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/Grade")
public class GradeController {
    private GradeService gradeService;

    @Autowired
    public GradeController(GradeRepository gradeRepository) {
        this.gradeService = new GradeServiceImplement(gradeRepository);
    }


    public void getGrade (@PathVariable("id") int id){
        gradeService.getGrades(id);
    }

}
