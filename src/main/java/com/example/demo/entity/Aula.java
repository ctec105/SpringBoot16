package com.example.demo.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "aula")
public class Aula implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String descripcion;

	@OneToMany(mappedBy = "aula")
	private List<Studient> studients;

	public Aula() {
		super();
	}

	public Aula(Long id, String descripcion, List<Studient> studients) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.studients = studients;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Studient> getStudients() {
		return studients;
	}

	public void setStudients(List<Studient> studients) {
		this.studients = studients;
	}

}
