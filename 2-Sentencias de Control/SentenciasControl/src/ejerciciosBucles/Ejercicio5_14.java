package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio5_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 14. Programa que lee un número y escribe todos los pares anteriores a él
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero y te decimos todos los anteriores pares a el");
		int numero = sc.nextInt();
		for (int i = 0; i <= numero; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
