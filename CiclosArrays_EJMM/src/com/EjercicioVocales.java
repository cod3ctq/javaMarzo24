package com;

import java.util.Scanner;
import java.util.Arrays;

public class EjercicioVocales {

	public static void main(String[] args) {

		String vocales = "ÁAáaÉEéeÍIíiÓOóoÚUúu";
		String consonantes = "bcdfghjklmnñpqrstvwxyz";
		int NumVocales = 0;
		int NumConsonantes = 0;
		int PosicionEncontrada;

		String letra = "";

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa tu nombre completo: ");
		String NombreCompleto = sc.nextLine();

		String[] ArregloNombre = new String[NombreCompleto.length()];
		for (int i = 0; i <= ArregloNombre.length - 1; i++) {
			ArregloNombre[i] = Character.toString(NombreCompleto.charAt(i));

		}
		for (int k = 0; k <= ArregloNombre.length - 1; k++) {
			letra = ArregloNombre[k];
			letra = letra.toLowerCase();
			// Determinar si es una vocal
			if (vocales.indexOf(letra) >= 0) {
				NumVocales++;

			} else if (consonantes.indexOf(letra) >= 0) {
				NumConsonantes++;

			}

		}
		System.out.println("Numero total de vocales: " + NumVocales);
		System.out.println("Numero total de consonantes: " + NumConsonantes);

//Pedir mediante teclado nombre completo

//Con un array almacenar el nombre

//Contar las vocales e imprimirlo en pantalla 

	}
}
