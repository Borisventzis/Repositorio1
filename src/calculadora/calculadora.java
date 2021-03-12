package calculadora;

import java.util.Scanner;

public class calculadora {
	
	public static double a=0; 
	public static double b=0;
	public static double r=0;
	public static Scanner tecla = new Scanner(System.in);
	
	public static void resta() {
		System.out.println("Ha seleccionado Restar");
		System.out.println("Ingrese el primer valor");
		a=tecla.nextInt();
		System.out.println("Ingrese el segundo valor");
		b=tecla.nextInt();
		r=a-b;
		System.out.println(a+"-"+b+"="+r);
		
	}
	public static void suma() {
		// TODO Auto-generated method stub
		System.out.println("Ha seleccionado Sumar");
		System.out.println("Ingrese el primer valor");
		a=tecla.nextInt();
		System.out.println("Ingrese el segundo valor");
		b=tecla.nextInt();
		r=a+b;
		System.out.println(a+"+"+b+"="+r);
		
	}
	
	public static void multiplica() {
		System.out.println("Ha seleccionado Multiplicar");
		System.out.println("Ingrese el primer valor");
		a=tecla.nextInt();
		System.out.println("Ingrese el segundo valor");
		b=tecla.nextInt();
		r=a*b;
		System.out.println(a+"*"+b+"="+r);
		
	}
	public static void divide() {
		System.out.println("Ha seleccionado Dividir");
		System.out.println("Ingrese el primer valor");
		a=tecla.nextInt();
		System.out.println("Ingrese el segundo valor");
		b=tecla.nextInt();
		r=a/b;
		System.out.println(a+"/"+b+"="+r);
		
	}
	
	public static void rcuadrada() {
		System.out.println("Ha seleccionado Raiz Cuadrada");
		System.out.println("Ingrese el primer valor");
		a=tecla.nextInt();
		System.out.println("Ingrese el segundo valor");
		b=tecla.nextInt();
		r=Math.sqrt(a);
		System.out.println("La Raiz de "+a+" es ="+r);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Desarrollado por EGR
		
		try (
		Scanner tecla = new Scanner(System.in)) {
			
			String sel=null;
			System.out.println("Seleccione su Operación");
			System.out.println("+: Suma");
			System.out.println("-: Resta");
			System.out.println("*: Multiplicación");
			System.out.println("/: División");
			System.out.println("s: Raíz Cuadrada");
			System.out.println("c: Raíz Cúbica");
			System.out.println("q: Salir");
			
		
			
			sel=tecla.next();
			switch(sel) {
			case "+":
				suma();
				break;
				
			case "-":
			    /*System.out.println("Seleccionó Restar");
				System.out.println("Ingrese el primer valor");
				a=tecla.nextInt();
				System.out.println("Ingrese el segundo valor");
				b=tecla.nextInt();
				r=a-b;
				System.out.println(a+"-"+b+"="+r);*/
				
				resta();
				break;
				+
			case "*":
				/*System.out.println("Seleccionó Multiplicar");
				System.out.println("Ingrese el primer valor");
				a=tecla.nextInt();
				System.out.println("Ingrese el segundo valor");
				b=tecla.nextInt();
				r=a*b;
				System.out.println(a+"*"+b+"="+r);*/
				multiplica();
				break;
				
				
			case "/":
				/*System.out.println("Seleccionó Dividir");
				System.out.println("Ingrese el primer valor");
				a=tecla.nextInt();
				System.out.println("Ingrese el segundo valor");
				b=tecla.nextInt();
				r=a/b;
				System.out.println(a+"/"+b+"="+r);*/
				divide();
				break;
				
			case "s":
				/*System.out.println("Seleccionó Raíz Cuadrada");
				System.out.println("Ingrese el valor");
				a=tecla.nextInt();
				r=Math.sqrt(a);
				System.out.println("La Raíz de "+a+" es ="+r);*/
				rcuadrada();
				break;	
				
			case "c":
				/*System.out.println("Seleccionó Raíz Cúbica");
				System.out.println("Ingrese el valor");
				a=tecla.nextInt();
				r=Math.cbrt(a);
				System.out.println("La Raíz de "+a+" es ="+r);*/
				
				break;	
				
			case "q":
				System.out.println("Seleccionó salir del sistema");
				System.out.println("Adiós");
				break;	
				
			default:
				System.out.println("Acción no soportada");
				
				
				
				
}
			
			
		}
		
	}

	
}
