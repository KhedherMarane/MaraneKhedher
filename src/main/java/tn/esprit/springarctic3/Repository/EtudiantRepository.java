package tn.esprit.springarctic3.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springarctic3.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
