package ExamenAñoPasado;

import java.util.Scanner;

public class E_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	char letraI;
	char letraF;
	int cont = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce una letra");
	letraI = sc.nextLine().charAt(0);
	do {
		System.out.println("Introdce una letra:");
		letraF= sc.nextLine().charAt(0);
		if(letraI != letraF) {
		cont++;
		}
	} while ( letraI != letraF);
	System.out.println("Has anotado "+cont+" letras distintas de la inicial");
	}
}
