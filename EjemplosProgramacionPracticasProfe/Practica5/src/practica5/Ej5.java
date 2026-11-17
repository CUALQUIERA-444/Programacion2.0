package practica5;

import java.util.Random;
import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numM,numS,intentos=1;
		Random r=new Random();
		Scanner sc=new Scanner(System.in);
		
		numM=r.nextInt(10); // Aleatorio entre 0 y 9
		//System.out.println(numM);
		
		System.out.println("Introduce un número:");
		numS=sc.nextInt();
		
		while(numS!=numM) {
			if (numS>numM)
				System.out.println("El número que buscas es menor");
			else
				System.out.println("El número que buscas es mayor");
			intentos++;
			System.out.println("Introduce un número:");
			numS=sc.nextInt();
		}
		
		System.out.println("Enhorabuena has acertado el número, has hecho "+intentos+" intentos");
		
		
	}

}
