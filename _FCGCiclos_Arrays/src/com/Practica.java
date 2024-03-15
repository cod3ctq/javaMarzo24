package com;

import java.util.Arrays;

public class Practica {
	public static void main(String[] args) {

		String original = "Texto de prueba de marzo de 2024"; // solo minisculas
		// ufyup ef qsvfcb
		String cifrado = "";

		String[] abc = { "a", "b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
				"u", "v", "x", "y", "z" };

		String letra = "";

		String[] arrayOriginal = original.split("");// .split corta o separa los elementos y te los de vuelve en un
													// array
		System.out.println(Arrays.toString(arrayOriginal));

		// Itera sobre el original para asilar un caracter a la vez
		for (int i = 0; i < arrayOriginal.length; i++) {
			letra = arrayOriginal[i];
			letra = letra.toLowerCase();// convierte las letras en minusculas

			if (letra.equals("z")) {
				cifrado = cifrado + "a";
			} else {
				if (letra.equals(" ")) {
					cifrado = cifrado + "-";
				} else {// Itera para determinar en que posicion del abc esta la letra actual
					for (int j = 0; j < abc.length; j++) {
						// "e" == "e"
						if (abc[j].equals(letra)) {
							cifrado = cifrado + abc[j + 1];
						}
					}

				}

			}
		}
		System.out.println("Resultado : " + cifrado);
	}// String [] vals = new String[10];
		// System.out.println.toString
}