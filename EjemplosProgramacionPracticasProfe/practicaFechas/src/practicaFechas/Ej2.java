package practicaFechas;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate f1,f2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce primera fecha:");
		f1=leerFecha(sc);
		System.out.println("Introduce la segunda fecha:");
		f2=leerFecha(sc);
		if (f1.isBefore(f2))
			System.out.println(f1+","+f2);
		else
			System.out.println(f2+","+f1);

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
