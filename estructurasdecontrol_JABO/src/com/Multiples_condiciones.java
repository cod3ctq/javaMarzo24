package com;

//import java.util.Arrays;
import java.util.Scanner;

public class Multiples_condiciones {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String placas; //String placas = "SJM-P06";
		
		double monto = 55.80;
		
		
		System.out.println("Ingresa la placa: ");
		placas = sc.nextLine();
		
		System.out.println(placas.substring(5)); //recorta un string desde la posicion 5 hasta donde llegue la cadena 
		//			"06"
		
		if(placas.substring(5).equals("02")){
			System.out.println("Pago: "+ (monto * 1.15));
			if(placas.charAt(4) == 'P') {//El metodo CharAt retorna un solo caracter de una posicion del string y lo comparamos con cierto caracter P
				System.out.println("Este vehiculo cirucla Martes y Jueves");
			}
		}else if(placas.substring(5).equals("04")){
			System.out.println("Pago: "+ (monto * 1.30));
		}else if(placas.substring(5).equals("06")){
			System.out.println("Pago: "+ (monto * 1.45));
		}else if(placas.substring(5).equals("08")){
			System.out.println("Pago: "+ (monto * 1.60));
		}else {
			System.out.println("Pago: "+ (monto * 1.75));
		}
		
		//Un ejemplo sencillo de array
		
//		String nombreCompleto = "Pablo Marmol Ac";
//		String[] array = nombreCompleto.split(" ");
//		System.out.println(Arrays.toString(array));
		
		
		System.out.println("Ingresa la placa: ");
		placas = sc.nextLine();
		switch(placas.substring(5)) { // funciona con strings, char y enteros
		
		case "02":
			System.out.println("Pago: "+ (monto * 1.15));
			break;
		case "04":
			System.out.println("Pago: "+ (monto * 1.30));
			break;
	
		case "06":
			System.out.println("Pago: "+ (monto * 1.45));
			break;
			
		case "08":
			System.out.println("Pago: "+ (monto * 1.60));
			break;
		
			default:
				System.out.println("Pago: "+ (monto * 1.75));
		}
			
		
		
		
	
		
		
		
		
		
	}
}
