package DatabaseConnect.example.FirstDay_JPA_Basic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Studentrepository extends JpaRepository<Student, Integer> {
}
