package exameninicial;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int destino, edad;
		double precio,descuento, equipaje;
		boolean numerosa;

		Scanner sc = new Scanner(System.in);

		System.out.println("Anota el destino:");
		destino = sc.nextInt();

		if (destino != 1 && destino != 2) {
			System.out.println("Destino incorrecto. Fin del programa");
		} 
		else { 
		if (destino == 1) {
			precio = 75;
		} 
		else {
			precio = 40;
		}
		System.out.println("Introduce la edad:");
		edad = sc.nextInt();
		System.out.println("Eres familia numerosa: true/false");
		numerosa = sc.nextBoolean();
		if(edad<14)
			descuento = 50;
		else if (edad > 65) {
			descuento = 30;
		}
		else  {
			descuento = 20;
		}
		System.out.println("Introduce peso del equipaje");
		equipaje = sc.nextDouble();
		if(equipaje>20) {
			precio = precio - precio * descuento / 100 + (equipaje-20)*2.5;
		}
		else {
			precio = precio - precio * descuento / 100;
		}
		System.out.println("El precio final es "+precio+"€");
		}
		}
}
