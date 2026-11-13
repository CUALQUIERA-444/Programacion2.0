package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 2. Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que
se introduzca un 0.
 */
	Scanner sc = new Scanner(System.in);
	int numero = 2;
	while (numero != 0 ) {
		System.out.println("Introduce un numero");
		numero = sc.nextInt();
		if (numero != 0) {
		if(numero > 0) {
			System.out.println("Positivo");
		}
		else {
			System.out.println("Negativo");
		}
		}
	}
	System.out.println("Fin del programa");
	}
}
