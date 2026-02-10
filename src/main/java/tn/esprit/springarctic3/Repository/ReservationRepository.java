package tn.esprit.springarctic3.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springarctic3.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
