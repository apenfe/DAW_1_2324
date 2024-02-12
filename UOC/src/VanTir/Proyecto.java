package VanTir;

public class Proyecto{
	
	private double inversionInicial;
	private int numAnios;
	private double[] cobros;
	private double interesEsperado;
	
	public Proyecto(double inversionInicial, int numAnios, double interesEsperado) {
		
		this.inversionInicial=inversionInicial;
		this.numAnios=numAnios;
		this.interesEsperado=interesEsperado;
		this.cobros=new double[numAnios];
		
		for(int i=0; i<numAnios; i++) {
			
			double cobro = Entrada.pedirDouble("\tCobro año "+(i+1)+": ",true);
			cobros[i]=cobro;	
		}
		
	}

	public double getInversionInicial() {
		return inversionInicial;
	}

	public void setInversionInicial(double inversionInicial) {
		this.inversionInicial = inversionInicial;
	}

	public int getNumAnios() {
		return numAnios;
	}

	public void setNumAnios(int numAnios) {
		this.numAnios = numAnios;
	}

	public double[] getCobros() {
		return cobros;
	}

	public void setCobros(double[] cobros) {
		this.cobros = cobros;
	}

	public double getInteresEsperado() {
		return interesEsperado;
	}

	public void setInteresEsperado(double interesEsperado) {
		this.interesEsperado = interesEsperado;
	}
	
}