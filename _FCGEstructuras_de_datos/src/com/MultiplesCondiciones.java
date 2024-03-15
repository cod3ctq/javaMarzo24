package com;

import java.util.Scanner;

import java.util.Arrays;

public class MultiplesCondiciones {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String placas = "";
		double monto = 55.80;

//		System.out.println(placas.substring(5)); // el cinco es el numero de letras
		// 60

//		String nombreCompleto = "Pablo Marmol Ac";
//		String[] array = nombreCompleto.split("");
//		System.out.println(Arrays.toString(array));
// 		
//		
//		
//		if(placas.substring(5).equals("02")) {
//			System.out.println("Pago: " + (monto * 1.15));
//			
//		}else if(placas.substring(5).equals("04")) {
//		   System.out.println("Pago: " + (monto * 1.30 ));
//		   
//		}else if(placas.substring(5).equals("06")) {
//			   System.out.println("Pago: " + (monto * 1.454 ));
//		
//		}else if(placas.substring(5).equals("08")) {
//			   System.out.println("Pago: " + (monto * 1.60 ));
//			   
//	  
//		
//	    }  else{
//		     System.out.println("Pago: " + (monto * 1.75 ));
//	    }
		
		System.out.println("Ingrese la placa");
		placas = sc.nextLine();
				
		switch (placas.substring(5)) {

		case "02":
			System.out.println("Pago: " + monto * 1.15);
			break;
		case "04":
			System.out.println("Pago: " + monto * 1.30);
			break;
		case "06":
			System.out.println("Pago: " + monto * 1.45);
			break;
		case "08":
			System.out.println("Pago: " + monto * 1.60);
			break;
		default:
			System.out.println("Pago: " + monto * 1.75);

		}
	}

}
