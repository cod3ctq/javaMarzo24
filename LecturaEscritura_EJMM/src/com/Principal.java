package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Principal {

	public static void main(String[] args) {

		String ruta = "D:\\Respaldo\\Descargas\\ArchivoTexto.txt";
		String ruta2 = "D:\\Respaldo\\Descargas\\ArchivoTexto2.txt";
		String linea = "";
		File file = new File(ruta2); 

		try {
			FileWriter fw = new FileWriter(file, true);
			
			//Con false sobreescribe el texto
			//Con true agrega el texto 

			FileReader fr = new FileReader(file); // Es el caché
			BufferedReader br = new BufferedReader(fr);// Lee el caché

			while ((linea = br.readLine()) != null) {

				System.out.println(linea);

			}
			fw.write("\n PRueba de salto");
			fw.close(); //Es para cerrar tipo un guardar lo escrito previamente.

			//Para saltos de linea debe ponerse un \n
			
		} catch (Exception ex) {
			ex.printStackTrace(); //Es para saber que excepcion es 

		}
		//Dos archivos de texto
//		en el texto 1 tiene que describir cuantos
//		caracteres tiene cada linea
		

	}

}
