package com;

import java.util.Scanner;
public class Viaje_alumnos {
	public static void main(String[] args) {
		System.out.println("PROGRAMA QUE DESARROLLA UN ALGORITMO DE SISTEMA DE COBRANZA DE AGENCIA DE VIAJES PARA ESCUELA");
		
//		La forma de cobrar es la siguiente:
//			* Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
//			* De 50 a 99 alumnos, el costo es de 70 euros.
//			* De 30 a 49 alumnos, el costo es de 95 euros.
//			* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos.
		
		Scanner sc = new Scanner(System.in);
		int pagoTotal = 0;
		
		System.out.println("¿Cuantos alumnos viajan?: ");
		int alumnos = sc.nextInt();	
		
		System.out.println("Ingresa la opcion correspondiente del menu: ");
		System.out.println("Elige opción:\n1.- 100 alumnos o mas viajan" +
				"\n2.- 50 a 99 alumnos viajan\n" +
				"3.- 30 a 49 alunmnos viajan\n" +
				"4.- Menos de 30 alumnos viajan\n");
		int opc = sc.nextInt();
		switch(opc) { 
		case 1:
			System.out.println("Pago de viaje: "+ (alumnos * 65)+ " euros");
			break;
		case 2:
			System.out.println("Pago de viaje: "+ (alumnos * 70)+ " euros");
			break;
	
		case 3:
			System.out.println("Pago de viaje: "+ (alumnos * 95)+ " euros");
			break;
			
		case 4:
			System.out.println("Pago de viaje es de 4000 euros");
			break;
		
			default:
				System.out.println("Gracias por su preferencia");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
