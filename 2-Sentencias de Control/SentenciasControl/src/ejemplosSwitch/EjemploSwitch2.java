package ejemplosSwitch;

import java.util.Scanner;

public class EjemploSwitch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce un tipo de motor");
	int motor = sc.nextInt();
	switch(motor) {
	case 1:
		System.out.println("LA BOMBA ES UNA BOMBA DE AGUA");
		break;
	case 2:
		System.out.println("LA BOMBA ES UNA BOMBA DE GASOLINA");
		break;
	case 3:
		System.out.println("LA BOMBA ES UNA BOMBA DE HORMIGÓN");
		break;
	case 4:
		System.out.println("NO EXISTE UN VALOR VÁLIDO PARA ESTE TIPO DE BOMBA");
		break;
	}
	int nota = 7;
	double n = nota;
	}
}
