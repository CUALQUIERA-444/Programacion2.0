package supermercado;

import java.util.Random;
import java.util.Scanner;

public class ExamenSupermercado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double importeDisp,importeAct = 0;
	String codigo;
	boolean correcto;
	double precioUnidad;
	int unidades;
	double precio;
	Random r = new Random();
	Scanner sc = new Scanner(System.in);
	System.out.println("Anota el importe del que dispones");
	importeDisp = sc.nextDouble();
	do {
		sc.nextLine(); //Limpiar buffer
		do {
		System.out.println("Anota código:");
		codigo = sc.nextLine();
		if(codigo.equalsIgnoreCase("fin")) {
			break;
		}
		correcto = validarCodigo(codigo);
		if(!correcto) {
			System.out.println("Código incorrecto");
		}
		} while (!correcto);
		if(!codigo.equalsIgnoreCase("fin")) {
			unidades = r.nextInt(1,5);
			System.out.println("Unidades: "+unidades);
			//unidades = r.nextInt(4)+1
			do {
				System.out.println("Introduce precio unidad");
				precioUnidad = sc.nextDouble();
				if(precioUnidad <= 0)
					System.out.println("Tiene que ser un número positivo");
			} while (precioUnidad <= 0);
			precio = calcularPrecio(codigo,unidades,precioUnidad);
		if(importeAct + precio<=importeDisp) {
			System.out.println("Producto aceptado");
			importeAct += precio;
		}
		else {
			System.out.println("Producto anulado, no tienes suficiente dinero");
		}
		}
	} while(!codigo.equalsIgnoreCase("fin"));
	System.out.println("En total te has gastado :"+importeAct+" euros en productos");
	System.out.println("Desea envío a domicilio");
	
	}
public static boolean validarCodigo(String cod) {
	return cod.matches("^P[A-Za-z][0-9]{3}$");
}
public static double calcularPrecio(String codigo, int un, double pun) {
	double precio;
	char seccion = codigo.charAt(1);
	if(seccion== 'P') {
		precio=un*pun*0.8;
	}
	else { //3 x 2 Por cada 3 unidades del producto me regalan una //3 por el precio de 2 unidades
		if(seccion == 'L')  {
			precio=pun*(un-un/3);
		}
		else {
			precio=pun*un;
		}
	}
	return precio;
}
}
