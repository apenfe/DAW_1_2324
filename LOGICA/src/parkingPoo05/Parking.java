package parkingPoo05;

import java.util.ArrayList;

public class Parking{
	
	private ArrayList<String> matriculas;
	private String nombre;
	
	public Parking(String nombre, int plazas) {
		
		this.matriculas = new ArrayList<String>(plazas);
	
	    for (int i = 0; i < plazas; i++) {
	    	
	    	matriculas.add(null);
	    }
	    
		this.nombre = nombre;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void entrada(String matricula, int plaza) throws ParkingException{
		
		if(matricula.length()<4 || matricula==null) {
			throw new ParkingException("Matrícula incorrecta.",matricula);
		}
		
		if(matriculas.contains(matricula)) {
			throw new ParkingException("Matrícula repetida.",matricula);
		}
		
		if(plaza>=matriculas.size()||plaza<0) {
			throw new ParkingException("Plaza Inexistente.",matricula);	
		}
		
		if(matriculas.get(plaza)!=null) {
			throw new ParkingException("Plaza Ocupada.",matricula);
		}
		
			matriculas.set(plaza,matricula);
		
	}
	
	public int salida(String matricula) throws ParkingException {
		
		if(!matriculas.contains(matricula)) {
			throw new ParkingException("Matricula no existente.",matricula);
		}
			
			int index = matriculas.indexOf(matricula);
			matriculas.set(index,null);
			return index;

	}
	
	public int getPlazasTotales() {
		
		return matriculas.size();

	}
	
	public int getPlazasOcupadas() {
		
		int count=0;
		
		for(int i=0; i<matriculas.size();i++) {
			if(matriculas.get(i)==null) {
				
			}else {
				count++;
			}
		}
		
		return count;

	}
	
	public int getPlazasLibres() {
		
		return (getPlazasTotales()-getPlazasOcupadas());

	}
	
	public String toString() {
		
		String salida ="";
		
		salida+="\nParking "+nombre+"\n";
		salida+="----------------------\n";
		
		for(int i=0; i< getPlazasTotales();i++) {
			
			if(matriculas.get(i)==null) {
				
				salida+="Plaza "+i+": (Vacía)\n";
				
			}else {
				
				salida+="Plaza "+i+": "+matriculas.get(i)+"\n";

			}
			
		}
		
		return salida;

	}
	
	
}