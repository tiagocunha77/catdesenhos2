package pt.tiago.catdesenhos.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name = "autor")
@lombok.Data
public class Autor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idautor")
	private Long id;
	private String nome;
	@Column(name = "username")
	private String userName;
	@JsonProperty(access = Access.WRITE_ONLY)
	private String pass;
	
	@OneToMany(mappedBy = "autor")
	@JsonIgnoreProperties("autor")
	private List<Desenho> desenhos;
	
	
	
	

}