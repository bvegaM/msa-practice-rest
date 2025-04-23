import jakarta.persistence.*;
import lombok.*;
import java.time.*;

@Entity
@Table(name = "T_SALARIES")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    Double amount; String period;
}
