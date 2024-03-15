package com;

import java.util.Arrays;

public class Ejercicio1Matrices {

		public static void main(String[] args) {

			String[][] Matriz1 = { { "9", "6", "c", "6", "e" }, 
	                             { "1", "2", "z", "4", "5" }, 
	                             { "7", "8", "y", "7", "6" },  
			                     { "1", "2", "z", "5", "4" }, 
                                 { "4", "1", "y", "7", "ñ" },  }; 
			
			String[][] Matriz2 = { { "3", "b", "0", "d", "e" }, 
					             { "7", "2", "3", "d", "5" }, 
					             { "4", "3", "1", "z", "9" },  
			                     { "g", "9", "z", "5", "8" }, 
                                 { "k", "p", "y", "0", "6" },  };
			
			String Numeros= "0123456789";
			
			int [][]MatrizResul = new int [5][5]; 

			System.out.println(Arrays.deepToString(Matriz1));
			System.out.println(Arrays.deepToString(Matriz2));

		    // Iterar sobre filas
	        for (int i = 0; i < Matriz1.length; i++) { //Filas
	            // Iterar sobre columnas
	            for (int j = 0; j < Matriz2[i].length; j++) {//Columnas
	                // Verificar si se puede convertir a entero
	            	if ((Numeros.indexOf(Matriz1[i][j])) >=0 && (Numeros.indexOf(Matriz2[i][j]))>=0){
	            		
	                    // Convertir a entero y sumar
	                    int Num1 = Integer.parseInt(Matriz1[i][j]);
	                    int Num2 = Integer.parseInt(Matriz2[i][j]);
	                    MatrizResul[i][j] = Num1 + Num2;
	                } else {
	                    // Si no se puede convertir, asumir 0
	                    MatrizResul[i][j] = 0;
	                }
	            } 
	        }
//ex.printStackTrace(); Es para ver que exception es la que manda
	        // Imprimir la matriz resultante
	        System.out.println(Arrays.deepToString(MatrizResul));
	    }
}


