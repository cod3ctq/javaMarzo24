package com;

import java.util.Scanner;
import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {

		int[] xx = new int[5];
		int[] yy = { 5, 9, 34, 67, 880, 1 };

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < xx.length; i++) {
			System.out.println("Ingresa un valor: ");
			xx[i] = sc.nextInt();
		}
		System.out.println("EL valor de la posición es:" + (xx[4]));
		System.out.println("EL valor de la posición es:" + (yy[2]));

		System.out.println(Arrays.toString(xx));
		System.out.println(Arrays.toString(yy));

		// Object[]varios=newObject[10]; sirve para cualquier tipo de datos

		{
			for (int i = xx.length; i >= 0; i--) {

				System.out.println("Ingresa un valor: ");
				xx[i] = sc.nextInt();

			}
			System.out.println("EL valor de la posición es:" + (xx[4]));
			System.out.println("EL valor de la posición es:" + (yy[2]));

			System.out.println(Arrays.toString(xx));
			System.out.println(Arrays.toString(yy));

		}
	}
}