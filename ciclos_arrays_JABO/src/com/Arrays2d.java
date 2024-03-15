package com;

import java.util.Arrays;

public class Arrays2d {
	public static void main(String[] args) {
		String[][] matriz1 = new String[4][4];
		String[][] matriz2 = {{"a","b","c","d"},
							  {"1","2","3","4"},
							  {"w","x","y","z"}
							  };
		
		
		System.out.println(Arrays.deepToString(matriz1));
		System.out.println(Arrays.deepToString(matriz2));//imprime toda la matriz en una solo la linea el deepToString();
		
		//iterar sobre filas
		for (int i = 0;i < matriz2.length; i++) {//el toString funciona con un ciclo, e imprimimos un array simple linea por linea
			//System.out.println(Arrays.toString(matriz2[i]));
			
			//iterar sobre columnas
			for(int j = 0;j < matriz2[i].length; j++) {
				System.out.println(matriz2[i][j]);
			}
		}
	}
}
