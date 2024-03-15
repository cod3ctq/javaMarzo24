package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class principal {
	
	public static void main(String[] args) {
		
		String ruta = "C:\\Users\\Manuel\\Desktop\\Plan de trabajo o metpdologia.txt";
		String ruta2 = "C:\\Users\\Manuel\\Desktop\\Plan de trabajo o metpdologia.txt";
		String linea = "";
		File file = new File (ruta2);
		
		try {
			//Usamos FileWriter para escritura de un archivo
			                                   //con false sobrescribe
			                                   //con true lo suma
			//FileWriter fw = new FileWriter(file, false);
			
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr); 
			/*
			FileReader fr = new FileReader(file);
			//Usamos BufferedReader para leer el cache 
			BufferedReader br = new BufferedReader(fr);
			*/
			while((linea = br.readLine())!= null) {
				System.out.println(linea);
			}
			
			//fw.write("Hola este es un texto de prueba. \n");
			//fw.close();
		}
		catch(Exception ex) {
			ex.printStackTrace();
			
		}
	}
}