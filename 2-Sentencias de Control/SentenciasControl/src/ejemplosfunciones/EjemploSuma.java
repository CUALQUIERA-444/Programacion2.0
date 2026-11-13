package ejemplosfunciones;

import java.util.Scanner;

public class EjemploSuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a,b,suma;
	Scanner sc = new Scanner(System.in);
	System.out.println("Anota primer número");
	a = sc.nextInt();
	System.out.println("Anota segundo número");
	b = sc.nextInt();
	suma=fsuma(a,b);
	System.out.println("La suma es:"+suma);
	}
	public static int fsuma(int n1, int n2) {
		int s;
		s=n1+n2;
		return s;
	}
}
