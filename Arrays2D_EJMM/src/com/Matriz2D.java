package com;

import java.util.Arrays;

public class Matriz2D {

	public static void main(String[] args) {

		String[][] Matriz1 = new String[4][4];
		String[][] Matriz2 = { { "a", "b", "c", "d", }, 
				                { "1", "2", "3", "4" }, 
				             { "w", "x", "y", "z" }, };

		System.out.println(Arrays.deepToString(Matriz1));
		System.out.println(Arrays.deepToString(Matriz2));

		// Iterar sobre filas
		for (int i = 0; i < Matriz2.length; i++) {
			System.out.println(Arrays.toString(Matriz2[i]));
			// Iterar sobre columnas
			for (int j = 0; j < Matriz2[i].length; j++) {
				System.out.println(Matriz2[i][j]);
			}
			

		}

	}

}
