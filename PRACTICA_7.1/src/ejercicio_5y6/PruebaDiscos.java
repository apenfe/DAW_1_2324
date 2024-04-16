package ejercicio_5y6;

public class PruebaDiscos{
	
	public static void main(String[] args) {
		
		CdSoftware software = new CdSoftware("v1.1","Audisoft","farcry3",23000,true,false,"namco");
		System.out.println(software.toString());
		
		CdDatos datos = new CdDatos(8, 20000, 80000, true, false, "sony");
		System.out.println(datos.toString());
		
		CdAudio audio = new CdAudio("2008","fiesta","manolo escobar", 23000, true, false, "sony");
		System.out.println(audio.toString());
		
	}
	
}