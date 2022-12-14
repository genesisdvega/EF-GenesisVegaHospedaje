package com.idat.microservicio2.service;

import java.util.List;

import com.idat.microservicio2.dto.HospedajeDTO;
import com.idat.microservicio2.dto.ReservaDTO;

public interface HospedajeService {
	List<HospedajeDTO> listar();
	List<ReservaDTO> listarReservas();
	void guardar(HospedajeDTO reserva);

}
