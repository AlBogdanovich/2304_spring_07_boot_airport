package by.itclass.airplane;

import by.itclass.flight.Flight;
import by.itclass.passenger.Passenger;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.util.List;

@Entity
@Table(name = "airplane")
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Airplane {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NonNull private String model;
    @NonNull private int places;
    @OneToMany(mappedBy = "airplane", fetch = FetchType.EAGER)
    private List<Flight> flights;

}
