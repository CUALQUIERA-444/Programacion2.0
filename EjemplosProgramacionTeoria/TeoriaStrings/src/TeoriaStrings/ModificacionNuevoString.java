package TeoriaStrings;

public class ModificacionNuevoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String texto = "casa";
String resultado = texto.replace("a", "o");
/*
 * Crea una cadena nueva reemplazando
 *  el texto viejo por el nuevo para que su uso
 *   se vea realmente lo ideal es guardarlo dentro de una 
 *   variable (Devuelve String) (Case Sensitive)
Funciona con variables pero se ve algo más complicado
 */
texto.toUpperCase(); //Convierte toda la cadena a mayúsculas
//(Devuelve una cadena)
texto.toLowerCase(); //Convierte toda la cadena a minúsculas (Devuelve una cadena)
texto.trim(); //Elimina los espacios em blanco sobrantes al principio y al final de la cadena (Devuelve una cadena) 
//No borra espacios entre las propias palabras
	}
}
