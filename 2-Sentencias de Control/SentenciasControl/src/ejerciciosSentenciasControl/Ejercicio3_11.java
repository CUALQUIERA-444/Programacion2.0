package ejerciciosSentenciasControl;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 11. Una empresa maneja códigos numéricos con las siguientes características:
		 * Cada código consta de cuatro dígitos El primero representa a una provincia El
		 * segundo el tipo de operación Los dos últimos el número de la operación
		 * 
		 * Escriba un programa que lea de teclado un número de cuatro dígitos, y
		 * posteriormente imprima en pantalla la siguiente información:
		 * 
		 * PROVINCIA & TIPO DE OPERACIÓN & NÚMERO DE OPERACIÓN &&
		 * 
		 * En caso de que el número tenga más de 4 dígitos, en lugar del mensaje
		 * anterior, habrá que imprimir en pantalla el siguiente mensaje de error:
		 * ERROR: CÓDIGO NO VÁLIDO. Si tiene menos de 4 dígitos se suponen 0 los
		 * primeros.
		 */
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		System.out.println("Introduzca el código correspondiente");
		int codigo = sc.nextInt();
		int provincia = codigo / 1000;
		int tipo = codigo % 1000 / 100;
		int numero = codigo % 1000  % 100;
		if (codigo > 9999 || codigo < 0 ) { //Si le pones cero por delante el int se lo come
			System.out.println("ERROR CÓDIGO NO VÁLIDO");
		} else {
			System.out.println("PROVINCIA " + provincia);
			System.out.println("TIPO DE OPERACIÓN " + tipo);
			if (numero < 10) {
				int auxiliar = 0;
				System.out.println("NÚMERO DE OPERACIÓN "+auxiliar+numero);
			}
			else {
			System.out.println("NÚMERO DE OPERACIÓN "+numero);
			}
			}
	}
}
