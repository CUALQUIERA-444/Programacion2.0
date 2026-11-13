package ejerciciosSentenciasControl;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 7. Con objeto de fomentar el ahorro energético, el recibo de la electricidad
		 * se elabora de forma que el precio de cada Kw/h consumido es más caro cuanto
		 * más se consume:
		 * 
		 *  2€ de gastos fijos  0,50€/Kwh para los primeros 100 Kwh  0,70€/Khw para
		 * los siguientes 150 Kwh  1€/Kwh para el resto
		 * 
		 * Elabora un programa que lee de teclado los dos últimos valores del contador
		 * (lo que marca actualmente y lo que marcaba en la última lectura), y calcula e
		 * imprime en pantalla el importe total a pagar.
		 */
		/*
		 * Agosto
		 * 12734 kw
		 * Septiembre 
		 * 12800 kw
		 * Has gastado 
		 * 66
		 */
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		final double gastos_fijos = 2, primeros_kw = 0.50, siguientes_kw = 0.70, resto = 1;
		double ultimo_valor;
		double valor_actual;
		double importe_total;
		System.out.println("Introduce el valor actual del contador");
		valor_actual = sc.nextDouble();
		System.out.println("Introduce el valor anterior del contador");
		ultimo_valor = sc.nextDouble();
		double resultado = valor_actual - ultimo_valor;
		if(resultado < 0) {
			System.out.println("Error el consumo o puede dar negativo");
		}
		else {
		if (resultado <= 100) {
			importe_total = gastos_fijos + resultado * primeros_kw;
		} else if (resultado <= 100 + 150) {
			importe_total = gastos_fijos + (100 * primeros_kw) + (resultado - 100) * siguientes_kw;
		} else {
			importe_total = gastos_fijos + (100 * primeros_kw) + (150 * siguientes_kw) + (resultado - 250)* resto;
		}
		
		System.out.println(importe_total + " €");
	}
}
}