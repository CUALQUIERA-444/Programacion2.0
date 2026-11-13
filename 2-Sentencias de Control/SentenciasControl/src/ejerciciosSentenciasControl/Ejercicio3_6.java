package ejerciciosSentenciasControl;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 6. En un determinado comercio se realiza un descuento dependiendo del precio de cada
producto. Si el precio es inferior a 6 euros, no se hace descuento; si es mayor o igual que 6
euros y menor que 60 euros, se hace un 5% de descuento, y si es mayor o igual que
60euros, se hace un 10 % de descuento. Programa que lee el precio de un producto y nos
calcula y escribe su precio final.
 */
		//Operador && And Solo sirve para los booleanos El resultado es true si todas las condiciones son true
		
		/*
		 * && true false
		 * true true false
		 * false false false
		 */
		//Operador || El resultado es true si al menos una condicion es true
		/*
		 * || true false
		 * true true true
		 * false true false
		 */
		final double cond_1 = 6, cond_2 = 60, porcentaje_a = 5, porcentaje_b = 10;
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		System.out.println("Introduce el precio de su producto");
		double precio = sc.nextDouble();
		if(precio < cond_1) {
			}
		else if (precio >= cond_1 && precio <= cond_2) {
			precio = precio - precio  * porcentaje_a / 100;
		}
		else {
			precio = precio - precio * porcentaje_b / 100;
		}
		System.out.println("Precio total "+precio+" €");
	}
}
