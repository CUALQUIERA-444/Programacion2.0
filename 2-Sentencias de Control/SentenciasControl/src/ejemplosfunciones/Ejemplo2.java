package ejemplosfunciones;

import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	double precioO, precioF,descuento;
	System.out.println("Anota el precio inicial:");
	precioO = sc.nextDouble();
	System.out.println("Anota el precio rebajado:");
	precioF = sc.nextDouble();
	
	descuento = calcDescuento(precioO,precioF); //Se requiere recogerlo
	System.out.println("El descuento aplicado ha sido de:"+descuento+"%");
	}
	public static double calcDescuento(double pO, double pF) {
		double resul;
		resul = (pO-pF)*100/pO; //Precio original - Precio final * 100 (Para los decimales) y lo divides entre el precio original
		return resul;
	}
}
