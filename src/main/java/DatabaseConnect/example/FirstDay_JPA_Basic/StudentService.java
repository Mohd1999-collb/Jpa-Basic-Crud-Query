package DatabaseConnect.example.FirstDay_JPA_Basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    Studentrepository studentrepository;
    public void addStudent(Student student) {
        studentrepository.save(student);
    }

    public Student getStudent(int id) {
        studentrepository.findAll();
        return studentrepository.findById(id).get();
    }

    public List<Student> getAllStudent() {
        return studentrepository.findAll();

    }

    public void removeStudent(int id) {
        studentrepository.deleteById(id);
    }

    public void removeAllStudent() {
        studentrepository.deleteAll();
    }

    public void updateName(int studentId) {
        Student student = studentrepository.findById(studentId).get();
        student.setName("Siddiqui");
        studentrepository.save(student);
    }

      /* get all the student
       delete a student by studentID
       delete all the student
       update the student name by taking studentId
//       find all the student by age 20
   */
}
