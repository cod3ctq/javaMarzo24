package com;

import java.util.Arrays;
import java.util.Scanner;

public class Sumatrices {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[][] matrix1 = {{"7","9","x","5"},
				  			  {"3","f","2","g"},
				              {"t","s","n","2"},
				              {"g","a","4","y"},
				              };
		String[][] matrix2 = {{"5","a","z","3"},
							  {"m","z","6","2"},
							  {"w","2","1","3"},
							  {"3","i","1","0"},
							  };
		
		int [][] matrix3 = new int[4][4];
		
		
		  String numeros = "1234567890";
		  for (int i=0; i<matrix1.length; i++){//filas
			  for (int j=0; j<matrix1[i].length; j++) {//columnas
				  if(numeros.indexOf(matrix1[i][j]) >= 0 && numeros.indexOf(matrix2[i][j]) >= 0){
					  matrix3[i][j]= Integer.parseInt(matrix1[i][j]) + Integer.parseInt(matrix2[i][j]);
				  }else {
					  matrix3[i][j] = 0;
				  }
			  }
		  }
		  
		  //Uso con el try - catch
		/*  for(int i=0; i<matrix1.length; i++) {
			   for (int j = 0; j < matrix1[i].length; j++) {
				   try {
					   //Integer solamente funciona con números enteros
					   matrix3 [i][j]= Integer.parseInt(matrix1 [i][j]) + Integer.parseInt(matrix2[i][j]);
				   }catch(Exception ex){
					   ex.printStackTrace();
			     	   matrix3[i][j] = 0;
				 }
			   }
		  }*/
		  
		  System.out.println(Arrays.deepToString(matrix3));
	}
}
