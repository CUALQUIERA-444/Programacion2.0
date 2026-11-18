package TeoriaStrings;

public class ExtracciónBusqueda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String cualquiera = "cualquiera";
cualquiera.charAt(0); 
/*
 * Retorna el carácter situado en esa posición especifica 
 * (empezando desde 0) (Devuelve un char) 
 * Si no encuentra la posicion devuelve una excepcion
 */
cualquiera.indexOf(cualquiera,0);
/*
 * Busca un texto dentro de otro a partir de un índice. 
 * Retorna la posición encontrada o 
 * -1 si hay un error (Devuelve int)  
 * SOLO DEVUELVE LA PRIMERA SIMILITUD QUE ENCUENTRA
 */
cualquiera.substring(1, 3);
/*
 * Obtiene una parte de la cadena entre la posicion inicial y la final (-1) Si solo se pone un parámetro, corta hasta el final 
 * (Devuelve un objeto de tipo String o String mejor dicho)
 */
	}

}
