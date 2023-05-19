package DatabaseConnect.example.FirstDay_JPA_Basic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Studentrepository extends JpaRepository<Student, Integer> {

    /*JPA implement these function automatically*/
    List<Student> getStudentByAge(int age);

    List<Student> getAllByAgeAndMarks(int age, int marks);

    /*Write the own sql query*/

    /*Same as sql query*/
//    @Query(value = "select * from student_info s where s.age >= :age", nativeQuery = true)

    /*Same as sql query using Student class name*/
    @Query(value = "select s from Student s where s.age > :age",nativeQuery = false)
    List<Student> getAllByAgeGreaterThan(int age);
}
