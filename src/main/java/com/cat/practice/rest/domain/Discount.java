import jakarta.persistence.*;
import lombok.*;
import java.time.*;

@Entity
@Table(name = "T_DISCOUNTS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String name; Double percentage;
}
