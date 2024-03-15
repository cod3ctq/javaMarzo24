package com;

import java.util.Arrays;
import java.util.Iterator;

public class Ejercicio2 {
	
	public static void main(String [] args) {
		
		String original = "Texto de prueba trece de marzo de 2024";
						 //ufyup ef qsvfcb		
		
		String cifrado = "";
		
		
		String[] abc = {"a","b","c","d","e","f","g","h","i","j",
				        "k","l","m","n","ñ","o","p","q","r","s",
				        "t","u","v","w","x","y","z"};
		
		String letra = "";
		
		String [] arrayOriginal = original.split("");
		System.out.println(Arrays.toString(arrayOriginal));
		
		
		//Itera sobre el original para aislar un caracter a la vez
		for(int i = 0; i < arrayOriginal.length; i++) {
			letra = arrayOriginal[i];
			
			//toLowerCase para convertit las mayusculas a minusculas
			letra = letra.toLowerCase();
			
			//Iterar para determinar en que posicion 
			//del abc esta la letra actual
			
			if(letra.equals("z")) {
				cifrado = cifrado + "a";
			}
			else if(letra.equals(" ")) {
				cifrado = cifrado + "-";
			}
			else {
				//Iterar para determinar en que posicion del abc esta en 
				//abc 
				for(int j = 0; j < abc.length; j++) {
				   //  "e" == "e"
					if(abc[j].equals(letra)) {
						cifrado = cifrado + abc[j+1];
					}
				}
			}
		}
		System.out.println("Resultado: " + cifrado);
		
		/*Para mostrar todos los datos del arreglo entre llaves*/
		/*String [] vals = new String [] */
		/*System.out.println(Arrays.toString(vals)) */
	}
}