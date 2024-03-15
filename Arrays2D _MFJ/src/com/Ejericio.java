package com;

import java.util.Arrays;

public class Ejericio {
	
	public static void main(String [] args) {
		
		String [][] arreBi1 = {{"7","9","x","5"},
							   {"3","f","2","g"},
							   {"t","s","ñ","9"},
							   {"f","4","q","2"}}; 
		
		String [][] arreBi2 = {{"5","a","z","3"},
				   			   {"m","z","6","2"},
				               {"r","t","3","c"},
				               {"7","9","v","e"}};
		
		String numeros = "1234567890";
		
		
		int [][] res = new int [4][4];
		
		for(int i = 0; i < arreBi1.length; i++) {
			
			for(int j = 0; j < arreBi1[i].length; j++) {
				
				if (numeros.indexOf(arreBi1[i][j]) >=0 && numeros.indexOf(arreBi2[i][j])>=0) {
					res[i][j]=Integer.parseInt(arreBi1[i][j]) + Integer.parseInt(arreBi2[i][j]);
				}
				else {
					res[i][j]=0;
				}
			}
		}
		System.out.println(Arrays.deepToString(res));
	}

}
