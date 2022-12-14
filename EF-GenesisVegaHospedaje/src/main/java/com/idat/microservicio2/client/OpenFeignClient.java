package com.idat.microservicio2.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.microservicio2.dto.ReservaDTO;

@FeignClient(name = "reserva-microservicio", url = "localhost:8092")
public interface OpenFeignClient {

	@GetMapping("/reserva/listar")
	public List<ReservaDTO> listar();
}
