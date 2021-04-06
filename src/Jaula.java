import java.util.ArrayList;

public class Jaula {

	private ArrayList<Birds> jaulapajaros;
	private int i;

	public Jaula() {
		this.jaulapajaros = new ArrayList<Birds>();
	}
	
	public ArrayList<Birds> getPajaros() {
		return jaulapajaros;
	}

	public void setPajaros(ArrayList<Birds> jaulapajaros) {
		this.jaulapajaros = jaulapajaros;
	}
	
	
	public void addToBird(Birds pajaro) {
		this.jaulapajaros.add(pajaro);
		System.out.println("Pajaro creado");
	}

	public Birds PajaroSeleccion(String Name, Jaula basedatos) {
		
	
	Birds pajaroseleccion = null;
	for (i = 0;i<basedatos.jaulapajaros.size();i++) {
		if(Name == basedatos.jaulapajaros.get(i).getName()) {
			pajaroseleccion = basedatos.jaulapajaros.get(i);
			System.out.println("Se ha encontrado el pajaro");
		} else {
			System.out.println("Pajaro no encontrado");
		}
	}
	
	return pajaroseleccion;
	}
}


