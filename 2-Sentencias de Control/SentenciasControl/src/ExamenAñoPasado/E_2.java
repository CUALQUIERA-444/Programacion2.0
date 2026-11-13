package ExamenAñoPasado;

import java.util.Scanner;

public class E_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce dos números (Inicio Fin)");
	int n_a;
	int n_b;
	int suma = 0;
	int auxiliar;
	n_a = sc.nextInt();
	n_b = sc.nextInt();
	if(n_a > n_b) {
		auxiliar = n_a;
		n_a = n_b;
		n_b = auxiliar;
	}
	n_a = n_a + 1;
	while(n_a < n_b) {
		if (n_a % 2 == 0) {
			suma = suma + n_a;
		}
		n_a++;
	}
	System.out.println("Suma "+suma);
	}
}
