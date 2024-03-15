package com;

import java.util.Arrays;
import java.util.Scanner;
public class Ciclos_arrays {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] xx = new int[5];//declaracion de arrays vacios de 5 posiciones
		int [] yy = {1,2,3,4,5,6}; //declarando un arrays con una determinada cantidad de numeros
		
		System.out.println(yy[3]);
		
		for(int i = 0; i<xx.length; i++) {
			System.out.println("Ingresa un numero para el arreglo xx: ");
			xx[i] = sc.nextInt();
		}
		
		for(int i = 0; i<xx.length; i++) {
			System.out.println(xx[i]);
		}
		
		System.out.println("\n");
		
		for(int i = xx.length-1; i>=0; i--) {//AQui se imprimen los valores del array xx de derecha a izquierda
			System.out.println(xx[i]);
		}
		
		System.out.println(Arrays.toString(xx));//Aqui manejamos el objeto Arrays con su metodo toString(), para imprimir todo el arreglo xx, sin necesidad de usar el ciclo
		
		Object[] aa = new Object[10]; //Estamos creando un arreglo de la clase Object que puede contener multiples datos de diferente tipo
		
		
		
		
		
		
		
		
	}
}
