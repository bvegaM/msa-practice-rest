import jakarta.persistence.*;
import lombok.*;
import java.time.*;

@Entity
@Table(name = "T_WAREHOUSES")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String name; String location;
}
