package DatabaseConnect.example.FirstDay_JPA_Basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    /*Get all the student*/
    public List<Student> getAllStudent() {
        return studentrepository.findAll();

    }

    /*Delete a student by studentID*/
    public void removeStudent(int id) {
        studentrepository.deleteById(id);
    }

    /*Delete all the student*/
    public void removeAllStudent() {
        studentrepository.deleteAll();
    }

    /*Update the student name by taking studentId*/
    public void updateName(int studentId) {
        Student student = studentrepository.findById(studentId).get();
        student.setName("Siddiqui");
        studentrepository.save(student);
    }

    /*Find all the student by age 20*/
    public List<Student> getStudentByAge(int age) {
        List<Student> ans = new ArrayList<>();

        /*Using manually code written */
//        List<Student> temp = getAllStudent();
//        for (Student stu : temp) {
//            if (stu.getAge() <= age){
//                ans.add(stu);
//            }
//        }

        /*Using a custom JPA implement function*/
        List<Student> temp = studentrepository.getStudentByAge(age);
        for (Student stu : temp) {
                ans.add(stu);
        }
        return ans;
    }

    public List<String> getAllByAgeAndMarks(int age, int marks) {
        List<String> ans = new ArrayList<>();
        List<Student> temp = studentrepository.getAllByAgeAndMarks(age, marks);
        for (Student stu : temp) {
            ans.add(stu.getName());
        }
        return ans;
    }

    public List<String> getAllByAgeGreaterThan(int age) {
        List<String> ans = new ArrayList<>();
        List<Student> temp = studentrepository.getAllByAgeGreaterThan(age);
        for (Student stu : temp) {
            ans.add(stu.getName());
        }
        return ans;
    }
}
