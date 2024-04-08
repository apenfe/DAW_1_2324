package ejercicio_3;

public class Alarma{
	
	private double umbral;
	private Sensor sensor;
	private Timbre timbre;
	
	public Alarma(double umbral) {
		
		this.umbral = umbral;
		this.sensor = new Sensor();
		this.timbre = new Timbre();
		
	}
	
	public boolean comprobar() {
		
		if(sensor.getValorActual()>=this.umbral) {
			
			timbre.activar();
			return true;
			
		}else {
			
			timbre.desactivar();
			return false;
		}
		
	}
	
}