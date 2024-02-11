package EJEMPLOS3.excepciones;

public class Excepcion01{

    public static void main(String[] args){

        String[] textos ={"Primer texto","Que tal", "Muy buenas"};

        for(int i=-1; i<=3; i++){
        
            try{ // instrucciones suceptibles de fallo

                System.out.println(textos[i]);

            }catch(Exception e){ // instrucciones en caso de fallo

                System.out.println("Indice incorrecto: "+i);

            }
      
        }

    }

}


