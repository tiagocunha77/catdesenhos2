package pt.tiago.catdesenhos.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "desenhos")
@lombok.Data
public class Desenho {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "iddesenho")
	private Long id;
	private String titulo;
	private String observacoes;
	private String desenho;
	@ManyToOne
	@JoinColumn(name = "idautor")
	@JsonIgnoreProperties("desenhos")
	private Autor autor;

}