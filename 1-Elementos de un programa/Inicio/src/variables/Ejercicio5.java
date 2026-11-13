package variables;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		num += 1 ; //Acumula el numero previo sumandole 1
		num++; //Es lo mismo que lo anterior
		//++num; No se usa mucho
		//a = b++ Asigna a la a y cambia el valor de b
		// a = ++b Cambia el valor de b y asigna dicho valor a A
		int resto=num%2;
		System.out.println(num);
		System.out.println(resto);
		boolean par= (resto==0);
	}

}
