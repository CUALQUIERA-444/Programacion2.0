package practicaFechas;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej4_2 {

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
		boolean correcta = false;
		String fechaS;
		DateTimeFormatter patron = DateTimeFormatter.ofPattern("dd/LL/yy"); 

		do {
			System.out.println("Anota fecha en formato:dd/mm/aa");
			fechaS=sc.nextLine();
			try {
				fecha = LocalDate.parse(fechaS,patron);
				correcta = true;
				System.out.println("Fecha leida:" + fecha);

			} catch (DateTimeParseException e) {
				System.out.println("Fecha incorrecta");
			}

		} while (!correcta);

		return fecha;

	}
}
