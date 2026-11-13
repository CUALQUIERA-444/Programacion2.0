package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 7. Pedir números hasta que se introduzca uno negativo,
 *  y calcular la media.
 */
	Scanner sc = new Scanner(System.in);
	int numero = 0;
	int contador = 0;
	int media = 0;
	int sumatorio = 0;
	do {
		System.out.println("Introduce un numero");
		numero = sc.nextInt();
		if (numero > 0) {
			sumatorio = sumatorio + numero;
			contador++;
		}
	} while (numero >= 0);
	media = sumatorio / contador;
	System.out.println("Media "+media);
	}
}
