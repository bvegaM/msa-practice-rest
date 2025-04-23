import jakarta.persistence.*;
import lombok.*;
import java.time.*;

@Entity
@Table(name = "T_STORAGE_ROOMS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StorageRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String name; String description;
}
