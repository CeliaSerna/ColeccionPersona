package com.cursoceat.modell;

import java.util.Comparator;

public class CompararEdad implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		
		return o1.edad()-o2.edad();
	}

} 


