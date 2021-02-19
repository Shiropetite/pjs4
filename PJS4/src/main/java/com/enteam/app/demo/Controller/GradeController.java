package Controller;

import com.enteam.app.demo.Grade;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
@RequestMapping
public class GradeController {
    private ArrayList <Grade> grades;

    @PostMapping
    public ArrayList PostGrade (){
        return grades;
    }

    public void addGrade (@PathVariable("id") String id){
        Grade grade;
        grades.add(grade);
    }

}
