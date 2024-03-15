package com;
import java.util.Scanner;

public class Main_exercises {
	public static void main(String[] args) {
		System.out.println("EJERCICIO QUE TOMA DOS NUMERO DE TECLADO, LOS COMPARA Y DETERMINA SI UNO ES MAYOR O SIN AMBOS SON IGUALES");
		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el valor de x: ");
		x = sc.nextInt();
		System.out.println("Ingresa el valor de y: ");
		y = sc.nextInt();
		
		if(x > y) {System.out.println("El numero mayor es: "+ x);
		}else if(y > x) {System.out.println("El numero mayor es: "+ y);}else { System.out.println("Ambos son iguales");}
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
	}
}
