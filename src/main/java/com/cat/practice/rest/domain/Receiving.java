import jakarta.persistence.*;
import lombok.*;
import java.time.*;

@Entity
@Table(name = "T_RECEIVINGS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Receiving {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    LocalDate receivingDate; String origin;
}
