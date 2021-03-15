package gmail;

import java.util.Scanner;

public class gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int posicion;
		String cambiocorreo= "@hotmail.net";;
		String correo;
		String nombre;
		
		
		System.out.println("Introduce tu email");
		
		Scanner entrada = new Scanner(System.in);
		correo = entrada.nextLine();
		posicion = correo.indexOf("@");
		nombre = correo.substring(0, posicion);
		System.out.println(nombre+cambiocorreo);
		
	}

}
