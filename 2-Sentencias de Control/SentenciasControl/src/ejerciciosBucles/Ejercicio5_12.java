package ejerciciosBucles;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 12. Programa que lee las notas en programación de esta clase y cuenta el no de
aprobados
 */
	Scanner sc = new Scanner(System.in);
	sc.useLocale(Locale.ENGLISH);
	double notas = 0;
	int contador_aprobados = 0;
	do {
		System.out.println("Introduce la nota que has sacado (El programa termina cuando introduzcas -1");
		notas = sc.nextDouble();
			if(notas < 0 && notas > 10 && notas != -1) {
				System.out.println("Nota incorrecta Reiniciando programa");
			}
			else {
				if(notas >= 5) {
					contador_aprobados++;
				}
			}
	}
	while (notas != -1);
	System.out.println("Contador de aprobados "+contador_aprobados);
	}
}
