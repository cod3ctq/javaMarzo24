package com;

public class Main {
	public static void main(String[] args) {
		System.out.println("Empezando con java"); //teclas autocompletado CTRL + Enter va despues de la abreviacion
	
	//tipos de datos: ENTEROS, CHAR, DECIMALES, DOBLES, CADENAS, BOOLEANOS
	//Objetos------------------------>
	
	//TIPOS DE DATOS PRIMITIVOS
	//Enteros
		byte b =90;
		short s = 80;
		int i = 60;
		long l = 1926557455544l; //siempre para un valor long agrega una l al final del numero
		
	//decimales
		float f = 34.52f;
		double d = 989.35;// se usa mas actualmente
		
	//booleans y chars
		char c = 'a';
		boolean bo = true;
		
	//TIPOS DE DATOS OBJETO (WRAPPERS O ENVOLTORIOS)
	//Los wrappers son envoltorios de primitivos dotados de mas caracteristicas
		
		//Estoy llamando a la clase Byte no al dato primitivo
		Byte bb = 30; //Esto es un objeto, es una instancia de la clase Byte; estamos inicializando este objeto directamente
		
		//Un constructor nos permite dar un valor inicial al objeto
		Byte b2 = new Byte(b); 
		
		Short sh = 809;
		Integer ii = 346955;
		Long lo = 9854566L;
		Float fl = 9374.54F;
		Double dd = 347.56645;
		Character ch = 'ñ';
		Boolean bol = false;
		
		//nos muestra el interior de ese objeto al agregarle un punto y los metodos de comportamiento de ese objeto
		
		
	}
	
}
