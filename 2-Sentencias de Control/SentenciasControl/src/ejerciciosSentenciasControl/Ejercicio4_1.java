package ejerciciosSentenciasControl;

import java.util.Scanner;

public class Ejercicio4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 	1. Programa que lee como datos de entrada una fecha expresada en día (del 1 al
31), mes (del 1 al 12) y año (en número) y nos dice la fecha que será al día
siguiente.
 */
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce el dia de hoy");
	int dia = sc.nextInt();
	if(dia < 1 || dia > 32) {
		System.out.println("DIA NO VÁLIDO VUELVA A INTENTARLO");
	}
	else {
		System.out.println("Introduzca el mes en el que nos encontremos");
		int mes = sc.nextInt();
		if(mes < 1 || mes > 12) {
			System.out.println("MES NO VÁLIDO VUELVA A INTENTARLO");
		}
		else {
			if (mes == 2 && (dia == 30 || dia == 31)) {
				System.out.println("FEBRERO NO VALIDO VUELVA A INTENTARLO");
			}
			else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia == 31) {
				System.out.println("NINGUNO DE ESTOS MESES TIENE 31 DIAS VUELVA A INTENTARLO");
			}
			else {
				System.out.println("Introduce el año en el que nos encontramos");
				int año = sc.nextInt();
				boolean bisiesto = (año % 4 == 0) && (año % 100 != 0 || año % 400 == 0);
				if(dia == 29 && mes == 2  && !bisiesto) {
					System.out.println("NO ES BISIESTO VUELVA A INTENTARLO");
				}
				else {
					if(dia == 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
							dia = 1;
							mes = mes +1;
					}
					else if (dia == 31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10))  {
						dia = 1;
						mes = mes + 1;
					}
					else if (dia == 31 && (mes == 12)) {
						dia = 1;
						mes = 1;
						año = año + 1;
					}
						else if (mes == 2 && dia == 28 && !bisiesto) {
						dia = 1;
						mes = mes + 1;
						}
						else {
							dia = dia + 1;
					}
					System.out.println(dia+"/"+mes+"/"+año);
				}
			}
	}
	}
}
}
