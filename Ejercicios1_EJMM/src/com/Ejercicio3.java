package com;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa el primer numero");
		int num1 = sc.nextInt();
		
		System.out.println("Ingresa el segundo numero");
		int num2 = sc.nextInt();
		
		if (num2 == 0) {
		System.out.println("Error ");
	}else {
		float resultado = (num1/num2);
		System.out.println("Resultado: " + resultado);
		
	}
	}
}
