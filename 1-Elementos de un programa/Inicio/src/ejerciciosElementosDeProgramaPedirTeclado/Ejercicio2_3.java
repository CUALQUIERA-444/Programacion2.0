package ejerciciosElementosDeProgramaPedirTeclado;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 3. Programa que dado un importe y un descuento (porcentaje), calcula el importe
una vez aplicado el descuento.
 */
	double importe;
	double total;
	double descuento; 
	Scanner sc = new Scanner(System.in);
	sc.useLocale(Locale.ENGLISH);
	System.out.println("Introduce el importe del producto");
	importe = sc.nextDouble();
	System.out.println("Introduce el descuento del producto (Porcentaje NO SE PASE DE 100 o al menos intentelo)");
	descuento = sc.nextDouble();
	total = importe - importe * descuento / 100;
	System.out.println("Total a pagar "+total+" euros");
	}
}
