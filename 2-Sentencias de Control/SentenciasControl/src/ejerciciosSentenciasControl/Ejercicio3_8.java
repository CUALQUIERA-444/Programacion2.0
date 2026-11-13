package ejerciciosSentenciasControl;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 8. Programa que lee un número y nos dice si es par o impar
		 */
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		System.out.println("Introduce un número");
		int numero = sc.nextInt();
		if (numero % 2 == 0 || numero == 0) {
			System.out.println("EL " + numero + " es par");
		} else {
			System.out.println("EL " + numero + " es impar");
		}
	}
}
