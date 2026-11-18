package TeoriaFechas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class MetodosCalculoDiferencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDate c = LocalDate.now();
LocalDate d = c.plusYears(1);
Period e = Period.between(c, d);
/*
 * Diferencia entre Años,Meses y Dias 
 *  (Devuelve un objeto de la clase Period) 
 *  Años, Meses o Días).
Algo tipico es que devuelve esta cantidad de forma “repartida” 
es decir si pasaron 13 meses te devolvera 1 año y 1 mes 
(Necesario los gets para obtener el desglose completo) 
(no recomendable para exactitud)
 Para obtener una parte concreta usas Period.get() + 
  //Lo que quieras obtener
 */
int t = (int)ChronoUnit.DAYS.between(c, d); 
/*
 * Diferencia total en una unidad (días). 
(Devuelve long y es aplicable para otras unidades de tiempo) 
Es exacto
 */
c.lengthOfMonth(); //Devuelve cuantos días tiene ese mes (Devuelve int)
Duration zoo =  Duration.between(c, d);
/*
 * Devuelve la diferencia entre horas,minutos,segundos
 * ,nanos entre una fecha y otra y devuelve un objeto 
 * de tipo duration Si quieres obtener las partes por 
 * separado usas Duration.to para hacer casting a todo el
 *  objeto usando el objeto resultante y obtener el dato que 
 *  quieras. Es estático EL MÉTODO para crear la duración  
 *  por lo que usas el 
 * nombre del objeto Es exacto para los datos que permite
 */
/*
 * Es importante mencionar que los métodos
 *  de Period Chronounit y Duration pueden devolver 
 *  negativos en caso de que el primer paramétro que
 *  se le pase en el between sea posterior en el tiempo al
 *  segundo paramétro esto es debido a que todos estos 
 *  métodos hacen internatmente t2-t1 para devolverte 
 *  el resultado.
 */

	}

}
