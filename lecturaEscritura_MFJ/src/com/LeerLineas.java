package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class LeerLineas {
	
	public static void main(String[] args) {
		
		String ruta = "C:\\Users\\Manuel\\Desktop\\doc.text";
		String ruta2 ="C:\\Users\\Manuel\\Desktop\\doc2.text";
		
		String linea;
		
		File file = new File(ruta);
		
		try { 
		FileReader fr = new FileReader(file);
		BufferedReader bf = new BufferedReader(fr);
		
		if ((linea = bf.readLine()) !=null) {
			
		}
		
			
		
		}
		catch(Exception ex){
			ex.printStackTrace();
		}

		}
}