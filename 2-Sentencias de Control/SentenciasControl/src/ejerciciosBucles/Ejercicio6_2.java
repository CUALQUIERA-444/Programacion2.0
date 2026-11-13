package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2. Leer números de teclado hasta que la suma de todos ellos sea mayor a 100,
		 * y decir si se ha anotado algún cero.
		 */
		Scanner sc = new Scanner(System.in);
		int numero;
		int suma = 0;
		int contador_ceros = 0;
		do {
			System.out.println("Introduce un número");
			numero = sc.nextInt();
			if (numero == 0) {
				contador_ceros++;
			} else {
				suma += numero;
			}
		} while (suma <= 100);
		System.out.println("Suma total " + suma);
		System.out.println("Contador de ceros " + contador_ceros);
	}
}
