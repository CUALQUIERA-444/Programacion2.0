package ejemplos;

public class EjString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String uno = "Estoy probando String";
	String dos = "   Otro  ";
	int num;
	
	num = uno.length();
	System.out.println("Longitud:"+num);
	
	if(uno.equals(dos)) 
		System.out.println("Son iguales");
	else {
		System.out.println("Son distintas");
	}
	System.out.println(uno.compareTo(dos));
	
	System.out.println(dos.substring(1,2));
	for (int i = 0; i<uno.length();i++) {
		System.out.println(uno.charAt(i));
	}
	
	String resultado = uno.replace("r", "l");
	System.out.println(resultado);
	resultado = resultado.toUpperCase();
	System.out.println(resultado);
	System.out.println("dos antes de quitar los blancos:"+dos+".");
	System.out.println("dos despues de quitar los blancos:"+dos.trim()+".");
	int pos = uno.indexOf("ban");
	System.out.println(pos);
	}
}
