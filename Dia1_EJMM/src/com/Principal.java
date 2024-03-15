package com;

public class Principal {
	
	public static void main(String[] args) {
		
		//System.out.println("Hola Mundo");
	    //Enteros, decimales, booleanos, cadenas, caracteres, objetos..
		
		//Enteros
		byte b = 90; //Rango: -128 a 127.
		short s = 80; // Rango: -32768 a 32767. 
		int i = 60; // Rango: *El más común por ser un rango muy extenso (9 9´s).
		long l = 181818818l; //Rango 18 9´s y al final l.
		
		//Decimales
		float f = 34.23f; //Es primitivo.
		double d = 982.5; //Es más utilizado y preciso.
		
		//Booleanos y caracteres
		char c = '2'; //Permite caracteres diferentes solo de 1 tipo a la vez.
		boolean bo = false; //Es true o false.
		
		 // Los amarillos son variables (Referencias nombre real).
         //Hay página para checar los rangos.
		
		//Tipos de dato Objeto (Wrappers o envoltorios).
		
		//Se llaman a las clases no a los primitivos.
		
		Byte bb = 30; //Inicializa un objeto directamente.
		Byte b2 = new Byte(b); //Mediante un constructor. 
		
		Short sh = 809;
		
		Integer ii = 646555555;
		Long lo = 99494949L;
		Float fl = 9494.2F;
		Double dd = 158.5457;
		Character ch = 'ñ'; //Solamente permite 1 caracter
		Boolean bol = false;
		
		
		// ii.Al poner cualquiera de las referencias de clase
		// y poner un . te manda todo lo que tiene dentro la clase 
		// Los métodos incluyen documentación individal cada 1
		//Deprecated = Obsoleto.
		
		//Diferencia entre .java y . class es que el java es modificable mientras
		// que el class no se puede funciona como si fuera librería
		
		//Con ctrl + click te manda al código de modelo de clase base.
	}

}
