package com;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[]args) {
		
	
	Scanner sc = new Scanner(System.in);
	 
	int c = 0;
	char temp;
	boolean ExisteMayuscula = false;
	String dicc = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
	
	System.out.println("Inserte una frase");
	String frase = sc.nextLine();
    
    while (c<frase.length()) {
    	temp = frase.charAt(c);
    	int Posicion = dicc.indexOf(temp);
    	if (Posicion >=0 && Posicion <=26 ) {
    		ExisteMayuscula  = true;
    		
    		break;
    	}
	c++;
	

	}
    
    if (ExisteMayuscula ) { // Es igual si pones el ExisteMayuscula  == true a que si se deja la frase sola.
    	System.out.println("Se encontró una mayuscula");
    
    }else {
    	System.out.println("Nadota");
    }
    
	}

}
