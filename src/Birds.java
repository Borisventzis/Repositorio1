import java.util.ArrayList;

public class Birds {
//Fields----------------------------------------
	
	private String Name="";
	private String LatinName="";
	private String Observation;
	
	
	//Constructores----------------------------------
	public Birds() {
		
	}
	
	public Birds(String Name) {
		this.Name=Name;
	}
	public Birds(String name, String LatinName) {
		this.Name = name;
		this.LatinName = LatinName;
	}
	public Birds(String name, String latinName, String observation) {
		super();
		Name = name;
		LatinName = latinName;
		Observation = observation;
	}
	//Getters and Setters---------------------------------------------
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getObservation() {
		return Observation;
	}
	public void setObservation(String observation) {
		Observation = observation;
	}
	public String getLatinName() {
		return LatinName;
	}

	public void setLatinName(String latinName) {
		LatinName = latinName;
	}

	
	
//To string ---------------------------------------------
	
	@Override
	public String toString() {
		return "Birds [Name=" + Name + ", LatinName=" + LatinName + "]";
	}
	


	//metodos------------------------------------------------
	
	
	
	
	
	
	
	
}
