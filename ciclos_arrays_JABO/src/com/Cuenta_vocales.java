package com;

import java.util.Arrays;
import java.util.Scanner;

public class Cuenta_vocales {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa tu nombre: ");
		String nombre = sc.nextLine();
		
		String[] name = new String[nombre.length()];

		System.out.println("Ingresa tu nombre, letra por letra");
		for (int i = 0; i < name.length; i++) {
			name[i] = sc.nextLine();
		}

		int count = 0;
		String vocals = "aeiouAEIOU";
		for (int i = 0; i < name.length; i++) {
			System.out.println(">>>"+name[i]);
			
			if (vocals.indexOf(name[i]) >= 0) {
				count++;
			}
			// System.out.println(name[i]);
		}

		System.out.println("El numero de vocales encontradas es: " + count);

	}
}
