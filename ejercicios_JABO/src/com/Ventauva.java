package com;
import java.util.Scanner;

public class Ventauva {
	public static void main(String[] args) {
	
		//Precio inicial al kg de uva
		//Tipos A y B
		//Tamaños 1 y 2

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa un precio por kilo de uva: ");
		double precio = sc.nextDouble();
		
		System.out.println("Ingresa el tipo de uva, es A o B: ");
		char tipo = sc.next().charAt(0);
		
		System.out.println("Ingresa el tamaño de uva vendida, puede ser 1 o 2: ");
		int tam = sc.nextInt();
		
		if(tipo == 'A' || tipo == 'a') {
			if(tam == 1) {
				precio = precio + 0.20;
				System.out.println("El precio final es de: "+ precio);
			}else if(tam == 2) {
				precio = precio + 0.30;
				System.out.println("El precio final es de: "+ precio);
			}
		}else if(tipo == 'B' || tipo == 'b') {
			if(tam == 1) {
				precio = precio - 0.30;
				System.out.println("El precio final es de: "+ precio);
			}else if(tam == 2) {
				precio = precio - 0.50;
				System.out.println("El precio final es de: "+ precio);
			}
		}
		
		
		
		
		
		
		
		
	
	}
}
