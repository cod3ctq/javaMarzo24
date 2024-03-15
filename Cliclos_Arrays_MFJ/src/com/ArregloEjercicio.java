package com;
import java.util.Scanner;

public class ArregloEjercicio {
	
	public static void main (String [] args) {
		
		String palabra;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa tu nombre: ");
		palabra = sc.nextLine().toLowerCase();
		
		char[] letras = palabra.toCharArray();
		int contarVocales = contarVocales(letras);
		System.out.println("La palabra tiene: " + contarVocales);
		
	}
	public static int contarVocales(char[] letras){
		int contador = 0;
		for (char letra : letras) {
			if (esVocal(letra)) {
				contador++;
			}
		}
		return contador;
	}
	public static boolean esVocal(char letra) {
		return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
	}

}
/*String nombre;
		int rec;
		
		Scanner n = new Scanner(System.in);
		
		System.out.println("Ingresa tu nombre");
		nombre = n.nextLine().toLowerCase();
		*/