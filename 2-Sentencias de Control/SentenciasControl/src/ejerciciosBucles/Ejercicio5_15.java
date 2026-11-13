package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio5_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 15. Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de
dicho número.
 */
	Scanner sc = new Scanner(System.in);
	int numero = -1;
	while (numero < 0 || numero > 10) {
	System.out.println("Introduce un número (Debe estar entre 0 y 10)");
	numero = sc.nextInt();
	if (numero < 0 || numero > 10) {
		System.out.println("Debe ser entre 0 y 10 reiniciando el programa");
	}
	}
	for (int i = 0; i<=10; i++) {
		int resultado = numero * i;
		System.out.println(numero+" x "+i+" = "+resultado);
	}
	}
}
