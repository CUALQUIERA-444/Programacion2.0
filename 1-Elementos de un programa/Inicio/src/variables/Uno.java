package variables;

public class Uno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Los comentarios en java son dos lineas oblicuas comentan toda la línea
		int numero1 = 7; //Declaración de variable entera
		int numero2, sumaTotal;
		final int miconstante = 15; //Variables constantes que no pueden cambiar de valor
		double producto,numero3 = 23,division; //Admite enteros y decimales
		char letra='A'; //La inicializacion debe estar entre comillas simples (SOLO SE PUEDE GUARDAR UNA)
		//int long; No puedes declarar con nombres de tipos de dato
		//Diferencia entre el int y el double (Rango de numeros mas grande debido al espacio de memoria empleado)
		numero2=4;
		numero1=10;
		sumaTotal = numero1 + numero2; //Coge el valor y lo mete 
		System.out.println("Valor de a:"+numero1);
		System.out.println("Valor de b:"+numero2);
		System.out.println("La suma es:"+sumaTotal);
		producto = numero1 * numero3;
		division = numero1/numero2; //Si los dos numeros son enteros, el resultado es entero
		System.out.println("El producto es: "+producto);
		System.out.println("La división es: "+division);
		System.out.println("La letra es:"+letra);
		//test 
		double testA = 7.0;
		double testB = 3.0;
		double testresul = testA / testB;
		System.out.println(testresul);
		//Los boleeanos son variables que solo almacenan 2 valores verdadero o falso 
		boolean familiaNumerosa=true;
		
		//\t tabulador 
		//\n Salto de línea
	}
}
