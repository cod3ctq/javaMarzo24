package com;

import java.util.Arrays;
import java.util.Scanner;

public class Ciclos_Arrays {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] xx = new int[5]; // Array que solo declara el tamaño = length(5)
		int[] yy = { 5, 9, 34, 67, 880, 1 }; // Array con los valores ya establecido

		for (int i = 0; i < xx.length; i++) { // para invertir el orden seria for (int i = xx.length-1; i>=0; i--)
			System.out.println("Ingrese un valor");
			xx[i] = sc.nextInt();
		}
		System.out.println(xx[1]);

		System.out.println(Arrays.toString(xx)); // imprime todo
		// Object [] aa = new Object[10];// aun arreglo de objecto puede llevar culquier
		// cosa; ya sea string, char, enteros, etc.
		// yy.length se utiliza para saber el tamaño

	}
}
