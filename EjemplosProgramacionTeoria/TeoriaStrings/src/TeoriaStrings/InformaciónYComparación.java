package TeoriaStrings;

public class InformaciónYComparación {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String cualquiera = "cualquiera";
cualquiera.length(); //Calcula la longitud de una cadena (Devuelve int)
cualquiera.equals("Cualquiera"); //Compara si el contenido de dos cadenas es exactamente igual
//(Devuelve booleano)
String regex;
cualquiera.compareTo("hola");
/*
 * Compara lexicográficamente (lexicográficamente se refiere a orden de diccionario pero en ASCII (Tipo A = a?) 
 * NO por lo que resta 65-97 el que va primero es el objeto que esta llamando - el llamado)
Devuelve 0 si son iguales un número positivo si la cadena es mayor que “hola” o negativo si es menor 
 (SIEMPRE DEVUELVE UN INT) (Case sensitive)  
 */
cualquiera.compareToIgnoreCase("hola"); //Lo mismo que el compareto pero ignora mayusculas y minusculas
cualquiera.equalsIgnoreCase("hola"); //Lo mismo que el equals pero ignorando mayusculas y minusculas
cualquiera.startsWith("Ho"); //Retorna true si la cadena comienza con el texto indicado (Devuelve booleano) (Case sensitive)
cualquiera.endsWith("la"); //Retorna true si la cadena termina con el texto indicado (Devuelve boolean) (Case sensitive)

//Expresiones regulares
/*
 * n+ Uno o o más veces “a+”
n* Cero o más veces “a*”
n{x} Exactamente x veces“a{3}”
n? Una o ninguna “a?”
n{x,y} n aparece un minimo de x veces y un maximo de y veces (acepta más de un dígito las llaves) a{1,5} 
n{x,} N aparece como mínimo x veces (acepta más de un digito las llaves) 7{3,} 
^ Comienzo de línea El string empieza así “^Hola*”
$Fin de línea “*Adiós$”
\d Un dígito (0-9) “\d{2}”
\s Espacio en blanco
[abc] Cualquiera de esos tres“[abc]”
[^abc] Cualquier cosa MENOS esos tres“[^abc]”
[a-z] Rango de minúsculas “[a-z]+”
[A-Z] Rango de mayúsculas “[A-Z]{1}”
[0-9] Rango de números (Solo por dígito) “[0-5]”
[a-zA-Z] Rango de minusculas y mayusculas “[a-zA-Z]{3,}”
. Cualquier caracter (Si se pone solo) Si se pone doble barra se interpreta como punto ordinario Si es una barra habrá error de compilación  “\\.”  “.{2,10}”
 */
cualquiera.matches("^[A-Z].*$"); //Comprueba si la cadena se ajusta a un patrón de busqueda o expresión regular

	}
}
