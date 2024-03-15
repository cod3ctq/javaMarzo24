package com;

import java.util.Iterator;
import java.util.Scanner;

public class ejercicios {

	public static void main(String[] args) {

		// Realiza un programa que reciba dos números por teclado e indique cuál es
		// mayor o si son iguales.
		Scanner n = new Scanner(System.in);

		/*
		 * int n1; int n2;
		 * 
		 * System.out.println("Ingresa un numero: "); n1 = n.nextInt();
		 * 
		 * System.out.println("Ingresa otro numero: "); n2 = n.nextInt();
		 * 
		 * if(n1 > n2) { System.out.println(n1 + " es mayor que " + n2); } else if (n1 <
		 * n2){ System.out.println(n2 + "es mayor que" + n1); } else {
		 * System.out.println("Los numeros son iguales"); }
		 */

		// Realiza un programa que pida un número por teclado y nos indique si es par o
		// impar.

		/*
		 * int npar;
		 * 
		 * System.out.println("Ingresa un numero del 1 al 100: "); npar = n.nextInt();
		 * 
		 * if (npar % 2 == 0) { System.out.println("El numero ingresado es par"); } else
		 * { System.out.println("El numero ingresa es inpar "); }
		 */

		/*
		 * //Crea un programa que pida al usuario dos números y muestre el resultado de
		 * su división. //Si el segundo número es 0, debe mostrar un mensaje de error.
		 * 
		 * double n1; double n2; double rdiv;
		 * 
		 * System.out.println("Ingrese un numero: "); n1 = n.nextInt();
		 * 
		 * System.out.println("Ingrese otro numero: "); n2 = n.nextInt();
		 * 
		 * rdiv = n1 % n2;
		 * 
		 * if (n2 == 0) { System.out.println("Error"); } else {
		 * System.out.println("EL resultado de la division es: " + rdiv); }
		 */

		/*
		 * //Realiza un programa que lea una cadena por teclado //y compruebe si es una
		 * letra mayúscula.
		 * 
		 * System.out.print("Ingrese una letra: "); String cadena = n.nextLine();
		 * 
		 * // Verificar si la cadena tiene longitud 1 y si ese carácter es una letra
		 * mayúscula if (cadena.length() == 1 &&
		 * Character.isUpperCase(cadena.charAt(0))) {
		 * System.out.println("La cadena ingresada es una letra mayúscula."); } else {
		 * System.out.
		 * println("La cadena ingresada no es una letra mayúscula o tiene más de un carácter."
		 * ); }
		 * 
		 * n.close();
		 */

		/*
		 * String dic =
		 * "A, B, C, D, E, F, G, H, I, J, K, L, M, Ñ, O, P, Q, R, S, T, U, V, W, X, Y, Z"
		 * ; int temp = 0; String frase; int r; boolean m;
		 * 
		 * System.out.println("Ingresa una palabra: "); frase = n.nextLine();
		 * 
		 * while (temp < frase.length()) { r = frase.charAt(temp);
		 * 
		 * if (dic.indexOf(r)>=0) { m=true; break; }
		 * 
		 * temp ++;
		 * 
		 * }
		 */

		/*
		 * // Realiza un programa que calcule la aceptación de una // solicitud en base
		 * a los siguientes parámetros: edad, nota y sexo. // * Mínimo: Nota (5), edad
		 * (18), sexo M -> POSIBLE // * Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		 * // * Otros casos -> NO ACEPTADA
		 * 
		 * int nota; int edad; char sexo;
		 * 
		 * System.out.println("Ingresa una nota del 5 en adelante: "); nota =
		 * n.nextInt();
		 * 
		 * System.out.println("Ingresa tu edad: "); edad = n.nextInt();
		 * 
		 * System.out.println("Ingresa tu sexo M o F: "); sexo = n.next().charAt(0);
		 * 
		 * if (nota >= 5 && edad >= 18) { if (sexo == 'M') {
		 * System.out.println("Solicitud Posible"); } else if (sexo == 'F') {
		 * System.out.println("Solicitud Aceptada"); } else {
		 * System.out.println("No aceptada"); }
		 * 
		 * }else { System.out.println("No aceptada"); }
		 * 
		 * n.close();
		 */

		/*
		 * La asociación de vinicultores tiene como política fijar un precio inicial al
		 * kilo de uva, la cual se clasifica en tipos (A y B), y además en tamaños (1 y
		 * 2). Cuando se realiza la venta del producto, ésta es de un sólo tipo y
		 * tamaño, se requiere determinar cuanto recibirá un productor por la uva que
		 * entrega en un embarque considerando lo siguiente: Si es de tipo A, se le
		 * cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si
		 * es de tamaño 2. Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño
		 * 1, y 50 céntimos cuando es de tamaño 2. Precio inicial se recibe desde
		 * teclado
		 */

		/*
		 * double precioInicial, precioTotal; char tipoUva; int tamaño;
		 * 
		 * System.out.println("Dame el precio inicial: "); precioInicial =
		 * n.nextDouble();
		 * 
		 * System.out.println("Dame el tipo de uva A o B: "); tipoUva =
		 * n.next().charAt(0);
		 * 
		 * System.out.println("Dame el tamaño 1 o 2: "); tamaño = n.nextInt();
		 * 
		 * switch(tipoUva){ case 'A': if (tamaño == 1) { precioTotal =(precioInicial +
		 * 0.20); System.out.println("El precio total es: " + precioTotal); } else if
		 * (tamaño == 2) { precioTotal = (precioInicial + 0.30);
		 * System.out.println("El precio total es: " + precioTotal); } break; case 'B':
		 * if (tamaño == 1) { precioTotal = (precioInicial - 0.30);
		 * System.out.println("El precio total es: " + precioTotal); } else if(tamaño ==
		 * 2){ precioTotal = (precioInicial - 0.50);
		 * System.out.println("El precio total es:  " + precioTotal); } break;
		 * 
		 * }
		 */

		/*
		 * El director de una escuela está organizando un viaje de estudios y requiere
		 * determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía
		 * de viajes por el servicio. La forma de cobrar es la siguiente: Si son 100
		 * alumnos o más, el costo por cada alumno es de 65 euros. De 50 a 99 alumnos,
		 * el costo es de 70 euros. De 30 a 49 alumnos, el costo es de 95 euros. Menos
		 * de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin
		 * importar el número de alumnos. Realiza un algoritmo que permita determinar el
		 * pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje.
		 */

		/*
		 * int alumnos;
		 * 
		 * System.out.println("¿Cuantos alumnos son?: "); alumnos = n.nextInt();
		 * 
		 * if( alumnos >= 100 ) {
		 * 
		 * System.out.println("El costo por cada alumno es de 65 euros"); } else if
		 * (alumnos > 49 && alumnos < 100){
		 * System.out.println("El costo por cada alumno es de 70 euros"); } else if
		 * (alumnos > 29 && alumnos < 50) {
		 * System.out.println("El costo por alumno es de 95 euros"); } else {
		 * System.out.println("El costo de la renta del autobus es de 4000 euros"); }
		 */

		/*
		 * Realiza un programa que pida por teclado el resultado (dato entero) obtenido
		 * al lanzar un dado de seis caras y muestre por pantalla el número en letras
		 * (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las caras
		 * opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4. Nota 2:
		 * Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará
		 * el mensaje: “ERROR: número incorrecto”.
		 */

		
		/*
		int datoE = 0;

		System.out.println("Dame un numero: ");
		datoE = n.nextInt();

		switch(datoE) {
		
		case 1: 
			System.out.println("seis");
			break;
		case 2: 
			System.out.println("cinco");
			break;
		case 3: 
			System.out.println("cuatro");
			break;
		case 4: 
			System.out.println("tres");
			break;
		case 5: 
			System.out.println("dos");
			break;
		case 6: 
			System.out.println("uno");
			break;
		default: 
			System.out.println("Error: numero incorrecto");
		
			}*/
		
		/*
		//Realiza un programa que pida el día de la semana 
	    //(del 1 al 7) y escriba el día correspondiente. 
		//Si introducimos otro número nos da un error.
		
		int numDia = 0;
		
		for(int i = 0; i<=7; i++) {
		System.out.println(+ (i + 1.) + " Dame un numero: ");
		numDia = n.nextInt();

		switch(numDia) {
		
		case 1: 
			System.out.println("Lunes");
			break;
		case 2: 
			System.out.println("Martes");
			break;
		case 3: 
			System.out.println("Miercoles");
			break;
		case 4: 
			System.out.println("Jueves");
			break;
		case 5: 
			System.out.println("Viernes");
			break;
		case 6: 
			System.out.println("Sabado");
			break;
		case 7: 
			System.out.println("Domingo");
			break;
		default: 
			System.out.println("Error");
		}			
	}	
	*/
		
		/*
		 Realiza un programa que pida un número entero 
		 entre uno y doce e imprima el número de días 
		 que tiene el mes correspondiente. 
	    */
		
		/*
		int num;
		
		for (int i = 0; i<=12; i++) {
		System.out.println((i + 1. ) + " Dame un numero entre 1 y 12 o digita 0 para cerrar: ");
		num = n.nextInt();
		
		if(num == 0) {
			System.out.println("Hasta luego");
			break;
		}
		else {
			
		switch(num) {
		
		case 1: 
			System.out.println("Enero: 31 dias");
			break;
			
		case 2: 
			System.out.println("Febrero: 29 dias");
			break;
			
		case 3:
			System.out.println("Marzo: 31 dias");
			break;
			
		case 4: 
			System.out.println("Abril: 30 dias");
			break;
			
		case 5: 
			System.out.println("Mayo: 31 dias");
			break;
			
		case 6: 
			System.out.println("Junio: 30 dias");
			break;
			
		case 7:
			System.out.println("Julio: 31 dias");
			break;
			
		case 8: 
			System.out.println("Agosto: 31 dias");
			break;
			
		case 9: 
			System.out.println("Septiembre: 30 dias");
			break;
			
		case 10: 
			System.out.println("Octubre: 31 dias");
			break;
			
		case 11:
			System.out.println("Noviembre: 30 dias");
			break;
			
		case 12: 
			System.out.println("Diciembre: 31 dias");
			break;
		
		}
	}
	}
	*/
		
		//Una compañía de transporte internacional tiene servicio 
		//en algunos países de América del Norte, América Central, 
		//América del Sur, Europa y Asia. El costo por servicio de 
		//transporte se basa en el peso del paquete y la zona a la 
		//que va dirigida. Lo anterior se muestra en la siguiente tabla:
		
		//ZONA                        COSTO / KG
		/*1 America del Norte          24,00 eu
		 *2 America Central            20.00 eu
		 *3 America del Sur            21,00 eu 
		 *4 Europa                     10,00 eu 
		 *5 Asia                       18,00 eu 
		 *Parte de su política implica que los paquetes con un peso 
		 *superior a 5kg no son transportados, por cuestiones de 
		 *logística y seguridad. Realiza un algoritmo para determinar 
		 *el cobro por la entrega de un paquete o, en su caso, el rechazo de la entrega.
         */
		
		/*
		String[] zona= {"America del Norte","America Central","America del Sur","Europa","Asia"};
		
		int kg;
		double precio;
		
		String valores = "";
		
		String teclado;
		
		System.out.println("Dijita la zona a la que deseas enviar: ");
		teclado = n.nextLine();
		
		System.out.println("Digita los kilos: ");
		kg = n.nextInt();
		
		for(int i = 0; i<zona.length; i++) {
			valores = zona[i];
			
			if (valores.equals(teclado) && teclado.equals("America del Norte")) {
				double cost = 24.00;
				precio = cost * kg;
				if(kg > 5 ) {
					System.out.println("Peso superior a 5 kg");
				}
				else {
					System.out.println("El costo de envio es de: " + precio + " eu");
				}
				
			}
			else if(valores.equals(teclado) && teclado.equals("America Central")){
				double cost2 = 20.00;
				precio = cost2 * kg;
				if(kg > 5 ) {
					System.out.println("Peso superior a 5 kg");
				}
				else {
					System.out.println("El costo de envio es de: " + precio + " eu");
				
			}
			}
			else if(valores.equals(teclado) && teclado.equals("America del Sur")) {
				double cost3 = 21.00;
				precio = cost3 * kg;
				if(kg > 5 ) {
					System.out.println("Peso superior a 5 kg");
				}
				else {
					System.out.println("El costo de envio es de: " + precio + " eu");
				
			}
			}
			else if(valores.equals(teclado) && teclado.equals("Europa")) {
				double cost4 = 10.00;
				precio = cost4 * kg;
				if(kg > 5 ) {
					System.out.println("Peso superior a 5 kg");
				}
				else {
					System.out.println("El costo de envio es de: " + precio + " eu");
				
			}
			}
			else if (valores.equals(teclado) && teclado.equals("Asia")) {
				double cost4 = 18.00;
				precio = cost4 * kg;
				if(kg > 5 ) {
					System.out.println("Peso superior a 5 kg");
				}
				else {
					System.out.println("El costo de envio es de: " + precio + " eu");
				
			}
		}
	}
	*/
		
		/*Construir un programa que calcule el índice de masa corporal de una 
		  persona (IMC = peso [kg] / altura2 [m]) e indique el estado en el 
		  que se encuentra esa persona en función del valor de IMC:
		  
		  Valor IMC                   Diagnostico
		  < 16               Criterio de ingreso en hospital
		  de 16 a 17         infrapeso
		  de 17 a 18         bajo peso
		  de 18 a 25         peso normal (saludable)
		  de 25 a 30         sobrepeso (obesidad de grado II)
		  de 30 a 35         sobrepeso cronico (obesidad de grado II)
		  de 35 a 40         obesidad premórbida (obesidad de grado III)
		  > 40               obesidad mórbida (obesidad de grado IV)
		  
		  Nota 1: se recomienda el empleo de sentencias if–else anidadas. 
		  Nota 2: Los operandos (peso y altura) deben ser introducidos por teclado por el usuario.
		*/
		
		/*
		double peso;
		double altura;
		
		double IMC;
		
		System.out.println("Ingresa tu peso: ");
		peso = n.nextDouble();
		
		System.out.println("Ingresa tu altura: ");
		altura = n.nextDouble();
		
		IMC = peso / (altura * altura); 
		
		//System.out.println(IMC);
		
		if (IMC < 16) {
			System.out.println("Tu IMC = " + IMC + " Tu diagnostico es : Criterio de ingreso al hospital");
		}
		else if (IMC >= 16 && IMC <= 17){
			System.out.println("Tu IMC = " + IMC + " Tu diagnostico es : Infrapeso");	
		}	
		else if (IMC >= 17 && IMC <= 18) {
			System.out.println("Tu IMC = " + IMC + " Tu diagnostico es : Bajo peso");
		}
		else if (IMC >= 18 && IMC <= 25) {
			System.out.println("Tu IMC = " + IMC + " Tu diagnostico es : Peso normal (Saludable)");	
		}
		else if (IMC >= 25 && IMC <= 30) {
			System.out.println("Tu IMC = " + IMC + " Tu diagnostico es : Sobrepeso (Obesidad de grado I)");	
		}
		else if (IMC >= 30 && IMC <= 35) {
			System.out.println("Tu IMC = " + IMC + " Tu diagnostico es : Sobrepeso cronico (Obesidad de grado II)");
		}
		else if (IMC >= 35 && IMC <= 40) {
			System.out.println("Tu IMC = " + IMC + " Tu diagnostico es : Obesidad premorbida (Obesidad de grado III)");
		}
		else if (IMC > 40) {
			System.out.println("Tu IMC = " + IMC + " Tu diagnostico es : Obesidad morbida (Obesidad de grado IV)");
		}
		*/
		
		/*
		Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 
		50% al comedor de niños y el resto se invierte en la bolsa.
		Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 
		60% al comedor de niños y el resto se invierte en la bolsa.
		*/

		/*
		double donacion;
		double CSalud;
		double comedor;
		double bolsa;
		
		System.out.println("Ingresa la cantidad a donar: ");
		donacion = n.nextInt();
		
		if (donacion >= 10000 ) {
			CSalud = (donacion * 0.30);
			comedor = (donacion * 0.50);
			bolsa = (donacion * 0.20);
			
			System.out.println("La cantidad de la donacion es de: " + donacion);
			System.out.println(" ");
			System.out.println("El 30% se destina al hospital con un valor de: " + CSalud);
			System.out.println("El 50% se destina al comedor de niños con un valor de: " + comedor);
			System.out.println("El resto se invierte en la bolsa con un valor de: " + bolsa);
			
		}
		else if(donacion < 10000) {
			double S = (donacion * 0.25);
			double C = (donacion * 0.60);
			double b = (donacion * 0.15);
			
			System.out.println("La cantidad de la donacion es de: " + donacion);
			System.out.println(" ");
			System.out.println("El 30% se destina al hospital con un valor de: " + S);
			System.out.println("El 50% se destina al comedor de niños con un valor de: " + C);
			System.out.println("El resto se invierte en la bolsa con un valor de: " + b);
		}
		*/
		
		/*Un obrero necesita calcular su salario semanal, el cual se obtiene de 
		la siguiente manera: Si trabaja 40 horas o menos se le paga $16 por hora. 
		Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 
		40 horas y $20 por cada hora extra.*/
		
		int h;
		
		System.out.println("Ingresa la cantidad de horas: ");
		h = n.nextInt();
		
		if(h <= 40) {
			int cont = (h * 16);
			System.out.println("Las horas de trabajo son de 40 o menos, el pago por hora es de $16 con un total de:" + cont);
		}
		else if (h > 40 ) {
			System.out.println("Las horas de trabajo son mas de 40, el pago de las horas extra es de $20:");
		}
		
	}
}