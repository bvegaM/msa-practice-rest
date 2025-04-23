import jakarta.persistence.*;
import lombok.*;
import java.time.*;

@Entity
@Table(name = "T_POSITIONS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String title; String level;
}
