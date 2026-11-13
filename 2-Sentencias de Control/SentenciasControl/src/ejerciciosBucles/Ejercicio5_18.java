package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio5_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 18. Programa que lee una secuencia 5 números y escribe cual ha sido el mayor.
		 */
		Scanner sc = new Scanner(System.in);
		int numero;
		int mayor = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.println("Introduce un numero (El programa se detiene cuando sean 5)");
			numero = sc.nextInt();
			if (numero > mayor)
				mayor = numero;
		}
		System.out.println("El mayor es " + mayor);
	}
}
