package com;

import java.util.Arrays;
import java.util.Iterator;

public class Cifrado {
 public static void main(String[] args) {
  
  
  String prueba = "Texto de prueba en 2024";
  
  String cifrado = "";
  
  String [] dicc = {"a", "b", "c", "d", "e", "f", "g", "h", 
              "i", "j", "k", "l", "m", "n", "o", "p", 
              "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
  
  String letra = "";
  String [] arrayPrueba = prueba.split("");//split es un metodo de la clase String,separa los elementoa y te los devuelve en un array
  System.out.println(Arrays.toString(arrayPrueba));//Toma todos los valores del array y los convierte en String de una sola linea
  
  //Itera sobre el original para aislar un caracter a la vez
  for (int i = 0; i < arrayPrueba.length; i++) {
   letra = arrayPrueba[i];
   letra = letra.toLowerCase();//toLowerCase es un metodo que convierte todo en minusculas
   
   if (letra.equals("z")) {
    cifrado=cifrado+"a";
   }else if(letra.equals(" ")){
    cifrado=cifrado+"-";
   }else {
    //Itera para determinar en que posicion del dicc esta la letra actual.
    for (int j = 0; j < dicc.length; j++) {
    
     if (dicc[j].equals(letra)) {
      cifrado = cifrado + dicc[j+1];
     }
    
    }
   }
  }
  System.out.println("Resultado: "+cifrado);
 }

 
 
 
}