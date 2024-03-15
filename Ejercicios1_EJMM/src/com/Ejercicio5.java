package com;

import java.util.Scanner;

public class Ejercicio5 {
	
	public static void main(String[]args) {
		
		float Nota = 0.0f;
		int Edad = 0;
		char Sexo; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Anota valor de Nota: ");
		Nota = sc.nextFloat();
		System.out.println("Anota valor de Edad: ");
		Edad = sc.nextInt();
		System.out.println("Anota Sexo: ");
		Sexo = sc.next().charAt(0); 
		
		if (Nota >=5 && Edad >= 18) {
			
	if(Sexo == 'M') System.out.println("POSIBLE");
	else System.out.println("ACEPTADA");
	
		}
		else System.out.println("Bateado");
	}

}
