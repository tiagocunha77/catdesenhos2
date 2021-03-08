package pt.tiago.catdesenhos.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import pt.tiago.catdesenhos.entities.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long> {

}