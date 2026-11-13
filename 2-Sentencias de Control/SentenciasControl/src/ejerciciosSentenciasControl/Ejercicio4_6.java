package ejerciciosSentenciasControl;

import java.util.Scanner;

public class Ejercicio4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 6. Programa que lee una fecha y la valida
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el dia en el que nos encontramos");
		int dia = sc.nextInt();
		if (dia <= 0 || dia > 31) {
			System.out.println("Dia no valido reinicie el programa");
		} else {
			System.out.println("Introduzca el mes en el que nos encontramos");
			int mes = sc.nextInt();
			if (mes <= 0 || mes > 12) {
				System.out.println("Mes no valido reinicie el programa");
			} else {
				if (dia == 31 && (mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
					System.out.println("Ninguno de estos meses tiene 31 dias reinicie el programa");
				} else {
					if (dia == 30 && mes == 2) {
						System.out.println("Febrero no tiene 30 dias reinicie el programa");
					} else {
						System.out.println("Introduce el año en el que nos encontramos");
						int año = sc.nextInt();
						boolean bisiesto = (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0));
						if (dia == 29 && mes == 2 && !bisiesto) {
							System.out.println("Error el año no es bisiesto");
						} else {
							System.out.println("Fecha valida");
						}
					}
				}
			}
		}
	}
}
