package ma.Controle.gestionFactures.repositories;

import ma.Controle.gestionFactures.entities.Facture;
import org.springframework.boot.logging.java.JavaLoggingSystem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactureRepository extends CrudRepository<Facture, Long> {
}
