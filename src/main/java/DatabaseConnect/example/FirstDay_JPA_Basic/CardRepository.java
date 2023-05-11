package DatabaseConnect.example.FirstDay_JPA_Basic;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<LibraryCard, Integer> {

}
