package EjerciciosFunciones;

import java.util.Scanner;

public class Ejercicio7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. En una empresa se rellena una ficha por cada empleado con los siguientes
datos:
 Número de empleado
 Sueldo
 Horas extras
 Precio hora extra
 Otros ingresos
Algoritmo que escribe aquellos empleados(su número) que reciben más de 600
€ al mes, así como lo que perciben. El proceso termina cuando el número de
empleado es 0. Se utilizarán un método para calcular el salario final
flota calcularSalario(float sueldo, int horas, float precioHora, float otros)
		 */
		int num, horasExtras;
		float sueldo, precioHE, otros,sueldoFinal;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce número de empleado:");
		num = sc.nextInt();

		while (num != 0) {
			System.out.println("Introduce sueldo");
			sueldo = sc.nextFloat();
			System.out.println("Introduce hora extra:");
			precioHE = sc.nextFloat();
			System.out.println("Introduce número de horas extras:");
			horasExtras = sc.nextInt();
			System.out.println("Introduce otros ingresos");
			otros = sc.nextFloat();
			sueldoFinal = calcularSalario(sueldo,horasExtras,precioHE,otros);
			if(sueldoFinal > 600) {
				System.out.println("El empleado número "+num+" cobra más de 600 euros, cobra:"+sueldoFinal);
			}
			System.out.println("Introduce número de empleado:");
			num=sc.nextInt();
		}
	}

	public static float calcularSalario(float sueldo, int horas, float precioHora, float otros) {
		float sueldoTotal;
		sueldoTotal = sueldo + horas * precioHora + otros;
		return sueldoTotal;
	}
}
