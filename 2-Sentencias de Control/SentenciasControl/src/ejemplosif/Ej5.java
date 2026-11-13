package ejemplosif;

import java.util.Locale;
import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 5. Programa que calcula el salario semanal de un empleado al que se le paga 15
euros por hora si éstas no superan las 35 horas. Cada hora por encima de 35 se
considerará extra y se paga a 22 €.
El programa pide las horas del trabajador y devuelve el salario que se le debe
pagar
 */
	Scanner sc = new Scanner(System.in);
	sc.useLocale(Locale.ENGLISH);
	System.out.println("Introduzca las horas que trabaja");
	int horas = sc.nextInt();
	final double fijo = 15, extra = 22 , hora_l = 35;
	double salario;
	if (horas > hora_l) {
		salario = hora_l * fijo + (horas - hora_l)* extra;
	}
	else {
		salario = horas * fijo;
	}
	System.out.println("El salario total es "+salario+" €");
	}
}
