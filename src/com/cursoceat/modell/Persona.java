package com.cursoceat.modell;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;



public class Persona implements Comparable<Persona> {

	
	static int idT;
	private int id;
	private String nombre;
	private String dni;
	private LocalDate fechaNaci;
	private Integer edad;
	
	public Persona(String nombre, String dni, String fechaNaci) {
		
		this.nombre = nombre;
		this.dni = dni;
		this.id= ++idT;
		DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd-MM-yyyy");
		this.fechaNaci = LocalDate.parse(fechaNaci, formato);
	    this.edad=edad();
	}
	
	
	public Persona() {
		
	}


	public Persona(String dni) {
		
		this.dni = dni;
	}


	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDni() {
		return dni;
	}
	public LocalDate getFechaNaci() {
		return fechaNaci;
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public void setFechaNaci(LocalDate fechaNaci) {
		this.fechaNaci = fechaNaci;
	}
	
	public int edad() {
		return (int)fechaNaci.until(LocalDate.now(), ChronoUnit.YEARS);
	}
	
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", dni=" + dni + ", fechaNaci=" + fechaNaci + "]\n";
	}
	
	
	//metodo que compara dos objetos y decide si son iguales, true si son iguales
	@Override
	public boolean equals(Object objeto) {
		return dni.equals(((Persona)objeto).dni);
	}
  
	@Override
	public int compareTo(Persona o) {
		return edad.compareTo(o.edad);
	}
/**
	@Override
	public int compareTo(Persona o) {
		
		return dni.compareTo(o.dni);
	}
	public int compareTo(Persona o) {
		return nombre.compareTo(o.nombre);
	}
	**/
}
