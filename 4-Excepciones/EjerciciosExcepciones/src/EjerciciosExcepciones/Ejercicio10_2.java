package EjerciciosExcepciones;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Ejercicio10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 2. Haced una función que lea una fecha en formato dd/mm/aa mientras sea
incorrecta.
 */
	Scanner sc = new Scanner(System.in);
	DateTimeFormatter p = DateTimeFormatter.ofPattern("dd/MM/yy");
	LocalDate fecha = null;
	String fech;
	boolean valido;
	do {
	System.out.println("Introduce la fecha");
	fech = sc.nextLine();
	try {
		fecha = LocalDate.parse(fech,p);
		valido = true;
	}
	catch (DateTimeParseException e) {
		System.out.println("Fecha inválida vuelva a intentarlo");
		valido = false;
	}
	} while (!valido);
	System.out.println(fecha.format(p));
}
}