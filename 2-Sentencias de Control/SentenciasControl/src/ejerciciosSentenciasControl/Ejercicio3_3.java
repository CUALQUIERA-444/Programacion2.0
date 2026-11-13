package ejerciciosSentenciasControl;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 3. Programa que lee dos números (no necesariamente distintos) 
 * y los escribe ordenados
 */
	Scanner sc = new Scanner(System.in);
	sc.useLocale(Locale.ENGLISH);
	System.out.println("Introduzca dos números");
	int primer_valor = sc.nextInt();
	int segundo_valor = sc.nextInt();
	if (primer_valor < segundo_valor) {
		System.out.println(primer_valor+" "+segundo_valor);
	}
	else {
		System.out.println(segundo_valor+" "+primer_valor);
	}
	}
}
