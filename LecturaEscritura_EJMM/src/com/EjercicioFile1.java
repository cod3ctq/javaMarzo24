package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class EjercicioFile1 {

	public static void main(String[] args) {

		String ruta = "D:\\Respaldo\\Descargas\\ArchivoTextoPalabras.txt";
		String ruta2 = "D:\\Respaldo\\Descargas\\Contador de palabras.txt";
		File file = new File(ruta);
		File file2 = new File(ruta2);

		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			FileWriter fw = new FileWriter(file2);

			String linea;

			while ((linea = br.readLine()) != null) {

				int contador = 0;
				for (int i = 0; i < linea.length(); i++) {
					if (linea.charAt(i) != '\n') {
						contador++;
					}
				}

				System.out.println(linea);
				fw.write(contador + "\n");

			}
			
			fw.close(); // Es para cerrar tipo un guardar lo escrito previamente.
			fw.close(); // Es para cerrar tipo un guardar lo escrito previamente.
			fw.close(); // Es para cerrar tipo un guardar lo escrito previamente.

			// Para saltos de linea debe ponerse un \n

		} catch (Exception ex) {
			ex.printStackTrace(); // Es para saber que excepcion es

		}

	}
}
