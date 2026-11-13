package ejerciciosElementosDePrograma;

public class Ejercicio1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 6. Programa en el que declaramos las variables edad, estudios, ingresos (decidir cuál
es el tipo de dato más adecuado para cada una) y les damos una valor. Almacenar
en una variable booleana jasp el valor:
Verdadero si la edad es inferior a 28, el nivel de estudios es mayor que tres y los
ingresos superan los 28.000 €
Falso en caso contrario
//Extra long Es un tipo de dato entero pero que ocupa mas espacio en la memoria RAM
/// 
 */
	final int default_edad = 28, default_estudios = 3, default_ingresos = 28000;
	int edad = 28;
	int estudios = 3;
	double ingresos = 28000;
	boolean jasp = (edad < default_edad ) && (estudios > default_estudios) && (ingresos > default_ingresos);
	System.out.println("La afirmación es "+jasp);
	}
}
