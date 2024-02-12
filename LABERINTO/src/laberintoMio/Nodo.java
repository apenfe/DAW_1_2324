package laberintoMio;

public class Nodo{

	private Casilla posicion;
	private Casilla arriba;
	private Casilla abajo;
	private Casilla derecha;
	private Casilla izquierda;
	
	public Nodo(Casilla actual, Casilla arriba, Casilla derecha, Casilla abajo, Casilla izquierda) {
		
		this.posicion=actual;
		this.arriba=arriba;
		this.derecha=derecha;
		this.abajo=abajo;
		this.izquierda=izquierda;
		
	}

	

	public Casilla getArriba() {
		return arriba;
	}



	public void setArriba(Casilla arriba) {
		this.arriba = arriba;
	}



	public Casilla getAbajo() {
		return abajo;
	}



	public void setAbajo(Casilla abajo) {
		this.abajo = abajo;
	}



	public Casilla getDerecha() {
		return derecha;
	}



	public void setDerecha(Casilla derecha) {
		this.derecha = derecha;
	}



	public Casilla getIzquierda() {
		return izquierda;
	}



	public void setIzquierda(Casilla izquierda) {
		this.izquierda = izquierda;
	}



	public Casilla getPosicion() {
		return posicion;
	}

	public void setPosicion(Casilla posicion) {
		this.posicion = posicion;
	}
	
	public boolean iguales(Nodo a) {
		
		if(posicion.getFila()==a.getPosicion().getFila()&&posicion.getColumna()==a.getPosicion().getColumna()) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean iguales(Casilla a) {
		
		if(posicion.getFila()==a.getFila()&&posicion.getColumna()==a.getColumna()) {
			return true;
		}else {
			return false;
		}
		
	}




	@Override
	public String toString() {
		return "Nodo [posicion=" + posicion + ", arriba=" + arriba.getCheck() + ", derecha=" + derecha.getCheck()+", abajo=" + abajo.getCheck() + ", izquierda=" + izquierda.getCheck() + "]";
	}

	

	
}