package ejerciciosElementosDePrograma;

public class Ejercicio1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 2. Programa en el que declaramos una variable entera con valor nuestra edad y
escribimos la siguiente salida:
MI EDAD: aparecerá el valor
MI EDAD EL PRÓXIMO ANYO: aparecerá el correspondiente valor
 */
	int edad = 21;
	// int edad_futuro = edad += 1; Primero acumula el valor y despues lo asigna
	// int edad_futuro = edad++; //Asigna y despues acumula
	int edad_futuro = edad + 1;
	System.out.println("MI EDAD: "+edad);
	System.out.println("MI EDAD EL PRÓXIMO AÑO: "+edad_futuro);
	}
}
