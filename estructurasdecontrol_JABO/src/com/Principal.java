package com;

public class Principal {
	public static void main(String[] args) {
	
		//if, if-else, switch
		
		int z =10;
		int x = -30;
		int y = 400;
		
		//CONDICION IF CON OPERADOR AND
		System.out.println(z<=90 && x>5 && (y%2==0));
		if(z >= 90 && x<5 && (y%2==0)){
			System.out.println("Si");
		
		}else {
			System.out.println("No, z vale: " + z);
		}
		
		//CONDICION IF CON OPERADOR OR
		if(z >= 90 || x<5 || (y%2==0)){
			System.out.println("Si");
		
		}else {
			System.out.println("No, z vale: " + z);
		}
		
		//NOT
		if(!(y<700)) {
			System.out.println("Si es menor");
		}else {
			System.out.println("No es menor");
		}
		
		//Diferente de
		if(y!=700){
			System.out.println("Si es diferente");
		}else {
			System.out.println("No es diferente");
		}
		
		//Comparador de numeros primitivos
		if(y==600){
			System.out.println("Si es igual");
		}else {
			System.out.println("No es igual");
		}
	}
}
