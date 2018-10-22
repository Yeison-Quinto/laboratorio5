package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Nombre;
import com.example.demo.model.MNombre;
import com.example.demo.service.NombreService;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/v1")
public class NombreController {
	
	@Autowired
	@Qualifier("servicio")
	NombreService service;
	
	@PutMapping("/nombre")
	public boolean agregarNombre(@RequestBody @Valid Nombre nombre) {
			
		return service.crear(nombre);
	}
	
	@GetMapping("/nombre")
	public List<MNombre> ObtenerNombre(){
		
	
		
		return  service.obtener();
	}

	
}
