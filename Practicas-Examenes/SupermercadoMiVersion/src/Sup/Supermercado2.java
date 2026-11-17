package Sup;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Supermercado2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * RA3 - ESTRUCTURAS DE CONTROL

Queremos simular la compra en un supermercado de una persona, haz un programa en java,
utilizando las variables y constantes adecuadas y usando comentarios.
- Comprobar que el usuario no se ha pasado del presupuesto inicial, si es así, la compra de
este último producto se anula y se pide otro código de producto. (1 pto)
El usuario termina su compra cuando se anote “FIN” como código de producto, (0,5 ptos)
Si se trata de un envío a domicilio se pide la zona de envío, que puede ser de la 1 a la 3, si no
es así no se puede realizar el envío. En otro caso se cobra 5,7 ó 10 euros respectivamente, más
por el envío, a no ser que se trate de un jubilado, en cuyo caso el envío es gratis. (1,25 pto)
Mostrad el precio de toda la compra de la persona en cuestión.
Repetid el proceso para varias personas hasta que se anote un presupuesto máximo de 0
euros. (1,5 pto)
Al Terminar el programa:
- Mostrad de todos los envíos realizados, el porcentaje realizado a jubilados. (0,5 pto)
- Mostrad el importe medio de todas las compras realizadas, y el importe de las dos
compras más caras. (1 pto)
Añadid al enunciado:
 */
	Scanner sc = new Scanner(System.in);
	sc.useLocale(Locale.ENGLISH);
	Random r = new Random();
	int unidades; 
	double presupuestoRes = 0;
	double factura;
	double precio_unidad;
//Leer la fecha de compra al principio del programa, comprobando que es correcta y que es anterior a la de hoy.
	LocalDate fecha_valida;
	String f = "";
	do {
		fecha_valida = ValidarFecha(sc,f);
		if(fecha_valida == null) {
			System.out.println("La fecha no es válida");
		}
	} while(fecha_valida == null);
//Por cada persona que llega al supermercado se anota el presupuesto máximo del que dispone
	double presupuestoMax;
	String codigo_producto;
	System.out.println("Introduzca el presupuesto máximo del que dispones");
	presupuestoMax = sc.nextDouble();
	sc.nextLine(); //Limpiar buffer
	boolean valido;
/*
 * y después se simula la compra de varias unidades de varios productos de la siguiente manera:
- Se anota el código de producto, que tiene esta forma PX999, dónde el carácter X es una
letra que indica la sección, y luego tiene entre dos y tres dígitos . Leedlo hasta que sea
correcto, validadlo con una función. (1,5 pto)
 */
	do {
	System.out.println("Introduce el código del producto");
	codigo_producto = sc.nextLine().toUpperCase();
	valido = ValidarCodigo(codigo_producto);
	if(!valido) {
		System.out.println("Código inválido vuelva a intentarlo");
	}
	} while(!valido);
	/*
	 * - Se calculan las unidades de forma aleatoria (entre 1 y 4). (1 pto)
	   - Se pide el precio unidad, validando que sea positivo. (0,25 ptos)
	 */
		if(!codigo_producto.equalsIgnoreCase("fin")) {
		unidades = r.nextInt(4)+1; //r.nextInt Numero entre 0 y 3 +1 = Numero entre 1 y 4
		do {
		System.out.println("Introduce el precio unidad del producto");
		precio_unidad = sc.nextDouble();
		sc.nextLine(); //Limpiar buffer
		if(precio_unidad < 0) {
			System.out.println("El precio unidad tiene que ser positivo vuelva a intentarlo");
		}
		if(precio_unidad == 0) {
			System.out.println("El precio unidad no puede ser gratuito");
		}
		} while(precio_unidad <= 0);
	/*	- Calculamos el precio de las unidades mediante una función, sabiendo que los productos
		que pertenecen a la sección de pescadería (P) tienen un descuento del 20% y los lácteos
		(L), tienen un descuento del 3 por 2 unidades. (1,5 pto)
	*/
		factura = PrecioProductoTotal(precio_unidad,unidades,codigo_producto);
	//	Cuando una persona finaliza su compra, si la compra la realizó en martes o miércoles, se le hace un 5% de descuento.
	
		}
	}
	public static LocalDate ValidarFecha(Scanner sc,String fecha) {
		LocalDate fech = null;
		DateTimeFormatter p = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Introduzca la fecha");
		fecha = sc.nextLine();
		try {
			fech = LocalDate.parse(fecha,p);
		}
		catch (DateTimeParseException e) {
			return null;
		}
		if(!fech.isBefore(LocalDate.now())) {
			return null;
		}
		return fech;
	}
	public static boolean ValidarCodigo(String codigo_producto) {
		return codigo_producto.matches("^P[A-Z][0-9]{3}$");
	}
	public static double PrecioProductoTotal (double precio_unidad, int unidades,String codigo_producto) {
		char letra = codigo_producto.charAt(1);
		double factura_total = 0;
		double fact_inicial = precio_unidad * unidades;
		if(letra == 'P') {
			factura_total = fact_inicial - fact_inicial * 20 / 100;
		}
		else if(letra == 'L')
			factura_total = fact_inicial - fact_inicial * (unidades / 3);
		//3 unidades valen 3 euros pero por la regla del 3 por el precio de 2 seria 2 euros con 3
	}
	}

