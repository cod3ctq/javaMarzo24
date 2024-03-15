package Arrays2D;

import java.util.Arrays;

public class Arrays2D {
	public static void main(String[] args) {

		String[][] matriz1 = new String[4][4];
		String[][] matriz2 = { { "a", "b", "c", "d" }, { "1", "2", "3", "4" }, { "w", "x", "y", "z" } };

		// sirve para imprimir el contenido de una matriz
		System.out.println(Arrays.deepToString(matriz1));
		System.out.println(Arrays.deepToString(matriz2));

		// itera sobre filas
		for (int i = 0; i < matriz1.length; i++) {
			System.out.println(Arrays.toString(matriz2[i]));
			// iterar sobre columnas
			for (int j = 0; j < matriz1[i].length; j++) {
				System.out.println(matriz2[i][j]);
			}

		}
	}
}