
package PracticaPoo_2022;
import java.util.*;
public class E_1 {
	
//	

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		String marca,modelo,color;
		float precioCompra;
		int anoFabric;
	
		Vehiculo bmw = new Vehiculo();
		Vehiculo maserati = new Vehiculo("as","600","G",23000,1975);
		Vehiculo audi = new Vehiculo(maserati);
		
		System.out.println("Introduce valor");
		marca=entrada.next();
		bmw.setMarca(marca);
		
		System.out.println("Introduce valor");
		modelo=entrada.next();
		bmw.setModelo(modelo);
		
		System.out.println("Introduce valor");
		color=entrada.next();
		bmw.setColor(color);
		
		System.out.println("Introduce valor");
		precioCompra=entrada.nextFloat();
		bmw.setPrecioCompra(precioCompra);
		
		System.out.println("Introduce valor");
		anoFabric=entrada.nextInt();
		bmw.setAnoFabric(anoFabric);
		
		
	System.out.println("valor BMW");
//	System.out.println(bmw.getMarca());
//	System.out.println(bmw.getModelo());
//	System.out.println(bmw.getColor());
//	System.out.println(bmw.getAnoFabric());
//	System.out.println(bmw.getPrecioCompra());
	bmw.mostrar();
	System.out.println("valor Maserati");
//	System.out.println(maserati.getMarca());
//	System.out.println(maserati.getModelo());
//	System.out.println(maserati.getColor());
//	System.out.println(maserati.getAnoFabric());
//	System.out.println(maserati.getPrecioCompra());
	maserati.mostrar();
	System.out.println("valores Audi (contructor copia)");
//	System.out.println(audi.getMarca());
//	System.out.println(audi.getModelo());
//	System.out.println(audi.getColor());
//	System.out.println(audi.getAnoFabric());
//	System.out.println(audi.getPrecioCompra());	
	audi.mostrar();
		
	  
	 
	   
	

}
}