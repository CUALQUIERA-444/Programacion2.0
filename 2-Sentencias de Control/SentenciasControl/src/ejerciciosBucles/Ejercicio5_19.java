package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio5_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 19. Programa que lea dos números enteros y muestre por pantalla todos los números
comprendidos entre esos dos, ambos incluidos. El programa no debe suponer que
el primero será menor que el segundo ni viceversa, pero sí deberá tenerlo en
cuenta para mostrar los números en orden creciente o decreciente según
corresponda.
 */
	Scanner sc = new Scanner(System.in);
	int n_1;
	int n_2; 
	System.out.println("Introduce un número");
	n_1 = sc.nextInt();
	System.out.println("Introduce un segundo número");
	n_2 = sc.nextInt();
	if (n_1 < n_2) {
		for (int i = n_1; i <= n_2;i++) {
			System.out.println(i);
		}
	}
	else {
		for (int i = n_1; i >= n_2;i--) {
			System.out.println(i);
		}
	}
	}
}
