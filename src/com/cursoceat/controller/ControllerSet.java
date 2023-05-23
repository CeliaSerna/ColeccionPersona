package com.cursoceat.controller;

import java.util.TreeSet;
import java.util.Set;
import com.cursoceat.modell.Persona;
public class ControllerSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creamos un conjunto con el treeSet
		
		Set<Persona> miColeccion = new TreeSet<>();
		
		Persona p3= new Persona("Maria", "06457471f","10-12-1991");
		Persona p1= new Persona("Luisa", "06454584w","12-10-1979");
		Persona p2= new Persona("Carla","06454583q","11-11-1997");
		
		miColeccion.add(p1);
		miColeccion.add(p2);
		miColeccion.add(p3);
		//imprimimos todas las colecciones
		System.out.println(miColeccion);
		
	/**ahora ingresamos otra vez uno de los que ya teniamos en el conjunto **/
		
		boolean ins= miColeccion.add(p2);
		System.out.println("¿Se inserto? "+ ins);	
		
	
	
	
	}

}
