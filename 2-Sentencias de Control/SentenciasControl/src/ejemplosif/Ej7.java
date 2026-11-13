package ejemplosif;

import java.util.Locale;
import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 7. Escribe un programa que lea una temperatura introducida a través de teclado y
muestre por pantalla la actividad más apropiada para dicha temperatura
teniendo en cuenta los siguientes criterios.
ACTIVIDAD TEMPERATURA IDONEA
Natación temp > 30
Tenis 20 < temp <= 30
Golf 10 < temp <= 20
Esquí 5 < temp <= 10
Parchís temp <= 5
 */
	Scanner sc = new Scanner(System.in);
	sc.useLocale(Locale.ENGLISH);
	System.out.println("Introduzca la temperatura del dia de hoy");
	double temperatura = sc.nextDouble();
	if (temperatura > 30) {
		System.out.println("Hacemos natación");
	}
	else if(temperatura > 20 && temperatura <= 30) {
		System.out.println("Hacemos tenis");
	}
	else if(temperatura > 10 && temperatura <= 20) {
		System.out.println("Hacemos Golf");
	}
	else if(temperatura > 5 && temperatura <= 10) {
		System.out.println("Hacemos Esquí");
	}
	else {
		System.out.println("Hacemos Parchís");
	}
	}
}
