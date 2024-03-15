package com;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[]args) {
		
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Ingresa el primer numero");
		int num1 = sc.nextInt();
		
		System.out.println("Ingresa el segundo numero");
		int num2 = sc.nextInt();
		
 		if (num1 > num2){
 		System.out.println("El primer numero es mayor al segundo");
 		} else if (num1 == num2) {
 			System.out.println("Son iguales");
 		}  else {
 		    System.out.println("El segundo numero es mayor al primero");
 		}
	}
	}
		
 

