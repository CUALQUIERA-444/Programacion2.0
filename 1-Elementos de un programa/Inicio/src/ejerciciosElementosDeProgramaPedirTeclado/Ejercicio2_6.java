package ejerciciosElementosDeProgramaPedirTeclado;

import java.util.Scanner;

public class Ejercicio2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 6. Programa que lee el precio de tarifa de un producto y el precio final pagado por
el mismo y nos calcula el descuento (%) realizado
Fórmula Se resta el final con el inicial posteriormente divides el ahorro inicial con el precio inicial y se pasa a porcentaje multiplicando por 100
 */
	Scanner sc = new Scanner (System.in);
	System.out.println("Introduce el precio de tarifa del producto (Default)");
	double tarifa = sc.nextDouble();
	System.out.println("Introduce el precio final del producto (POR FAVOR QUE SEA MENOR QUE EL DE TARIFA)");
	double precio_final = sc.nextDouble();
	double descuento = (tarifa - precio_final) / tarifa * 100;
	double descuento2 = 100 - (precio_final * 100) / tarifa;
	System.out.println("El descuento es de "+descuento2+"%");
	/*
	 * Alternativa 
	 * descuento = 100 - (precioFinal * 100) / precioInicial Saca el porcentaje del precioInicial ejemplo si fuera 70 seria 100-70
	 */
	System.out.println("El descuento es de "+descuento+"%");
	} 
}
