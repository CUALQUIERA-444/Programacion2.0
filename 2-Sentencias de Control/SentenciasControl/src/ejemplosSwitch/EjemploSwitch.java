package ejemplosSwitch;

import java.util.Scanner;

public class EjemploSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int puesto;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el puesto");
		puesto = sc.nextInt();
		switch (puesto) {
		case 1: 
			System.out.println("ORO");
		case 2: 
			System.out.println("PLATA");
		case 3: 
			System.out.println("BRONCE");
		default: 
			System.out.println("SIN PREMIO");
			break;
		}
		//El default no es obligatorio
	}
}
