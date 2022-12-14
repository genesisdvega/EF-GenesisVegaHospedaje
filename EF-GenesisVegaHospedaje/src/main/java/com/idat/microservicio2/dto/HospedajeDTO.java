package com.idat.microservicio2.dto;

import lombok.Data;

@Data
public class HospedajeDTO {

	private Integer idHospedaje;

	private String nombre;

	public HospedajeDTO() {
		super();
	}

	public HospedajeDTO(Integer idHospedaje, String nombre) {
		super();
		this.idHospedaje = idHospedaje;
		this.nombre = nombre;
	}

}
