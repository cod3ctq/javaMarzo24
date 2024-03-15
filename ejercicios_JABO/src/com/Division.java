package com;

import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
		
		int d1,d2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------------------------------------------------------------------------------------------------------");
		System.out.println("EJERCICIO QUE TOMA DOS NUMEROS DE TECLADO, OBTENEMOS SU DIVISION, EN CASO DE SER EL SEGUNDO NUMERO 0 DAR UN MENSAJE DE ERROR");
		
		System.out.println("Ingresa el valor del numero 1: ");
		d1 = sc.nextInt();
		System.out.println("Ingresa el valor del numero 2: ");
		d2 = sc.nextInt();
		
		if(d2 != 0) {
			System.out.println("El resultado de la división es: "+ (d1/d2));
		}else {System.out.println("El divisor es 0, escribe otro nuevamente");}
	}

}
