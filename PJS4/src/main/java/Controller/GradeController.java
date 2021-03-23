package Controller;

import com.enteam.app.demo.Grade;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/Grade")
public class GradeController {
    private ArrayList <Grade> grades;

    @PostMapping
    public ArrayList PostGrade (){
        return grades;
    }

    public void addGrade (@PathVariable("id") String id){
        Grade grade; //recup sur la base
        grades.add(grade);
    }

}
