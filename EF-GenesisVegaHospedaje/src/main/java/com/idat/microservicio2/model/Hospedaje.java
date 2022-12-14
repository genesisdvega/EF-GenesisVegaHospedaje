package com.idat.microservicio2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "hospedaje")
@Getter
@Setter
public class Hospedaje {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idHospedaje;

	private String nombre;

	public Hospedaje(Integer idHospedaje, String nombre) {
		super();
		this.idHospedaje = idHospedaje;
		this.nombre = nombre;
	}

	public Hospedaje() {
		super();
	}

}
