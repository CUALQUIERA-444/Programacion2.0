package ejerciciosSentenciasControl;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*12. Programa que lee una nota numérica y escribe la correspondiente calificación

		5 .......... SUFICIENTE
*/
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		System.out.println("Introduce tu nota (0 al 10) como máximo");
		int nota = sc.nextInt();
		if (nota < 0 || nota > 10) {
			System.out.println("Nota no valida reinicie el programa");
		}
		else {
			switch(nota) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			System.out.println("Suspenso");
			break;
			case 5:
			System.out.println("Suficiente");
			break;
			case 6:
			System.out.println("Bien");
			break;
			case 7:
			case 8:
			System.out.println("Notable");
			case 9:
			case 10: 
			System.out.println("Sobresaliente");
			break;
			}
		}
	}
}
