package laberintoMio;

import java.util.ArrayList;

public class Pasillo{
	
	private ArrayList<Casilla> pasillo = new ArrayList<Casilla>();
	
	public Pasillo(Casilla inicial) {
		pasillo.add(inicial);
	}

	

	public ArrayList<Casilla> getPasillo() {
		return pasillo;
	}



	public void setPasillo(ArrayList<Casilla> pasillo) {
		this.pasillo = pasillo;
	}



	@Override
	public String toString() {
		return "Pasillo [pasillo=" + pasillo + "]";
	}
	
	
	
	
	
}