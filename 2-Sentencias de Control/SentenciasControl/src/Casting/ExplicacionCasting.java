package Casting;

public class ExplicacionCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//El float utiliza menos decimales pero ocupa menos espacio (32 bits) 
	//Cast explicito cuando se pasa de mayor a menor (Se usa principalmente para el truncamiento) (Redondear)
	//Cast implicito cuando se pasa de menor a mayor 
	//Dividir numeros enteros equivale a un entero
	int a = 8;
	double b; 
	b = a;
	System.out.println("La var a:"+a);
	System.out.println("La var b:"+b);
	
	b=7.3;
	a=(int)b;
	System.out.println("La var a:"+a);
	System.out.println("La var b:"+b);
	}
}
