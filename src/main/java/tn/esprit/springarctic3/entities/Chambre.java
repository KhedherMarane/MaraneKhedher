package tn.esprit.springarctic3.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idChambre;

    Long numeroChambre; //NUM_CHAMBRE
    @ToString.Exclude

    @Enumerated(EnumType.STRING)
    TypeChambre typeC;
    @ToString.Exclude

    @ManyToOne
    Bloc bloc;
    @ToString.Exclude

    @JsonIgnore
    @OneToMany
    List<Reservation> reservations;
}