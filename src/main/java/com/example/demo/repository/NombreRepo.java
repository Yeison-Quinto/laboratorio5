package com.example.demo.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Nombre;

@Repository("Repo")
public interface NombreRepo extends JpaRepository<Nombre, Serializable> {
	
	public abstract Nombre findByNombre(String nombre);
	
	public abstract Nombre findById(long Id);
	
}
