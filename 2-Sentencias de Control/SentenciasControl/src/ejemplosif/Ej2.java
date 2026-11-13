package ejemplosif;

import java.util.Locale;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	 * 2. Programa que lea una cantidad en dólares 
	 * y nos haga el cambio a euros.
	 * 1 dolar = 0,88 euros 
	 */
	double dolares;
	double euros;
	final double euro_fijo = 0.88;
	Scanner sc = new Scanner(System.in);
	sc.useLocale(Locale.ENGLISH);
	System.out.println("Introduce los dolares para cambiar a euros");
	dolares = sc.nextDouble();
	euros = dolares * euro_fijo;
	System.out.println("La cantidad de euros es de "+euros+"€");
	}
}
