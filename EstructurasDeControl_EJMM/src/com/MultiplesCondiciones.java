package com;

import java.util.Arrays;
import java.util.Scanner;
public class MultiplesCondiciones {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		String placas = "";
		//En el espacio tenia placas como EJMM-KM08 
		double monto = 55.80;
		String nombreCompleto = "Erick Mazadiego Mariani";
		String[] array = nombreCompleto.split(" ");
		System.out.println(Arrays.toString(array));
		
		//Aquí el array busca el espacio y separa con , el nombre por partes
		
		System.out.println("Ingresa la placa");
		placas = sc.nextLine();
		
		//El sc.next (Scanner) es para poder ingresar desde teclado
		
		//int x = sc.nextInt()
				
		// También sirve para cualquier primitivo hay un sc.next para cada método		
		
		System.out.println(placas.substring(7)); //Cuenta desde el 0 inicia izq
		// El substring es para tomar cierta parte de la cadena
		
		if(placas.substring(7).equals("02")) {
			//Se utiliza equals al ser objetos como si fuera el comparador
			System.out.println("Pago: " + (monto *1.15));
		}else if(placas.substring(7).equals("04")) {
			System.out.println("Pago: " + (monto *1.30));
		}else if(placas.substring(7).equals("06")) {
			System.out.println("Pago: " + (monto *1.45));
		}else if(placas.substring(7).equals("08")) {
			System.out.println("Pago: " + (monto *1.60));
		}else {
			System.out.println("Pago: " + (monto * 1.75));
		}
		
		
		switch(placas.substring(7)) {
		
		case "02":
		    System.out.println("Pago: " + (monto * 1.15));
		    break;
		    
		case "04":
		    System.out.println("Pago: " + (monto * 1.30));
	        break;
	    
		case "06":
		    System.out.println("Pago: " + (monto * 1.45));
	        break;
	        
		case "08":
		    System.out.println("Pago: " + (monto * 1.60));
	        break;    
		    
	        default:
	        	System.out.println("Pago: " + (monto * 1.75));
	        	
		    //Switch: Estructura que evalúa más de un caso
	        //Break: Evalua el caso en el que entra y se detiene
	        // si no se pone evalua todas las condiciones.	
		}
		
	}
}
