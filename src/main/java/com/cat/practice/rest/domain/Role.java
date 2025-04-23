import jakarta.persistence.*;
import lombok.*;
import java.time.*;

@Entity
@Table(name = "T_ROLES")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String name;
}
