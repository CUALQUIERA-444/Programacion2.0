package ejerciciosSentenciasControl;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 5. Diseñar un programa que calcule el precio de un billete de ida y vuelta por avión,
conociendo la distancia a recorrer, el número de días de estancia y sabiendo que si la
distancia es superior a 1.000 Km. y el número de días de estancia es superior a 7, la línea
aérea le hace un descuento del 30 %. (Precio por kilómetro = 0,05€.).
 */
		final double precio_km = 0.05;
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		System.out.println("Introduzca la distancia del vuelo (En km)");
		double distancia = sc.nextDouble();
		System.out.println("Introduzca el numero de dias de estancia");
		int dias = sc.nextInt();
		double importe_total;
		if((distancia > 1000) && (dias > 7)) {
			importe_total = (precio_km * distancia) - (precio_km * distancia * 30 / 100);
			System.out.println("Importe total "+importe_total+"€");
		}
		else {
			importe_total = precio_km * distancia;
			System.out.println("Importe total "+importe_total+"€");
		}
	}
}
