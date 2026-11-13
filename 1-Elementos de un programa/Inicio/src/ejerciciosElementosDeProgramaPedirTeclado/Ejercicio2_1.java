package ejerciciosElementosDeProgramaPedirTeclado;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 1. Repetir los ejercicios de la hoja 1 modificando el código para introducir los
valores de las variables desde teclado.
 */
/*
 * 1-1. Programa que muestre por pantalla, respetando los retornos de línea, el siguiente
		texto
		Me gusta la programación
		Cada día
		MÁSSS
??? Sin String no se puede hacer esto por respeto pondré char */
	Scanner sc = new Scanner(System.in);
	char c_a,c_b,c_c;
	System.out.println("Introduce la primera letra");
	c_a = sc.nextLine().charAt(0);
	System.out.println("Introduce la segunda letra");
	c_b = sc.nextLine().charAt(0);
	System.out.println("Introduce la tercera letra");
	c_c = sc.nextLine().charAt(0);
	System.out.println(c_a);
	System.out.println(c_b);
	System.out.println(c_c);
/*
 * 1-2. Programa en el que declaramos una variable entera con valor nuestra edad y
escribimos la siguiente salida:
MI EDAD: aparecerá el valor
MI EDAD EL PRÓXIMO ANYO: aparecerá el correspondiente valor
 */
 int edad; 
 System.out.println("Introduce tu edad");
 edad = sc.nextInt();
 // int edad_futura = ++edad; Edad se modifica y lo pone en edad futura;
 int edad_futura = edad + 1;
 System.out.println("MI EDAD "+edad);
 System.out.println("MI EDAD EL PRÓXIMO AÑO "+edad_futura);
/*
 * 1-3. Programa en el que declaramos dos variables reales con el valor que queramos y
mostramos la siguiente salida

5.6666666 + 3.4444444= 9,11111
(Utiliza los valores que tú quieras)
 */
 sc.useLocale(Locale.ENGLISH);
 double valor_a;
 double valor_b; //Ctrl + Shift + F Identa el código
 System.out.println("Introduce el primer valor (Decimal)");
 valor_a = sc.nextDouble();
 System.out.println("Introduce el segundo valor (Decimal)");
 valor_b = sc.nextDouble();
 double resultado = valor_a + valor_b;
 System.out.printf("%.6f+" + " + "+"%.6f"+" = "+" %.6f"+"\n",valor_a,valor_b,resultado);
/*
 * 1-4. Programa que calcula la longitud de una circunferencia de radio 3 metros (2πr)
 *  Formula con el diametro = pi * diametro
 * Formula con el radio = pi * 2 * radio
 */
  final double pi = 3.1416, fijo = 2;
  double radio,longitud;
  System.out.println("Introduce el radio de la circunferencia para calcular la longitud");
  radio = sc.nextDouble();
  longitud = pi * fijo * radio;
  System.out.println("La longitud de la circunferencia es de "+longitud+" m²");
/*
 * 1-5. Programa que calcula el área de una circunferencia de radio 5,2 centímetros (π r2 )
 * Formula para el area de una circunferencia area = pi * r²
 * 
 */
  double area,radio2;
  System.out.println("Introduce el radio de la circunferencia");
  radio2 = sc.nextDouble();
  area = (radio2 * radio2) * pi;
  System.out.println("El area de la circunferencia es de "+area+" m²");
/*
 1-6. Programa en el que declaramos las variables edad, estudios, ingresos (decidir cuál
es el tipo de dato más adecuado para cada una) y les damos una valor. Almacenar
en una variable booleana jasp el valor:
Verdadero si la edad es inferior a 28, el nivel de estudios es mayor que tres y los
ingresos superan los 28.000 €
Falso en caso contrario
 */
 final int edad_limite = 28, estudios_limite = 3; final double ingresos_limite = 28000;
 int edad_2;
 System.out.println("Introduce la edad de la persona");
 edad_2 = sc.nextInt();
 System.out.println("Introduce el nivel de estudios de la persona");
 int estudios_nivel = sc.nextInt();
 System.out.println("Introduce los ingresos de la persona (Decimal)");
 double ingresos = sc.nextDouble();
 boolean jasp = (edad < edad_limite ) && (estudios_nivel > estudios_limite) && (ingresos > ingresos_limite);
 System.out.println(jasp);
/*
 * 1-7. Programa que dadas dos variables a y b, intercambie sus valores
 */
 System.out.println("Introduce el valor de a");
 int valor_A = sc.nextInt();
 System.out.println("Introduce el valor de b");
 int valor_B = sc.nextInt();
 int auxiliar = valor_A;
 valor_A = valor_B;
 valor_B = auxiliar;
 System.out.println("Valor A "+valor_A);
 System.out.println("Valor B "+valor_B);
/*
 * 1-8. Programa que dada una variable t que contiene un tiempo en segundos, nos
muestre dicho tiempo expresado en horas, minutos y segundos.
 */
 final int segundos_m = 60, segundos_h = 3600;
 System.out.println("Introduce los segundos");
 int t = sc.nextInt();
 int minutos = t / segundos_m;
 int horas = t / segundos_h;
 System.out.println("Segundos "+t);
 System.out.println("Minutos "+minutos);
 System.out.println("Horas "+horas);
	}
}
