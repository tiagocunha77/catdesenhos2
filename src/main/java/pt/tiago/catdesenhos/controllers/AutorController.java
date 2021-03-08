package pt.tiago.catdesenhos.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.tiago.catdesenhos.entities.Autor;
import pt.tiago.catdesenhos.exceptions.AutorNotFoundException;
import pt.tiago.catdesenhos.repos.AutorRepository;

@RestController
@RequestMapping("/autor")
public class AutorController {

	private final AutorRepository repository;

	AutorController(AutorRepository repository) {
		this.repository = repository;

	}

	@GetMapping
	List<Autor> all() {
		return repository.findAll();
	}

	@PostMapping
	Autor newAutor(@RequestBody Autor newAutor) {
		return repository.save(newAutor);
	}



	@GetMapping("/{id}")
	Autor one(@PathVariable Long id) {

		return repository.findById(id).orElseThrow(() -> new AutorNotFoundException(id));
	}

	@PutMapping("/{id}")
	Autor replaceAutor(@RequestBody Autor newAutor, @PathVariable Long id) {

		return repository.save(newAutor);
	}

	@DeleteMapping("/{id}")
	void deleteAutor(@PathVariable Long id) {
		repository.deleteById(id);
	}
}