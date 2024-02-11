package superHeroesPoo01;

public class figura{
	
	private String codigo;
	private double precio;
	private superHeroe superheroe;
	private dimension dimensiones;
	
	public figura(String codigo, double precio, superHeroe superheroe, dimension dimensiones) {
		
		this.codigo=codigo;
		this.precio=precio;
		this.superheroe=superheroe;
		this.dimensiones=dimensiones;
		
	}
	
	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public superHeroe getSuperheroe() {
		return superheroe;
	}

	public void setSuperheroe(superHeroe superheroe) {
		this.superheroe = superheroe;
	}

	public dimension getDimensiones() {
		return dimensiones;
	}



	public void setDimensiones(dimension dimensiones) {
		this.dimensiones = dimensiones;
	}


	public String toString() {
		
		String cadena="";
		cadena+="Código: "+getCodigo()+".\n";
		cadena+="Precio: "+getPrecio()+" €.\n";
		cadena+="\n\tSUPERHEROE: "+superheroe.toString()+".\n";
		cadena+="\n\tTAMAÑO: "+dimensiones.toString()+".\n";
		
		return cadena;

	}
	
	public void subirPrecio(double subida) {
		
		this.precio+=subida;

	}

}