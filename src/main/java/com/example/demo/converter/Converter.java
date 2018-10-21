package com.example.demo.converter;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.example.demo.entity.Nombre;
import com.example.demo.model.MNombre;


@Component("convertidor")
public class Converter {

	public List<MNombre> comvertirLista(List<Nombre> nombre){
		List <MNombre> mnombre = new ArrayList<>();
		
	for(Nombre nomb : nombre) {
		mnombre.add(new MNombre(nomb));
		
	}
	
	return mnombre;
	
 }
	
}
