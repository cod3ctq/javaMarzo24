package com;

import java.util.Arrays;
import java.util.Iterator;

public class EjercicioClase {

	public static void main(String[] args) {

		String Original = "Texto de prueba 13 de marzo 2024";

		String Cifrado = "";

		String[] abc = { "a", "b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s",
				"t", "u", "v", "w", "x", "y", "z" };
		String Letra = "";
		String[] arrayOriginal = Original.split("");
		System.out.println(Arrays.toString(arrayOriginal));

		// Itera sobre el original para aislar un caracter a la vez

		for (int i = 0; i < arrayOriginal.length; i++) {
			Letra = arrayOriginal[i];
			Letra = Letra.toLowerCase();

			// Iterar para determinar en que posicion del abc
			// está la letra actual

			if (Letra.equals("z")) {
				Cifrado = Cifrado + "a";
			} else if (Letra.equals(" ")) {
				Cifrado = Cifrado + "-";
			} else {

				for (int j = 0; j < abc.length; j++) {

					if (abc[j].equals(Letra)) {

						Cifrado = Cifrado + abc[j + 1];
					}
					// Evalua si la letra actual es una 'z'

				}

			}
		}
		System.out.println("Resultado: " + Cifrado);

	}
}