package ejerciciosSentenciasControl;

import java.util.Scanner;

public class Ejercicio4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 5. Programa que lee como dato de entrada un año y nos dice si se trata de un
		 * año bisiesto o no. Se sabe que son bisiestos todos los años múltiplos de 4,
		 * excepto los que sean múltiplos de 100 sin ser múltiplos de 400.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el año y verificamos si es bisisesto");
		int año = sc.nextInt();
		if (año <= 0) {
			System.out.println("Año invalido reinicia el programa");
		} else {
			boolean bisiesto = (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0));
			if (!bisiesto) {
				System.out.println("No es bisiesto");
			} else {
				System.out.println("Si es bisiesto");
			}
		}
	}
}
