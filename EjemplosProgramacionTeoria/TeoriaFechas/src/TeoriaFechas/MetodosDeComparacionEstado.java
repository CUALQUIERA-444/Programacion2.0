package TeoriaFechas;

import java.time.LocalDate;

public class MetodosDeComparacionEstado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDate fecha = LocalDate.now();
LocalDate fecha2 = fecha.plusDays(1);
if(fecha2.isBefore(fecha)) { //Comprueba si es anterior a otra fecha
	System.out.println("A");
}
if(fecha2.isAfter(fecha)) { //Comprueba si es posterior a otra fecha
	System.out.println("B");
}
if(fecha2.isEqual(fecha)) { //Comprueba si son iguales cronologicamente
	System.out.println("C");
}
if(fecha2.isLeapYear()) { //Solo en LocalDate Comprueba si es bisiesto
	System.out.println("D");
}
int c = fecha.compareTo(fecha2);
/*
 * Compara el orden (negativo,cero o positivo)
-Si da negativo el llamante es anterior al llamado
-Si da cero ambos son iguales
-Si da positivo el llamante es posterior al llamado

 */
	}
}
