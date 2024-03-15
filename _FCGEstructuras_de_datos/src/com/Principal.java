package com;

public class Principal {

	public static void main(String[] args) {
		// if, if-else, switch

		int z = 10;
		int x = -30;
		int y = 400;	
			
			       //true false true : false
		System.out.println(z <= 90 && x>5 && (y%2==0));

		if (z <= 90 && x>5 && (y%2==0)); {

			System.out.println("Si");			
			
		} 
		System.out.println("No");

		
		//OR
		// false        false
		if(z>=90 || (y%2==1)){
		System.out.println("no");
		}else {
			System.out.println("no");
		}
		
		//NOt
		if (!(y<700)) {
		System.out.println("Si es menor");
		}else {
			System.out.println("No es menor");
			
		}
		//Diferente de
				if (!(y<700)) {
					System.out.println("Si");
				}else {
					System.out.println("No");
					
				}
		
		//Comparador
		
		if (y==600) {
			System.out.println("Si");
		}else {
			System.out.println("No");
			
		}
				
		
	

	        //   Diferente de
					if (!(y<700)) {
						System.out.println("Si");
					}else {
						System.out.println("No");
						
					}
	}
}

