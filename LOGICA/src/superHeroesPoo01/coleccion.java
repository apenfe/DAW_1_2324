package superHeroesPoo01;

import java.util.ArrayList;

public class coleccion{
	
	private String nombreColeccion;
	private ArrayList<figura> listaFiguras;
	
	public coleccion(String nombreColeccion) {
		
		this.nombreColeccion=nombreColeccion;
		this.listaFiguras = new ArrayList<figura>();
		
	}

	public String getNombreColeccion() {
		return nombreColeccion;
	}

	public void setNombreColeccion(String nombreColeccion) {
		this.nombreColeccion = nombreColeccion;
	}

	public void anadirFigura(figura fig) {
		
		this.listaFiguras.add(fig);
	}
	
	public void subirPrecio(double cantidad, String id) {
		//una cantidad de dinero y el identificador de una de las figuras de la
		//colección. El método subirá el precio de dicha figura en la cantidad pasada
		//como parámetro
		
		for(int i=0; i<listaFiguras.size();i++) {
			
			if(id.equalsIgnoreCase(listaFiguras.get(i).getCodigo())) {
				
				listaFiguras.get(i).subirPrecio(cantidad);
				
			}else {
				continue;
			}
			
		}
		
	}
	
	public String toString() {
		/*
		 * Programe el método toString, de forma que devuelva una cadena con el
listado de todas las figuras de la colección con todas las características de
cada uno.
		 */
		String info = "";
		
		for(int i=0; i<listaFiguras.size();i++) {
				
			info+=listaFiguras.get(i).toString();
				
		}
		
		return info;
		
	}
	
	public String conCapa() {
		/*
		 * Programe un método conCapa() que devuelva una cadena con el listado
de aquellas figuras de la colección que tengan capa.

		 */
		
		String info = "Figuras de la colección con capa:\n\n";
		
		for(int i=0; i<listaFiguras.size();i++) {
			
			if(listaFiguras.get(i).getSuperheroe().getCapa()) {
				info+="--> "+listaFiguras.get(i).getSuperheroe().getNombre()+"\n";
			}
				
		}
		
		return info;
		
	}
	
	public figura masValioso() {
		/*
		 * Programe un método masValioso() que devuelva la figura que tenga el
precio mayor de la colección.
		 */
		double preciomax=0;
		figura max=null;
		
		System.out.println("La figura más valiosa de la coleccion es:");
		
		for(int i=0; i<listaFiguras.size();i++) {
			
			if(listaFiguras.get(i).getPrecio()>preciomax) {
				preciomax=listaFiguras.get(i).getPrecio();
				max=listaFiguras.get(i);
			}
				
		}
		
		return max;
		
	}
	
	public double getValorColeccion() {
		/*
		 * devuelva un double con el
precio total de la colección (es la suma de los precios de cada figura de la
colección)
		 */
		double preciomax=0;
		
		System.out.println("El valor total de la coleccion es:");
		
		for(int i=0; i<listaFiguras.size();i++) {
			
			preciomax+=listaFiguras.get(i).getPrecio();
				
		}
		
		return preciomax;
		
	}
	
	public double getVolumenColeccion() {
		/*
		 * que devuelva un double con
el volumen aproximado que ocuparía toda la colección de figuras. Para
hacer este cálculo se deben sumar los volúmenes de cada figura, y
añadirle al resultado el valor 200.
		 */
		System.out.println("El volumen total de la coleccion es:");
		
		double volmax=200;
		
		for(int i=0; i<listaFiguras.size();i++) {
			
			volmax+=listaFiguras.get(i).getDimensiones().getVolumen();
				
		}
		
		return volmax;
		
	}

}