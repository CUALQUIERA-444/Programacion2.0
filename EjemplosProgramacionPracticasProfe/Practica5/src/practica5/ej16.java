package practica5;

import java.util.Locale;
import java.util.Scanner;

public class ej16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int codigo,cont=0;
		double litros, precioU, precioF, total=0, litros1=0;
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		for(int i=1;i<=5;i++) {
			System.out.println("Introduce codigo:");
			codigo=sc.nextInt();
			System.out.println("Introduce litros:");
			litros=sc.nextDouble();
			System.out.println("Introduce precio:");
			precioU=sc.nextDouble();
			precioF=litros*precioU;
			System.out.println("El precio de la factura es:"+precioF);
			total=total + precioF;
			if (codigo==1)
				litros1=litros+litros1;
			if (precioF>600)
				cont++;
		}
		
		System.out.println("Precio total:"+total);
		System.out.println("Número de facturas de más de 600:"+cont);
		System.out.println("Total litros producto código1:"+litros1);
		

	}

}
