package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Lectura {
	public static void main(String[] args) {
		
		String ruta = "C:\\Users\\ranap\\Desktop\\Lectura.txt";
		String ruta2 = "C:\\Users\\ranap\\Desktop\\Escritura.txt";
		String linea = "";
		File file = new File(ruta); 
		File file2 = new File(ruta2);
		
		try {
			 
			
			FileReader fr = new FileReader(file);			
			BufferedReader br =new BufferedReader(fr);
			FileWriter fw =new FileWriter(file2,true);
			
			while((linea = br.readLine())!= null) { 
				System.out.println(linea);
			    fw.write(" " + linea.length() + "\n"); 
				
			}
			fw.close();
			
			
			
			
		}catch(Exception ex) {
			ex.printStackTrace();	}
		
		
		
		
		
		
		
	}
}
