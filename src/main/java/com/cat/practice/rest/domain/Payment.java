import jakarta.persistence.*;
import lombok.*;
import java.time.*;

@Entity
@Table(name = "T_PAYMENTS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    LocalDate date; Double amount;
}
