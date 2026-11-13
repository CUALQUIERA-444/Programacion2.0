package ejerciciosSentenciasControl;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 10. Una empresa tiene trabajadores de categorías A, B y C. Todos cobran un salario base. Los
de las categorías A y B cobran además un suplemento de 240 euros. En la categoría C, en
la sección 1ª están los contratados por días, que cobran un suplemento de 0.5 € por día
trabajado y se les descuenta 30 € por baja injustificada. El resto de las secciones de esta
categoría cobra 120€ de suplemento. Programa que lee los datos de un trabajador y nos
calcula su sueldo final.
 */
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		double sueldo;
		final double descuento = 30, suplemento = 240, suplementoSecciones = 120, suplementoDiario = 0.5;
		System.out.println("Introduzca el sueldo bruto que percibe");
		sueldo = sc.nextDouble();
		System.out.println("Introduce la categoría a la que perteneces (A/B/C)");
		sc.nextLine();
		char categoria = sc.nextLine().charAt(0);
		if (categoria != 'C' && categoria != 'c' && categoria != 'A' && categoria != 'a' && categoria !='b' && categoria !='B') {
			System.out.println("NO PUEDE PERTENECER A ESTA CATEGORIA REINICIE EL PROGRAMA");
		}
		else {
			if (categoria == 'C' || categoria == 'c') {
			System.out.println("Introduce la seccion a la que pertenece (Usa numeros)");
			int seccion = sc.nextInt();
			if (seccion == 1) {
				System.out.println("Introduzca cuantos dias ha trabajado");
				int dia = sc.nextInt();
				System.out.println("Introduzca cuantas bajas injustificadas tiene");
				int baja = sc.nextInt();
				sueldo =  sueldo + suplementoDiario * dia - baja * descuento;
			}
			else {
				sueldo = sueldo + suplementoSecciones;
			}
		}
		else {
			sueldo = sueldo + suplemento;
		}
		System.out.println("Su Sueldo es de "+sueldo+"€");
	}
}
}
