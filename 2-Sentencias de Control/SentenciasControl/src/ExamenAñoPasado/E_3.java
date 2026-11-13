package ExamenAñoPasado;

import java.util.Scanner;

public class E_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int numero;
	do {
	System.out.println("Introduce un numero");
	numero = sc.nextInt();
		if(numero <=0) {
			System.out.println("Error, número incorrecto");
		}
	} while (numero<=0);
	//No se puede dividir entre 0 No tiene un resultado definido
	for (int i = 2; i<numero;i++) { //Empezar en dos asumiendo que el 1 ya se toma por defecto pero vamos da igual
		if (numero % i != 0) {
			System.out.println(i);			
		}
	}
	}
}
