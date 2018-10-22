package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.converter.Converter;
import com.example.demo.entity.Nombre;
import com.example.demo.model.MNombre;
import com.example.demo.repository.NombreRepo;

@Service("servicio")
public class NombreService {
	@Autowired
	@Qualifier("repo")
	private NombreRepo repositorio;
	
	@Autowired
	@Qualifier("convertidor")
	private Converter convertidor;
	
	public boolean crear(Nombre nombre) {
		try {
			repositorio.save(nombre);
			return true;
		}catch(Exception e){
			return false;
		}
		
	}
	
	public boolean Actualizar(Nombre nombre) {
		try {
			repositorio.save(nombre);
			return true;
		}catch(Exception e){
			return false;
		}
		
	}
	
	public boolean borrar(String nom, long id) {
		try {
			Nombre nombre = repositorio.findById(id);
			repositorio.delete(nombre);
			return true;
		}catch(Exception e){
			return false;
		}
		
	}
	
	public List<MNombre> obtener(){
		return convertidor.convertirLista(repositorio.findAll());
	}
	

}
