package com.cursoceat.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.cursoceat.modell.CompararEdad;
import com.cursoceat.modell.CompararNombre;
import com.cursoceat.modell.Persona;

public class ControllerCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	List<Persona> lista=new ArrayList<>();
	Persona p1, p2, p3, p4, p5;
	p1=new Persona("Celia",    "70584840w", "15-09-1987");
	p2=new Persona("María",    "70584833q", "19-09-1965");
	p3=new Persona("Laura",   "70584842a", "18-09-1934");
	p4=new Persona("Rebeca",   "70584841v", "17-09-1992");
	p5=new Persona("Alicia", "70584844z", "16-09-1995");
	lista.add(p1);
	lista.add(p2);
	lista.add(p3);
	lista.add(p4);
	lista.add(p5);
	//ordenar la lista
	 System.out.println("lista original \n"+lista);
	 Collections.sort(lista);
	System.out.println("Lista ordenada por dni \n"+ lista);
	
	//ordenamos por nombre
	Collections.sort(lista, new CompararNombre());
	System.out.println("ordenado por nombre \n"+lista);
		
	//ordenamos por edad
	Collections.sort(lista, new CompararEdad());
	System.out.println("Lista ordenada por edad \n"+lista);
		
	Persona p6= new Persona("Guillermo", "70787870a", "12-12-1990");
	Collections.sort(lista, new CompararNombre());
	int indice = Collections.binarySearch(lista, p6, new CompararNombre());
	
	if(indice<0) {
		lista.add(-indice-1,p6);
		
	}
	System.out.println("Insertando Guillermo \n"+lista);
	
	
	//metodo max nos muestra un maximo de un orden
	System.out.println("mayor edad "+ Collections.max(lista, new CompararEdad()));
	System.out.println("menor edad "+ Collections.min(lista, new CompararEdad()));
	
	
	//intercambiar un dato con otro
	Collections.swap(lista, 0, 5);
	System.out.println("lista intercambiada \n"+lista);
	
	
	//replaceAll remplaza el elemento antiguo por uno nuevo,
	//si esta repetido lo remplaza en todas
	Collections.replaceAll(lista, p3, p4);
	System.out.println("Remplaza \n"+lista);
	
	//fill inicializar
	//Collections.fill(lista, p6);
	//System.out.println("Solo con G "+ lista);
	
	//copiar una lista dentro de otra
	List<Persona> copia=new ArrayList<>();
	for(int i=0; i<lista.size(); i++) {
	copia.add(p1);
	}
	Collections.copy(lista, copia);
	System.out.println("Vemos la copia \n" + lista);
	
	//shufle barajea de forma aleatoria
	Collections.shuffle(copia);
	System.out.println("Barajeado \n"+copia);
	
	//buscar cuantas veces se repite un elemento
	System.out.println("Frecuencia de p1 --> "+Collections.frequency(copia, p1));
	
	}

}
