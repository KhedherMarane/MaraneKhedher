package tn.esprit.springarctic3.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springarctic3.entities.Chambre;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
}
