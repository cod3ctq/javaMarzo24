package com;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner n = new Scanner(System.in);

		int numero;
		System.out.println("Dame un numero");
		numero = n.nextInt();

		int[] zz = new int[numero];

		int[] yy = { 5, 9, 34, 67, 880, 1 };

		for (int i = 0; i < zz.length; i++) {
	  //para hacer un decremento del ciclo usamos: 
	  //for(int x=zz.length-1; x>=0; x--)
			System.out.println("Ingresa un valor: ");
			zz[i] = n.nextInt();

		}
		System.out.println(" ");
		//System.out.println(zz[2]);
		System.out.print(Arrays.toString(zz));

	}

}

/* Para imgresar valores de todo tipo usamos Object [] aa = new Object [10]; */
