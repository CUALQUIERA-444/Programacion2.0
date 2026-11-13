package ejemplosfunciones;

import java.util.Scanner;

public class Ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean bisiesto;
		int año;
		do {
			System.out.println("Introduce un año");
			año = sc.nextInt();
			if (año < 1000 || año > 9999) {
				System.out.println("No tiene 4 digitos");
			}
		} while (año < 1000 || año > 9999);

		bisiesto = EsBisiesto(año);
		if (bisiesto) {
			System.out.println("Es bisiesto");
		} else {
			System.out.println("No es bisiesto");
		}
	}

	public static boolean EsBisiesto(int año) {
		if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
			return true;
		} else { // El else es opcion en este aspecto pero yo lo pongo
			return false;
		}
	}
}
