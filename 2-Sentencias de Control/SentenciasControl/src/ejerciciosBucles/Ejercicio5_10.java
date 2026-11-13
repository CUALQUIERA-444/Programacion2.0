package ejerciciosBucles;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 10. Programa que lee una secuencia de notas (0 – 10) terminada al introducir
		 * –1 y cuenta el no de suspensos, aprobados, notables y sobresalientes. Validar
		 * que las notas introducidas sean correctas.
		 */
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		int notas;
		do {
			System.out.println("Introduce notas del 0 al 10");
			notas = sc.nextInt();
			if (notas == -1) {
				break;
			} else if (notas < 0 || notas > 10) {
				System.out.println("Error vuelva a intentarlo");
			} else {
				switch (notas) {
				case 0:
				case 1:
				case 2:
				case 3:
				case 4:
					System.out.println("Suspenso");
					break;
				case 5:
				case 6:
					System.out.println("Aprobado");
					break;
				case 7:
				case 8:
					System.out.println("Notable");
					break;
				case 9:
				case 10:
					System.out.println("Sobresaliente");
					break;
				}
			}
		} while (notas != -1);
		System.out.println("FIN DEL PROGRAMA");
	}
}
