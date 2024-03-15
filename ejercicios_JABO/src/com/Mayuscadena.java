package com;

import java.util.Scanner;

public class Mayuscadena {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa una frase: ");
		String frase = sc.nextLine();
		
		boolean m = false;
		char temp = ' ';
		String dicc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		int c = 0;
		while(c<frase.length()) {
			temp = frase.charAt(c);
			if(dicc.indexOf(temp)>=0){
				m = true;
				break;
			}
			c++;
			
//			if((temp > 65 && temp <=90)|| temp == 165) {
//				m = true;
//				break;
//			}
			
		}
		
		if(m == true) {
			System.out.println("Al menos hay una mayuscula en la frase");
		}else {
			System.out.println("No hay mayusculas");
		}
		
		
		
		
		
		
		
		
		
	}

}
