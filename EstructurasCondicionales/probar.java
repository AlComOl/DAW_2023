package EstructurasCondicionales;
/*******************************************************************************************************************

Autor: Álvaro Comenge

Fecha:14/10/23

Descripción:

	Acepta 10 números enteros y muestra su suma.

*****************************************************************************************************************/
import java.util.*;
public class probar {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int n=0, aux=0;
		for(int i=0;i<10;i++) {
			System.out.println("Introduce un numero");
			
			n=entrada.nextInt();
			aux+=n;
			
		}
		System.err.println(aux);
	}

}
