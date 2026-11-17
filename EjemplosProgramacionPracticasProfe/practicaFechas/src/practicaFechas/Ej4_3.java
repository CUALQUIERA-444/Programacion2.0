package practicaFechas;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate fecha1 = null, fecha2 = null;
		
		Scanner sc = new Scanner(System.in);

		fecha1 = leerFecha(sc);
		fecha2 = leerFecha(sc);

		long dias = ChronoUnit.DAYS.between(fecha1, fecha2);
		System.out.println("Dias transcurridos:" + dias);

		long meses = ChronoUnit.MONTHS.between(fecha1, fecha2);
		System.out.println("Meses transcurridos:" + meses);

	}

	public static LocalDate leerFecha(Scanner sc) {

		LocalDate fecha=null;
		int dia, mes, año;
		boolean correcta = false;

		do {
			try {
				System.out.println("Introduce dia:");
				dia = sc.nextInt();
				System.out.println("mes:");
				mes = sc.nextInt();
				System.out.println("año");
				año = sc.nextInt();
			} catch (InputMismatchException e) {
				sc.nextLine(); // Limpio por producirse la InputMismatchException
				System.out.println("Esperaba un número");
				continue;
			}
			try {
				fecha = LocalDate.of(año, mes, dia);
				correcta = true;
				System.out.println("Fecha leida:" + fecha);

			} catch (DateTimeException e) {
				System.out.println("Fecha incorrecta");
			}

		} while (!correcta);

		return fecha;

	}
}
