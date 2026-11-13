package ejerciciosElementosDeProgramaPedirTeclado;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 4. Programa que dadas 3 notas calcule la media.
 */
	Scanner sc = new Scanner(System.in);
	sc.useLocale(Locale.ENGLISH);
	System.out.println("Introduzca la primera nota");
	double primera_nota = sc.nextDouble();
	System.out.println("Introduzca la segunda nota");
	double segunda_nota = sc.nextDouble();
	System.out.println("Introduzca la tercera nota");
	double tercera_nota = sc.nextDouble();
	double media = (primera_nota + segunda_nota + tercera_nota) / 3;
	System.out.println("La media de las notas es de "+media);
	}
}
