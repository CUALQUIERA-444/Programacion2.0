package ejerciciosSentenciasControl;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 4. Programa que lee tres números distintos y 
 * nos dice cuál de ellos es el mayor
 */
	Scanner sc = new Scanner(System.in);
	sc.useLocale(Locale.ENGLISH);
	System.out.println("Introduzca tres números ASEGURESE QUE LOS 3 SEAN DISTINTOS");
	int n_a = sc.nextInt(); //7 
	int n_b = sc.nextInt(); //3
	int n_c = sc.nextInt(); //5
	if (n_a == n_b || n_b == n_c || n_a == n_c)
		System.out.println("ERROR NO SON DISTINTOS REINICIE EL PROGRAMA");
	else {
		if(n_a > n_b && n_a > n_c) {
			System.out.println("EL MAYOR ES EL PRIMERO "+n_a);
		}
		else if(n_b > n_a && n_b > n_c) {
			System.out.println("EL MAYOR ES EL SEGUNDO "+n_b);
		}
		else {
			System.out.println("EL MAYOR ES EL TERCERO "+n_c);
		}
	}
	}
}
