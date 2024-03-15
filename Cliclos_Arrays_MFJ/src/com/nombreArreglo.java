package com;

import java.util.Scanner;

public class nombreArreglo {
	
	public static void main (String [] args) {
		String vocales = "AaEeIiOoUu";
		String nombre;
		int lon;
		int valor = 0;
		
		Scanner n = new Scanner(System.in);
		
		System.out.println("Ingresa tu nombre: ");
		nombre = n.nextLine();
		
		lon = nombre.length();
		char[] ar = new char[lon];
		
		for(int i = 0; i<ar.length; i++) {
			ar[i] = nombre.charAt(i);
		}
		for(int i = 0; i<ar.length; i++) {
			int pos = vocales.indexOf(ar[i]);
			if(pos!=-1) {
				valor ++;
			}
			
		}
		System.out.println("Cantidad: " + valor );
	}

}
