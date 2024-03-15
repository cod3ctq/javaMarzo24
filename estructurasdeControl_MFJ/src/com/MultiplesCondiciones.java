package com;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplesCondiciones {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String placas = "";
		double monto = 55.80;

		/*
		//Utilizamos el metodo split para separar el nombre por coma 
		String nombreCompleto = "Pablo Marmol AC";
		             //Ejemplo [Pablo, Marmol, AC]
		String [] array = nombreCompleto.split(" ");
		System.out.println(Arrays.toString(array));
		
		
		//Usamos placas punto substring para obtener un numero de la cadena de texto que contiene la variable
		System.out.println(placas.substring(5));
		
		//Equals se utiliza para comparar objetos
		if (placas.substring(5).equals("02")) {
			
			System.out.println("Pago: " + (monto * 1.15));
		}
		else if(placas.substring(5).equals("04")) {
			System.out.println("Pago: " + (monto * 1.30));
		}
		else if(placas.substring(5).equals("06")) {
			System.out.println("Pago: " + (monto * 1.45));
		}
		else if(placas.substring(5).equals("08")) {
			System.out.println("Pago: " + (monto * 1.60));
		}
		else {
			System.out.println("Pago: " + (monto * 1.75));
		}
*/
		
		System.out.println("Ingresa placa:" );
		placas = sc.nextLine();
		
		int x = sc.nextInt();
		
		switch (placas.substring(5)) {
			
		case "02":
			System.out.println("Pago: " + (monto * 1.15));
			
			break;
			
		case "03": 
			System.out.println("Pago: " + (monto * 1.30));
			
			break;
			
		case "04":
			System.out.println("Pago: " + (monto * 1.45));
			
			break;
			
		case "05": 
			System.out.println("Pago: " + (monto * 1.60));
			
			break;
			
		default: 
			System.out.println("Pago: " + (monto * 1.75));
		}
	}
}
