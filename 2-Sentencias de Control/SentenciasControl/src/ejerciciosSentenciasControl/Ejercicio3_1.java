package ejerciciosSentenciasControl;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 1. Programa que lee dos números, si son positivos los suma, si son negativos los resta y si
alguno es nulo saca un mensaje de error.
 */
	Scanner sc = new Scanner(System.in);
	sc.useLocale(Locale.ENGLISH);
	System.out.println("Introduce dos números");
	double numero_a = sc.nextDouble();
	double numero_b = sc.nextDouble();
	double resultado;
	if ((numero_a > 0) && (numero_b > 0)) {
		resultado = numero_a + numero_b;
		System.out.println("SUMA "+resultado);
	}
	else if ((numero_a < 0) && (numero_b < 0)) {
		resultado = numero_a - numero_b; 
		System.out.println("RESTA "+resultado);
	}
	else if ((numero_a == 0) || (numero_b == 0)) {
		System.out.println("ERROR ALGUNO DE LOS VALORES ES NULO");
	}
	else {
		System.out.println("SIN ESPECIFICACIONES");
	}
	}
}
