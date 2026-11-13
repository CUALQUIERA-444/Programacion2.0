package ejerciciosElementosDeProgramaPedirTeclado;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 5. Programa que calcula el área de un triángulo.
 * Formula del área de un triangulo =  base * altura / 2
 */
	Scanner sc = new Scanner (System.in);
	sc.useLocale(Locale.ENGLISH);
	System.out.println("Introduzca la medida de la base del triangulo");
	double base = sc.nextDouble();
	System.out.println("Introduzca la medida de la altura del triangula");
	double altura = sc.nextDouble();
	double formula = (base * altura) / 2;
	System.out.println("El área del triángulo es de "+formula+"m²");
	}
}
