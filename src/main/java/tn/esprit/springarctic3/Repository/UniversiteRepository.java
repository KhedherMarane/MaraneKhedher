package tn.esprit.springarctic3.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springarctic3.entities.Universite;

public interface UniversiteRepository extends JpaRepository<Universite,Long> {
}