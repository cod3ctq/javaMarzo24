package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Principal {
public static void main(String[] args) {
	
	String ruta = "C:\\Users\\ranap\\Desktop\\txt.txt";
	String ruta2 = "C:\\Users\\ranap\\Desktop\\txt - copia.txt";
	String linea = "";
	File file = new File(ruta);  //abre el arcivo
	
	try {
		FileWriter fw =new FileWriter(file,true); //con false lo sobre escribe y con true lo agrega
		
		FileReader fr = new FileReader(file);// crea una copia que se pueda leer por medio de cache
		BufferedReader br =new BufferedReader(fr); //permite leer el alchivo que fileredreader cargo
		
		while((linea = br.readLine())!= null) { //lee una linea a la vez, br.readline
			System.out.println(linea);
		}
		//descomentar y comentar lo de arriba
		
//		fw.write("hola fer vamos a mejorar \n"); // escribe en el documento
//		fw.close();
		
	}catch(Exception ex) {
		ex.printStackTrace();	}
	
	
	
	
	
	
	
}
}
