package com;

import java.util.Scanner;
public class Par_impar {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------------------------------------------------------------------------------------------------------");
		System.out.println("EJERCICIO QUE TOMA UN NUMERO DE TECLADO, VERIFICA SI ES PAR O IMPAR");
		
		System.out.println("Ingresa el valor del numero a verificar: ");
		n = sc.nextInt();
		
		if(n%2==0) {System.out.println("Es par");
		}else{System.out.println("Es impar");}
		
	}
}
