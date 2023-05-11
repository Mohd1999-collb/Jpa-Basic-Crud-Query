package DatabaseConnect.example.FirstDay_JPA_Basic;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LibraryCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    private Department department;

    @Enumerated(EnumType.STRING)
    private CardStatus cardStatus;

    /*To automatically assign creation date to each card*/
    @CreationTimestamp
    private Date issueDate;

    /*But initially UpdateTimestamp value is same as the CreationTimestamp value*/
    @UpdateTimestamp
    private Date lastTransactionDate;

    /*Now we can implement the relationship b/w student table and library card table
    and these tables have one to one relationship b/w them*/

    /*In @OneToOne annotation first one denote the current class(i.e. LibraryCard
    class(child class)) and second one denote the Student class(i.e. parent class)*/
    @OneToOne

    /*Creates the foreign key in the child table. By default, its creates the foreign
     key on the basis of primary key of parent table*/
    @JoinColumn
    Student student;
}
