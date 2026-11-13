package ejemplosif;

import java.util.Locale;
import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 6. Programa que lee desde teclado las notas en programación y marcas de un
		 * alumno y nos dice si ha aprobado una o las dos asignaturas
		 */
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		System.out.println("Introduzca sus notas de programación y marcas");
		double programacion = sc.nextDouble();
		double marcas = sc.nextDouble();
		if (programacion >= 5) {
			if (marcas >= 5) {
				System.out.println("Has aprobado las dos asignaturas");
			} else {
				System.out.println("Solo has aprobado programacion");
			}
		} else {
			if (marcas >= 5) {
				System.out.println("Solo has aprobado marcas");
			} else {
				System.out.println("No has aprobado nada");
			}
		}
	}
}
