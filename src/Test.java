import java.util.*;
public class Test {


	
	public static void add(Scanner entrada,Jaula basedatos) {
		System.out.println("Introduzca el nombre del pajaro");
		String Name = entrada.nextLine();
		System.out.println("Introduzca observaciones");
		String LatinName = entrada.nextLine();
		Birds pajaro = new Birds(Name,LatinName);
		basedatos.addToBird(pajaro);
	}

	public static String opcion(Scanner entrada, String opcion) {
		System.out.println("Introduzca la opcion que desea");
		opcion = entrada.nextLine();
		return opcion;
	}
	
	public static void observacion(Scanner entrada, Jaula basedatos) {
		System.out.println("Sobre que pajaro quiere hacer la observacion");
		String pajaroelegido= entrada.nextLine();
		basedatos.PajaroSeleccion(pajaroelegido, basedatos);
		System.out.println("");
		
	}
}
