package com.idat.microservicio2.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class ReservaDTO {
	
	private Integer idReserva;
	
	private double costo;

	public ReservaDTO(Integer idReserva, double costo) {
		super();
		this.idReserva = idReserva;
		this.costo = costo;
	}

	public ReservaDTO() {
		super();
	}

}
