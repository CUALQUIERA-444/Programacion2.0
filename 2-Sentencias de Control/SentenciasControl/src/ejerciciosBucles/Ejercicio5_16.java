package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio5_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 16. Una empresa que se dedica a la venta de desinfectantes necesita un programa
para gestionar las facturas. En cada factura figura: el código del artículo, la cantidad
vendida en litros y el precio por litro.
El programa pedirá los datos de 5 facturas introducidas y calculará y mostrará:
Facturación total = Precio de todas las facturas juntas.
cantidad en litros vendidos del artículo 1
número de facturas que se emitieron de más de 600 €. Por factura
 */
	Scanner sc = new Scanner(System.in);
	int codigo_articulo;
	double cantidad_litros;
	double precio_litros;
	double cantidad_litrosCod1 = 0;
	double acumulador_facturas = 0;
	double resultado;
	int contador_600 = 0;
	for (int i = 1; i<=5; i++) {
		System.out.println("Introduce el codigo del articulo (Un numero)");
		codigo_articulo = sc.nextInt(); //Cada articulo durante la factura puede tener el mismo codigo
		System.out.println("Introduce la cantidad en litros que se vendio dicho articulo");
		cantidad_litros = sc.nextDouble();
		System.out.println("Introduce el precio por litro del articulo");
		precio_litros = sc.nextDouble();
		resultado = cantidad_litros * precio_litros;
		acumulador_facturas = acumulador_facturas + resultado;
		if (codigo_articulo == 1) {
			cantidad_litrosCod1 += cantidad_litros;
		}
		if (resultado > 600) {
			contador_600++;
		}
	}
	System.out.println("Facturacion total "+acumulador_facturas+"€");
	System.out.println("Cantidad de litros articulo 1 "+cantidad_litrosCod1+" litros");
	System.out.println("Numero de facturas que superaron los 600 euros "+contador_600);
	}
}
