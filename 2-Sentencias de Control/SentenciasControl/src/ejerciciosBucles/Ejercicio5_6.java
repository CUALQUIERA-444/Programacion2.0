package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 6. Programa que va leyendo números desde teclado y calcula la suma de todos ellos.
El programa finaliza cuando el número leído es 0.
 */
	Scanner sc = new Scanner(System.in);
	int numero = 0;
	int acumulador = 0;
	do {
		System.out.println("Introduce numeros");
		numero = sc.nextInt();
		if(numero != 0) {
		acumulador = acumulador + numero;
		}
	}
	while(numero != 0);
	System.out.println("Suma "+acumulador);
	}
}
