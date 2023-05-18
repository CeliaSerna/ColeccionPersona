package com.cursoceat.modell;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Persona {

	
	static int idT;
	private int id;
	private String nombre;
	private String dni;
	private LocalDate fechaNaci;
	
	
	public Persona(String nombre, String dni, String fechaNaci) {
		
		this.nombre = nombre;
		this.dni = dni;
		this.id= ++idT;
		DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd-MM-yyyy");
		this.fechaNaci = LocalDate.parse(fechaNaci, formato);
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
	
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", dni=" + dni + ", fechaNaci=" + fechaNaci + "]";
	}
	
	//metodo que compara dos objetos y decide si son iguales, true si son iguales
	@Override
	public boolean equals(Object objeto) {
		return dni.equals(((Persona)objeto).dni);
	}
	
	
}
