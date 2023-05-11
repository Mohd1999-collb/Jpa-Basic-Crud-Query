package DatabaseConnect.example.FirstDay_JPA_Basic;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "studentInfo")
public class Student {
    @Id
    private int studentId;
    private int age;

    @Column(name = "studentName")
    private String name;
    private int marks;

    @OneToOne(mappedBy = "student")
    LibraryCard libraryCard;
}
