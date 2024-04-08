package ejercicio_4;

import ejercicio_3.*;

public class AlarmaLuminosa extends Alarma{
	
	private Bombilla bombilla;
	
	public AlarmaLuminosa(double umbral) {
		
		super(umbral);
		this.bombilla = new Bombilla();
		
	}
	
	public boolean comprobar() {
		
		if(super.comprobar()) {
			this.bombilla.activar();
			return true;
		}else {
			this.bombilla.desactivar();
			return false;
		}
		
	}
	
}