
public class Ejemplo2{
	
	public static void main(String[] args) {
		
		int[] numeros = {4,2,3,4,5};
		
		listarNumeros(numeros);
		ordenarNumeros(numeros,true);
		listarNumeros(numeros);
		ordenarNumeros(numeros,false);
		listarNumeros(numeros);
		
	}
	
	public static void listarNumeros(int[] numeros) {
		
		System.out.println("Numeros: ");
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.print(numeros[i]);
			
		}
		
		System.out.println();
		
	}
	
	public static int[] ordenarNumeros(int[] numeros, boolean ascendente) {
		
		for (int i = 1; i < numeros.length; i++) {
			
			for (int j = 0; j < numeros.length-i; j++) {
				
				if((ascendente)&&numeros[j]>numeros[j+1]||!(ascendente)&&numeros[j]<numeros[j+1]) {
					
					int aux = numeros[j];
					numeros[j]=numeros[j+1];
					numeros[j+1]=aux;
					
				}
				
			}
			
		}
		
		return numeros;
		
	}
	
}