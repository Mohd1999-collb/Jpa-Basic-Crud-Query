package DatabaseConnect.example.FirstDay_JPA_Basic.Controller;

import DatabaseConnect.example.FirstDay_JPA_Basic.Student;
import DatabaseConnect.example.FirstDay_JPA_Basic.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add-student")
    public String addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return "Student added of id " + student.getStudentId() + " is successfully";
    }

    @GetMapping("/get-student")
    public Student getStudent(@RequestParam int id){
        return studentService.getStudent(id);

    }

    @GetMapping("/get-allstudent")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @DeleteMapping("/delete-student")
    public String removeStudent(@RequestParam int id){
        studentService.removeStudent(id);
        return "Student deleted of id " + id + " is successfully";
    }

    @DeleteMapping("/delete-allStudent")
    public String removeAllStudent(){
        studentService.removeAllStudent();
        return "All Student record is deleted successfully";
    }

    @PutMapping("/update-name")
    public String updateStuName(@RequestParam int studentId){
        studentService.updateName(studentId);
        return "Student name update successfully";
    }

    @GetMapping("/get-student-by-age")
    public List<Student> getStudentByAge(@RequestParam int age){
        return studentService.getStudentByAge(age);
    }


    @GetMapping("/get-student-by-age-marks")
    public List<String> getAllByAgeAndMarks(@RequestParam("age") int age,  @RequestParam("marks") int marks){

        return studentService.getAllByAgeAndMarks(age,marks);
    }

    @GetMapping("/get-student-by-age-greater")
    public List<String> getAllByAgeGreaterThan(@RequestParam("age") int age){
        return studentService.getAllByAgeGreaterThan(age);
    }
}
