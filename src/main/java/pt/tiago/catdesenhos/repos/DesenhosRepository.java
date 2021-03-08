package pt.tiago.catdesenhos.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.tiago.catdesenhos.entities.Desenho;

public interface DesenhosRepository extends JpaRepository<Desenho, Long>{
	
}