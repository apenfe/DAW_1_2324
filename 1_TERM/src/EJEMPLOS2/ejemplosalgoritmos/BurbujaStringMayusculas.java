package EJEMPLOS2.ejemplosalgoritmos;

public class BurbujaStringMayusculas{
    public static void main(String[] args){
    
      String texto[]={"hola","adios","Ciao","Besos","te escucho","wenas noches","se puede?"};
        String aux;

        for(int i=1 ; i<(texto.length) ; i++){ //burbuja normal
                    
            for(int j=0 ; j<(texto.length)-i;j++){
        
                if(texto[j].compareToIgnoreCase(texto[j+1]) > 0){
                    aux=texto[j+1];
                    texto[j+1]=texto[j];
                    texto[j]=aux; 
                }
            }
        }
        
        for(int i=0; i<(texto.length);i++){
            System.out.print(texto[i]+" ");
        }

        System.out.println();
    }
}
