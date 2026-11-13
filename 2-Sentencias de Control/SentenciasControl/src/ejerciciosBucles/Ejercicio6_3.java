package ejerciciosBucles;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 3. En una empresa de fruta se seleccionan fresas en 3 categorías dependiendo de su calibre:
A (de 1 a 3 cm), B (de 3 a 5 cm), C(más de 5). Ir anotando el grosor de cada fresa hasta
anotar 0. Decir cuántas hay de cada categoría y si no ha habido fresas de alguna categoría.
 */
	Scanner sc = new Scanner(System.in);
	int cont_A = 0;
	int cont_B = 0;
	int cont_C = 0;
	double grosor;
	sc.useLocale(Locale.ENGLISH);
	do {
		System.out.println("Introduce el grosor de la fresa");
		grosor = sc.nextDouble();
		if (grosor < 0) {
			System.out.println("Error grosor no permitido");
		}
		else {
			if (grosor != 0) {
				//Se excluye lo ultimo
				if (grosor >= 1 && grosor < 3) {
					cont_A++;
				}
				else if (grosor >= 3 && grosor < 5 ) {
					cont_B++;
				}
				else if (grosor >= 5) { //0.4 Entraria sin la condicion y no queremos eso 
					cont_C++;
				}
			}
		}
	} while (grosor !=0);
	System.out.println("Grosores Categoria A "+cont_A);
	System.out.println("Grosores Categoria B "+cont_B);
	System.out.println("Grosores Categoria C "+cont_C);
	
	//Si no ha habido fresas de alguna categoria 
	if (cont_A == 0 || cont_B == 0 || cont_C == 0) {
		System.out.println("Hay categorias sin fresas");
	}
	else {
		System.out.println("Hay fresas en todas las categorias");
	}
	}
}
