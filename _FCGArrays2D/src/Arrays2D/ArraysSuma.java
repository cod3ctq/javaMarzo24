package Arrays2D;

import java.util.Arrays;

public class ArraysSuma {
	public static void main(String[] args) {
		
		
		String[][] matriz1 = { { "6", "4", "9", "g" },
	                           { "u", "3", "4", "1" },	
	                           { "9", "6", "h", "2" },
	                           { "6", "z", "3", "8" }};
		
		String[][] matriz2 = { { "5", "b", "2", "e" },
				               { "a", "7", "r", "8" },	
				               { "8", "6", "h", "s" },
				               { "q", "z", "3", "8" }};
		
		int [][] matriz3 = new int [4][4];
		String numeros = "1234567890";
		
		for(int i = 0; i <matriz1.length; i++) {
			for (int k = 0; k < matriz1[i].length; k++) {
				if(numeros.indexOf(matriz1[i][k]) >= 0 && numeros.indexOf(matriz2[i][k]) >= 0) {
					matriz3[i][k]= Integer.parseInt(matriz1[i][k] + Integer.parseInt(matriz2[i][k]));
					
				}else {
					matriz3[i][k]= 0;
				}
			}
		}
		System.out.println(Arrays.deepToString(matriz3));
		
		//descomentar y comentar el otro for para correr
		
		//		for(int i=0; i<matriz1.length; i++) {
//			   for (int j = 0; j < matriz1[i].length; j++) {
//			    try {
//			     //Integer solamente funciona con números enteros
//			     matriz3 [i][j]= Integer.parseInt(matriz1 [i][j]) + Integer.parseInt(matriz2[i][j]);
//			    }catch(Exception ex){
//			     ex.printStackTrace();
//			     matriz3[i][j]=0;
//			    }
//			   }
//			  }
		
				
			
		
				
	}
}

