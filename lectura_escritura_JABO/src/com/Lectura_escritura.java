package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Lectura_escritura {
	public static void main(String[] args) {
		
		String ruta = "C:\\Users\\Anton\\Desktop\\archivoejemplo.txt";//ponemos la ruta del archivo
		String ruta2 = "C:\\Users\\Anton\\Desktop\\archivoejemplo2.txt";
		String linea = "";
		File file = new File(ruta);//es la representacion del archivo que esta en la maquina
		File file2 = new File(ruta2);
		try {
			
			
            FileReader fr = new FileReader(file);// crea el cache o copia del archivo en memoria, voy a definir un archivo de text en algun lugar de la pc
			BufferedReader br = new BufferedReader(fr);//este lee el cache
			while((linea = br.readLine())!= null) {
				System.out.println(linea); 
			}
         
			FileWriter fw = new FileWriter(file2, false);//false sobreescribe y true agrega mas contenido sin reemplazar
			fw.write("1234566789ABCDEFGH");
			fw.close();
			
			
			
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
