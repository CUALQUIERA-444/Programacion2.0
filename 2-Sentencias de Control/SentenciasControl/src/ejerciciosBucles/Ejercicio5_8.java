package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio5_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 8. Pedir el salario de 10 empleados. 
 * Mostrar cuantos ganan más de 1000€.
 */
	Scanner sc = new Scanner(System.in);
	int contador_empleados = 1;
	int salarios_superiores = 0;
	do {
		System.out.println("Introduce el salario del empleado "+contador_empleados);
		double salario = sc.nextDouble();
		if (salario > 1000) {
			salarios_superiores++;
		}
		contador_empleados++;
	} while (contador_empleados <= 10 );
	System.out.println("Hay un total de "+salarios_superiores+" trabajadores que ganan mas de 1000 euros");
	
	}
}
