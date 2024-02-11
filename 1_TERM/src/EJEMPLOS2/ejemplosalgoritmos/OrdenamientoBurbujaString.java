package EJEMPLOS2.ejemplosalgoritmos;

public class OrdenamientoBurbujaString{ //cuidado esta mal
    public static void main(String[] args){
    
        String texto[]={"h","as","ci","be","te","we","se"};
        String aux;
        

        for(int i=1 ; i<(texto.length) ; i++){ //burbuja normal
                    
            for(int j=0 ; j<(texto.length)-i;j++){

               int longitud = texto[j].length();

                if(texto[j+1].length()< longitud){
                    longitud= texto[j+1].length();
                }

                for(int k=0; k < longitud; k++){
                    
                     if(texto[j].charAt(k) < texto[j+1].charAt(k)){
                        aux=texto[j+1];
                        texto[j+1]=texto[j];
                        texto[j]=aux; 
                     break; 
                      }
                               
                }
            }
        }
        
        for(int i=0; i<(texto.length);i++){
            System.out.print(texto[i]+" ");
        }

        System.out.println();
    }
}
