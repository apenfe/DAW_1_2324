package EJEMPLOS3.excepciones;

public class Excepcion02{

    public static void main(String[] args){

        String[] textos ={"Primer texto","Que tal", "Muy buenas"};

        for(int i=-1; i<=3; i++){
        
            try{

                System.out.println(textos[i]);

            }catch(Exception e){

                System.out.println("Error: "+e.getMessage());

            }
      
        }

    }

}


