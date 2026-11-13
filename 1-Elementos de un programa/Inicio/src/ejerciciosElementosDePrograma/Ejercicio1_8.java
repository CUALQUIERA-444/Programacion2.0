package ejerciciosElementosDePrograma;

public class Ejercicio1_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 8. Programa que dada una variable t que contiene un tiempo en segundos, nos
muestre dicho tiempo expresado en horas, minutos y segundos.
 */
	  final int s_horas = 3600, s_minutos = 60;
	  int t = 7200; 
	  int hora = t / s_horas;
	  int minutos = t / s_minutos;
	  System.out.println("Horas "+hora);
	  System.out.println("Minutos "+minutos);
	  System.out.println("Segundos "+t);
	}
}
