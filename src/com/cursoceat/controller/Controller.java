package com.cursoceat.controller;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;

import com.cursoceat.modell.Persona;
import java.util.List;

import javax.naming.ldap.ExtendedRequest;

import java.util.Iterator;

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
		
		//volvemos a cargar los elementos de la lista
		miColeccionPer.add(p1);
		miColeccionPer.add(p2);
		miColeccionPer.add(p3);
		System.out.println(miColeccionPer);
	
		//recorrer elemento a elemento por medio de forEach
		//no permite metodos sobre los elementos que recorre
		for(Persona p: miColeccionPer) {
			System.out.println(p.getNombre());
		}
		//recorrer la coleccion, permite borrar un elemento si cumple una condicion
		//objeto interactor que permite ir apuntando por medio del metodo hasNext si exite elemento siguientes
		//y el metodo next() va avanzando por cada uno de los elementos
		
		Iterator<Persona> it=miColeccionPer.iterator();
		while(it.hasNext()) {
			Persona persona= it.next();//se guarda en persona ese objeto apuntado
			if (persona.getDni().equals("06454586q")) {
				it.remove();
			
			
			}
		}
		System.out.println(miColeccionPer);
	
		//crear nueva coleccion
		Collection<Persona> nuevaCole=new ArrayList<>();
		nuevaCole.add(p1);
		nuevaCole.add(p3);
		System.out.println(nuevaCole);
		
		//todo lo que tenga la coleccion nueva tiene que estar en la vieja para dar true
		boolean respuesta=miColeccionPer.containsAll(nuevaCole);
		boolean respuesta2=nuevaCole.containsAll(miColeccionPer);
		
		
		System.out.println("¿La coleccion 1 tiene los elementos de la coleccion 2? "+respuesta);
		System.out.println("¿La coleccion 2 tiene los elementos de la coleccion 1? "+respuesta2);
		////////////////
		System.out.println("la coleccion tiene "+ miColeccionPer.size() + " elementos");
		miColeccionPer.addAll(nuevaCole);
		System.out.println("la coleccion tiene "+ miColeccionPer.size() + " elementos");
		miColeccionPer.removeAll(nuevaCole);
		
		System.out.println("la coleccion tiene "+ miColeccionPer.size() + " elementos");
		System.out.println(miColeccionPer);
		///////////////////////////////////////////////////
		//Crear un array a partir de una coleccion 
		Persona[] n = miColeccionPer.toArray(new Persona[0]);
		System.out.println(n[0].getDni());
		//crear una coleccion a partir de un array
		//la lista es inmutable, no se puede cambiar,
		//ni eliminar ni insertar
		
		//creando la coleccion 1º no inmutable
		Collection<Persona> desdeArray = new ArrayList<>();
		desdeArray.addAll(Arrays.asList(n));
		System.out.println(desdeArray);
		
		desdeArray.add(new Persona("Celia","70504050w","15-09-1990"));
		System.out.println(desdeArray);
	
	}

}
