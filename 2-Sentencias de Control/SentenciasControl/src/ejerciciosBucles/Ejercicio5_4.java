package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero = 2;
		int contador = 0;
		while (numero >= 0 ) {
			System.out.println("Introduce un numero");
			numero = sc.nextInt();
			if (numero >= 0) {
				contador++;
			}
		}
		System.out.println("Contador de numeros total "+contador);
		System.out.println("Fin del programa");
		}
	}
