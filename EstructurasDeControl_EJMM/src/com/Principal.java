package com;

public class Principal {
	public static void main(String[]args ) {
		
		//if, if-else, switch
	
	int z = 100;
	int x = -30;
	int y = 400;
	
	                   //True   False    True: False
	// AND
	
	System.out.println(z>=90 && x>5 && (y%2==0));
	
	if (z>=90 && x>5 && (y%2==0)) { //El % es para mostrar división
		System.out.println("Si");
		
	}else {
		System.out.println("No");
		
	
	// OR
	
	}
	if (z>=90 || x>5 ) { //El || es el OR
		System.out.println("Si");
		
	}else {
		System.out.println("No");
		
	}
	
	//NOT
	
	if(!(y<700)) { //El ! es el NOT
		System.out.println("Si es menor");
		
	}else {
		System.out.println("No es menor");
	} 
	
	//Diferente de o conocido como es distinto
	
	if(!(y!=400)) { //El != es el XOR
		System.out.println("Si es igual");
		
	}else {
		System.out.println("No es igual");
	} 
	
	//Comparador o conocido como es igual
	
	if(y==500) { //El == es el IGUAL
		System.out.println("Si es igual");
		
	}else {
		System.out.println("No es igual");
	} 
	
	
	
  }
}