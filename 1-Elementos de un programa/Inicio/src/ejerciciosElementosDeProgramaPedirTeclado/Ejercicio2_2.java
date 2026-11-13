package ejerciciosElementosDeProgramaPedirTeclado;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2. Programa que lee dos números, calculando y escribiendo el valor de la
		 * suma, la resta, el producto, y su módulo.
		 */
		double primer_numero;
		double segundo_numero;
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		System.out.println("Introduce el primer número");
		primer_numero = sc.nextDouble();
		System.out.println("Introduce el segundo número");
		segundo_numero = sc.nextDouble();
		double suma = primer_numero + segundo_numero;
		double resta = primer_numero - segundo_numero;
		double multiplicación = primer_numero * segundo_numero;
		double modulo = primer_numero % segundo_numero;
		System.out.println("SUMA "+suma);
		System.out.println("RESTA "+resta);
		System.out.println("MULTIPLICACION "+multiplicación);
		System.out.println("MODULO "+modulo);
	}
}
