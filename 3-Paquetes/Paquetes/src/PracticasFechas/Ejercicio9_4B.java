package PracticasFechas;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio9_4B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LocalDate fecha1 = leerFecha(sc);
		LocalDate fecha2 = leerFecha(sc);
		long dias = ChronoUnit.DAYS.between(fecha1, fecha2);
		System.out.println("Dias transcurridos "+dias);
		long meses = ChronoUnit.MONTHS.between(fecha1, fecha2);
		System.out.println("Meses transcurridos: "+meses);
	}
	public static LocalDate leerFecha(Scanner sc) {
		//No es buena practica leer en una funcion
		LocalDate fecha = null;
		int dia,mes,año;
		boolean correcta = false;
		do {
			try {
			System.out.println("Introduce día");
			dia=sc.nextInt();
			System.out.println("Introduce mes");
			mes=sc.nextInt();
			System.out.println("Introduce año");
			año = sc.nextInt();
			}
			catch (InputMismatchException e) { //Deja el scanneer con un enter 
			//SOLO PASA CON ESTA EXCEPCION
				sc.nextLine();
				System.out.println("Esperaba un número");
				continue;
			}
			try {
				fecha = LocalDate.of(año, mes, dia);
				System.out.println("fecha leida:"+fecha);
				correcta = true;
			}
			catch(DateTimeParseException e) {
				System.out.println("Fecha Incorrecta");
			}
		} while(!correcta);
	return fecha;
	}
}


