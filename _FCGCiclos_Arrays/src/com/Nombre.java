package com;

import java.util.Arrays;
import java.util.Scanner;

public class Nombre {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa tu nombre completo");
		String Arraynombre = sc.nextLine();

		String[] nombre = new String[Arraynombre.length()];

		for (int i = 0; i < nombre.length; i++) {
			System.out.println("Ingrese un valor");
			nombre[i] = sc.nextLine();
		}
		for (int i = 0; i < nombre.length; i++) {
			System.out.println(nombre[i]);
		}

		System.out.println(Arrays.toString(nombre));

		int contador = 0;
		String vocals = "AaEeIiOoUu";

		for (int i = 0; i < nombre.length; i++) {
			System.out.println(nombre[i]);

			if (vocals.indexOf(nombre[i]) >= 0) { // indexOf compara la variable vocals con la entrada del nombre
				contador++;
			}

		}
		System.out.println("El numero de vocales es " + contador);
	}
}
