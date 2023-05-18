package com.cursoceat.controller;

import java.util.Collection;
import java.util.ArrayList;
import com.cursoceat.modell.Persona;
import java.util.List;
public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creamos una lista de personas
		List<Persona> miListaPer=new ArrayList<>();
		//creamos una coleccion de personas a partir de la lista
		Collection<Persona> miColeccionPer= miListaPer;
		//insertamos nuevo elemento
		Persona p1= new Persona("Luis",  "06454585w","12-10-1974");
		Persona p2= new Persona("Carlos","06454586q","11-11-1998");
		Persona p3= new Persona("Mario", "06457474f","10-12-1994");
		
		miColeccionPer.add(p1);
		miColeccionPer.add(p2);
		miColeccionPer.add(p3);
		//imprimimos todas las colecciones
		System.out.println(miColeccionPer);
		
		int tamanio= miColeccionPer.size();
		System.out.println("Elementos de la colección: "+tamanio);
	
		if(miColeccionPer.isEmpty()) {
			System.out.println("La colección está vacía");
		}else {
			System.out.println("La colección tiene elementos");
		}
		//eliminar un elmento de una coleccion
		miColeccionPer.remove(p2);
		System.out.println("Nuestra colección tiene ahora " + miColeccionPer.size()+ " elementos");
		System.out.println(miColeccionPer);
	
		//metodo ccontains
		
		Boolean comprobar= miColeccionPer.contains(p2);
		System.out.println("¿Tiene la persona 2? " + comprobar);
		
		//si tenemos un indice
		comprobar = miColeccionPer.contains(new Persona("06457474f"));
		System.out.println("¿Tiene la persona 3? " + comprobar);		
		
		//metodo para vaciar la lista pero no eliminarla
		miColeccionPer.clear();
		System.out.println("Nuestra colección tiene ahora "+ miColeccionPer.size() + " elementos");
		
		Persona p4= new Persona("María", "06457473c","10-12-1990");
		miColeccionPer.add(p4);
		System.out.println(miColeccionPer.toString());
	}

}
