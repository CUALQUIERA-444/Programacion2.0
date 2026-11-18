package Sup;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Supermercado2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Random r = new Random();
		int unidades;
		int contador_envios = 0;
		double factura = 0;
		double precio_unidad;
		boolean envio;
		int zona_envio = 0;
		boolean jubilado;
		boolean valido;
		double total_compra = 0;
		double mercancia_extra = 0;
		int contador_compras = 0;
		double mejor1 = 0;
		double mejor2 = 0;
		int enviosjubilados = 0;

		// Leer la fecha de compra al principio del programa, comprobando que es correcta y que es anterior a la de hoy.
		LocalDate fecha_valida;
		do {
			fecha_valida = ValidarFecha(sc);
			if (fecha_valida == null) {
				System.out.println("La fecha no es válida");
			}
		} while (fecha_valida == null);

		// Por cada persona que llega al supermercado se anota el presupuesto máximo del que dispone
		double presupuestoMax;
		String codigo_producto;

		System.out.println("Introduzca el presupuesto máximo del que dispones (0 para salir):");
		presupuestoMax = sc.nextDouble();
		sc.nextLine(); // Limpiar buffer

		while (presupuestoMax > 0) {
			double factura_persona = 0; // Acumula todos los productos de esta persona

			// Bucle de compra de productos de la persona
			do {
				do {
					System.out.println("Introduce el código del producto (o FIN para terminar):");
					codigo_producto = sc.nextLine().toUpperCase();
					valido = ValidarCodigo(codigo_producto);
					if (!valido) {
						System.out.println("Código inválido vuelva a intentarlo");
					}
				} while (!valido);

				if (!codigo_producto.equalsIgnoreCase("fin")) {
					unidades = r.nextInt(4) + 1; // Número entre 1 y 4
					do {
						System.out.println("Introduce el precio unidad del producto:");
						precio_unidad = sc.nextDouble();
						sc.nextLine(); // Limpiar buffer
						if (precio_unidad < 0) {
							System.out.println("El precio unidad tiene que ser positivo vuelva a intentarlo");
						}
						if (precio_unidad == 0) {
							System.out.println("El precio unidad no puede ser gratuito");
						}
					} while (precio_unidad <= 0);

					factura = PrecioProductoTotal(precio_unidad, unidades, codigo_producto);

					if (factura > presupuestoMax) {
						System.out.println("No puede comprar eso pida otro producto");
					} else {
						presupuestoMax = presupuestoMax - factura;
						factura_persona += factura;
					}
				}
			} while (!codigo_producto.equalsIgnoreCase("fin") && presupuestoMax > 0);

			if (presupuestoMax == 0) {
				System.out.println("No le queda plata");
			}

			// Cuando una persona finaliza su compra, si la compra la realizó en martes o miércoles, se le hace un 5% de descuento.
			if (fecha_valida.getDayOfWeek().getValue() == 2 || fecha_valida.getDayOfWeek().getValue() == 3) {
				double descuento = factura_persona * 5 / 100;
				factura_persona = factura_persona - descuento;
				presupuestoMax += descuento;
			}

			// Envío a domicilio (se pregunta siempre al finalizar la compra de la persona)
			System.out.println("Desea un envio a domicilio (true/false):");
			envio = sc.nextBoolean();
			sc.nextLine(); // Limpiar buffer

			if (envio) {
				System.out.println("Introduce tu zona de envio (1, 2 o 3):");
				zona_envio = sc.nextInt();
				sc.nextLine(); // Limpiar buffer

				switch (zona_envio) {
				case 1:
					mercancia_extra = 5;
					break;
				case 2:
					mercancia_extra = 7;
					break;
				case 3:
					mercancia_extra = 10;
					break;
				default:
					System.out.println("No se puede realizar el envio");
					zona_envio = 4;
				}

				if (zona_envio != 4) {
					System.out.println("Eres jubilado (true/false):");
					jubilado = sc.nextBoolean();
					sc.nextLine(); // Limpiar buffer

					if (jubilado) {
						mercancia_extra = 0;
					}

					if (mercancia_extra > presupuestoMax) {
						System.out.println("No se puede realizar el envio por falta de presupuesto");
					} else {
						factura_persona += mercancia_extra;
						presupuestoMax -= mercancia_extra;
						contador_envios++;
						if (jubilado) {
							enviosjubilados++;
						}
					}
				}
			}

			// Mostrad el precio de toda la compra de la persona en cuestión
			total_compra += factura_persona;
			contador_compras++;
			System.out.printf("Factura de esta persona: %.2f euros\n", factura_persona);

			// Actualizar las dos compras más caras
			if (factura_persona > mejor1) {
				mejor2 = mejor1;
				mejor1 = factura_persona;
			} else if (factura_persona > mejor2) {
				mejor2 = factura_persona;
			}

			// Pedir presupuesto de la siguiente persona
			System.out.println("\nIntroduzca el presupuesto máximo de la siguiente persona (0 para salir):");
			presupuestoMax = sc.nextDouble();
			sc.nextLine(); // Limpiar buffer
		}

		// Al terminar el programa: estadísticas globales
		System.out.println("\n--- RESUMEN DEL DÍA ---");
		if (contador_envios > 0) {
			double porcentajeJubilados = (enviosjubilados * 100.0) / contador_envios;
			System.out.printf("Porcentaje de envíos realizados a jubilados: %.2f%%\n", porcentajeJubilados);
		} else {
			System.out.println("No se realizó ningún envío a domicilio.");
		}

		if (contador_compras > 0) {
			double media = total_compra / contador_compras;
			System.out.printf("Importe medio de todas las compras: %.2f euros\n", media);
			System.out.printf("Las dos compras más caras: %.2f euros y %.2f euros\n", mejor1, mejor2);
		} else {
			System.out.println("No se realizó ninguna compra.");
		}

		sc.close();
	}

	public static LocalDate ValidarFecha(Scanner sc) {
		LocalDate fech = null;
		String fecha;
		DateTimeFormatter p = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Introduzca la fecha (dd/MM/yyyy):");
		fecha = sc.nextLine();
		try {
			fech = LocalDate.parse(fecha, p);
		} catch (DateTimeParseException e) {
			return null;
		}
		if (!fech.isBefore(LocalDate.now())) {
			return null;
		}
		return fech;
	}

	public static boolean ValidarCodigo(String codigo_producto) {
		return codigo_producto.matches("^P[A-Z][0-9]{2,3}$") || codigo_producto.equalsIgnoreCase("fin");
	}

	public static double PrecioProductoTotal(double precio_unidad, int unidades, String codigo_producto) {
		char letra = codigo_producto.charAt(1);
		double factura_total = 0;
		double fact_inicial = precio_unidad * unidades; // 6 x 1 = 6
		if (letra == 'P') {
			factura_total = fact_inicial - fact_inicial * 20 / 100;
		} else if (letra == 'L') {
			// 6 - 1 * 2 = 4
			factura_total = fact_inicial - precio_unidad * (unidades / 3);
			// 3 unidades valen 3 euros pero por la regla del 3 por el precio de 2 seria 2 euros por 3
		} else {
			factura_total = fact_inicial;
		}
		return factura_total;
	}
}