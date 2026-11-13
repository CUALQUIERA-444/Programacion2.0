package ejemplosfunciones;

import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int num;
	
	Scanner sc = new Scanner(System.in);
	do {
	System.out.println("Introduce número"); //Para validar mejor do-while
	num = sc.nextInt();
	if (num >= 100) {
		System.out.println("El número tiene que ser menor que 100");
	}
	} 
	while (num>=100);
	escribir(num);
	}
	public static void escribir(int n) {
		for (int i=1; i<=n;i++) {
			System.out.println("Módulo ejecutándose");
		}
	}
}
