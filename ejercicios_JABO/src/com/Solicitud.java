package com;

import java.util.Scanner;

public class Solicitud {
	public static void main(String[] args) {
		System.out.println("---------------------------------------------------------------------------------------------------------");
		System.out.println("PROGRAMA QUE CALCULA LA ACEPTACION DE UNA SOLICITUD EN BASE A LOS SIGUIENTES PARAMETROS: edad, nota y sexo");
		
		int nota, edad;
		char sexo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa la nota: ");
		nota = sc.nextInt();
		System.out.println("Ingresa la edad: ");
		edad = sc.nextInt();
		System.out.println("Ingresa el sexo de la persona: ");
		sexo = sc.next().charAt(0);
		
		
//		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
//		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
//		* Otros casos -> NO ACEPTADA
		
		if(nota > 5 && edad == 18){
			if(sexo == 'M'){System.out.println("Posible aceptación de la solicitud");}
			else if(sexo == 'F') {
				System.out.println("Solicitud aceptada");
			}
			
		}else {
			System.out.println("Vuelva a intentarlo");
		}
	}
}
