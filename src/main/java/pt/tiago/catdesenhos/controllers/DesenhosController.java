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

import pt.tiago.catdesenhos.entities.Desenho;
import pt.tiago.catdesenhos.exceptions.DesenhosNotFoundException;
import pt.tiago.catdesenhos.repos.DesenhosRepository;

@RestController
@RequestMapping("/desenhos")
public class DesenhosController {

	private final DesenhosRepository repository;

	DesenhosController(DesenhosRepository repository) {
		this.repository = repository;
	}

	@GetMapping
	List<Desenho> all() {
		return repository.findAll();
	}

	@PostMapping
	Desenho newDesenhos(@RequestBody Desenho newDesenho) {
		return repository.save(newDesenho);
	}

	@GetMapping("/{id}")
	Desenho one(@PathVariable Long id) {
		return repository.findById(id).orElseThrow(() -> new DesenhosNotFoundException(id));
	}

	@PutMapping("/{id}")
	Desenho replaceDesenhos(@RequestBody Desenho newDesenho, @PathVariable Long id) {
		return repository.save(newDesenho);
	}

	@DeleteMapping("/{id}")
	void deleteDesenhos(@PathVariable Long id) {
		repository.deleteById(id);
	}

}