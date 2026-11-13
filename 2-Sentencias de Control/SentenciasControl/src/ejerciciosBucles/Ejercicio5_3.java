package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 3. Leer números hasta que se introduzca un 0. 
 * Para cada uno indicar si es par o impar.
 */
//Nota los numeros negativos enteros si tienen pares e impares
		Scanner sc = new Scanner(System.in);
		int numero = 2;
		while (numero != 0 ) {
			System.out.println("Introduce un numero");
			numero = sc.nextInt();
			if (numero != 0) {
			if(numero % 2 == 0) {
				System.out.println("Par");
			}
			else {
				System.out.println("Impar");
			}
			}
		}
		System.out.println("Fin del programa");
		}
	}
