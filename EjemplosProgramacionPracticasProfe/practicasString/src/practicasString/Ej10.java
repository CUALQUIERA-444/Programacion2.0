package practicasString;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cad, patron = null;
		int opc;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce cadena:");
		cad = sc.nextLine();
		System.out.println(
				"Qué tipo de validación deseas:\n1.Matrícula\n2.Nif\n3.Codigo postal Madrid\n4.Teléfono\n5.Código usuario");
		opc = sc.nextInt();
		switch (opc) {
		case 1:
			patron = "^[0-9]{4}[^0-9a-zñAEIOUÑ]{3}$";
			break;
		case 2:
			patron = "^[0-9]{8}[A-Z]$";
			break;
		case 3:
			patron ="^28[0-9]{3}$";
			break;
		case 4:
			patron="^[679][0-9]{8}$";
			break;
		case 5:
			patron="^[a-zA-Z][a-zA-Z0-9]{4,9}$";
			break;

		default:
			System.out.println("Opción incorrecta");
		}
		if (cad.matches(patron))
			System.out.println("Correcto");
		else
			System.out.println("Incorrecto");

	}

}
