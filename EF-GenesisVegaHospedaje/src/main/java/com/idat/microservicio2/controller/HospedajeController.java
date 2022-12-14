package com.idat.microservicio2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.microservicio2.dto.HospedajeDTO;
import com.idat.microservicio2.dto.ReservaDTO;
import com.idat.microservicio2.service.HospedajeService;

@Controller
@RequestMapping("/hospedaje")
public class HospedajeController {
	@Autowired
	private HospedajeService service;

	@GetMapping("/listar")
	public @ResponseBody List<HospedajeDTO> listar() {
		return service.listar();
	}

	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody HospedajeDTO dto) {
		service.guardar(dto);
	}

	@GetMapping("/listarreservas")
	public @ResponseBody List<ReservaDTO> listarReservas() {
		return service.listarReservas();
	}
}
