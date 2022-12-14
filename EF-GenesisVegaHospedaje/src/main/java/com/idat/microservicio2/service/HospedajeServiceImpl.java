package com.idat.microservicio2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.microservicio2.client.OpenFeignClient;
import com.idat.microservicio2.dto.HospedajeDTO;
import com.idat.microservicio2.dto.ReservaDTO;
import com.idat.microservicio2.model.Hospedaje;
import com.idat.microservicio2.repository.HospedajeRepository;

@Service
public class HospedajeServiceImpl implements HospedajeService {

	@Autowired
	HospedajeRepository repository;

	@Autowired
	OpenFeignClient client;

	@Override
	public List<HospedajeDTO> listar() {
		List<HospedajeDTO> listadto = new ArrayList<HospedajeDTO>();

		for (Hospedaje hospedaje : repository.findAll()) {
			HospedajeDTO dto = new HospedajeDTO();
			dto.setIdHospedaje(hospedaje.getIdHospedaje());
			dto.setNombre(hospedaje.getNombre());
			listadto.add(dto);
		}
		return listadto;
	}

	@Override
	public void guardar(HospedajeDTO dto) {
		Hospedaje hospedaje = new Hospedaje(dto.getIdHospedaje(), dto.getNombre());
		repository.save(hospedaje);

	}

	@Override
	public List<ReservaDTO> listarReservas() {
		List<ReservaDTO> listadto = client.listar();
		return listadto;
	}

}
