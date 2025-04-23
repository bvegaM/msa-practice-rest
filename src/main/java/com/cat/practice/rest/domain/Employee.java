import jakarta.persistence.*;
import lombok.*;
import java.time.*;

@Entity
@Table(name = "T_EMPLOYEES")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String name; String position;
}
