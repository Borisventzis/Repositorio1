import java.util.*;
public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		Jaula basedatos = new Jaula();
		
		while (true) {
			
			
			String boton= Test.opcion(entrada, "Option?");
			
			if(boton.equals("Add")){
				Test.add(entrada, basedatos);
			}else if (boton.equals("Observation")){
				
			}else if (boton.equals("Show")) {
				
			}else if (boton.equals("Statistics")) {
				
			}else {
				System.out.println("El comando no es valido");
			}
		}
		
	}

	
	
	
}
