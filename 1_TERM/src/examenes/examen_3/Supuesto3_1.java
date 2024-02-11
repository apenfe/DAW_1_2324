/*
Escribe un programa en Java llamado Supuesto3_1 que muestre un menú el cual se repetirá continuamente hasta que el usuario seleccione la opción 0, para finalizar el programa. Las opciones que mostrará serán las siguientes:

1 - Solicitar datos
2 - Mostrar datos
3 - Ordenar ascendentemente
4 - Ordenar descendentemente
0 - Salir

Al pulsar la opción "1", el programa llamará a un método que pedirá al usuario una cantidad de textos a introducir, entre 5 y 15. En el caso de que la cantidad no fuera válida, deberá insistir hasta que el usuario indique una cantidad válida. Cuando indique la cantidad de textos que quiere, el programa deberá solicitar tantas cadenas de caracteres como cantidad haya indicado y devolver dicha colección de cadenas de caracteres al programa principal.

Al pulsar la opción "2", el programa deberá asegurarse de que se han introducido textos previamente y avisar al usuario en caso contrario. Si hay textos previamente introducidos, el programa llamará a un método que reciba dicha colección de cadenas de caracteres, y las mostrará separadas por el carácter coma y un espacio en blanco ", " a excepción del último elemento que no tendrá esta separación por su derecha.

Al pulsar la opción "3", el programa deberá asegurarse de que se han introducido textos previamente y avisar al usuario en caso contrario. Si hay textos previamente introducidos, el programa llamará a un método que reciba dicha colección de cadenas de caracteres, los ordenará de forma ascendente (alfabéticamente, de menor a mayor) y devolverá esa colección ordenada al programa principal.

Al pulsar la opción "4", el programa deberá asegurarse de que se han introducido textos previamente y avisar al usuario en caso contrario. Si hay textos previamente introducidos, el programa llamará a un método que reciba dicha colección de cadenas de caracteres, los ordenará de forma descendente (de mayor a menor, ordena alfabético inverso) y devolverá esa colección ordenada al programa principal.


/*
  Supuesto3_1.java
  Adrián Peñalver Fernández  
  11/12/2023
*/ 

package examenes.examen_3;
import java.util.Scanner;

public class Supuesto3_1{

    public static Scanner teclado= new Scanner(System.in);
    public static String[] textos = new String[0];

    public static void main(String[] args){

        boolean check =true;
        int opcion=0;

        while(true){

            System.out.println("---MENU---");
            System.out.println("1--- SOLICITAR DATOS");
            System.out.println("2--- MOSTRAR DATOS");
            System.out.println("3--- ORDENAR ASCENDENTEMENTE");
            System.out.println("4--- ORDENAR DESCENDENTEMENTE");
            System.out.println("0--- SALIR");

            System.out.print("Seleccione una opción: ");

            while(check){

                try{
                    opcion = Integer.parseInt(teclado.nextLine().trim());
                    check =false;
                }catch(Exception e){
                            System.out.println("ERROR-- INTRODUCE UN ENTERO");
                }

            }

            check =true;

            switch(opcion){

                case 1:

                    textos= pedirDatos();

                break;

                case 2:
                    
                    if(textos!=null){
                        mostrarTextos(textos);
                    }else{
                        System.out.println("Primeros debe introducir los datos");
                    }

                break;

                case 3:

                     if(textos!=null){
                        mostrarTextos(ordenarAscendente(textos));
                    }else{
                        System.out.println("Primeros debe introducir los datos");
                    }

                break;

                case 4:

                     if(textos!=null){
                        mostrarTextos(ordenarDescendente(textos));
                    }else{
                        System.out.println("Primeros debe introducir los datos");
                    }

                break;

                case 0:

                    System.out.println("Fin del programa.");
                    return;
               
                default:

                    System.out.println("Debe elegir una opcion entre 0 y 4.");


            }
    
        
        }

    }

    public static String[] pedirDatos(){

            boolean check=true;
            int cantidad=0;

            while(cantidad<5||cantidad>15){

                 System.out.print("Seleccione una cantidad de textos entre 5 y 15: ");

                while(check){

                    try{
                        cantidad = Integer.parseInt(teclado.nextLine().trim());
                        check =false;
                    }catch(Exception e){
                                System.out.println("ERROR-- INTRODUCE UN ENTERO");
                    }

                }

                check=false;

                 if(cantidad<5||cantidad>15){
                    System.out.println("El valor debe estar entre 5 y 15");
                    }

            }

          String []resul= new String[cantidad];

           for(int i=0; i<resul.length; i++){
            System.out.print("Introduce el texto nº "+(i+1)+": ");
            resul[i]=teclado.nextLine();
           }
        
        return resul;
    }


    public static void mostrarTextos(String[] textos){

           for(int i=0; i<textos.length; i++){

                if(i==textos.length-1){

                    System.out.print(textos[i]);
 
                }else{

                    System.out.print(textos[i]+", ");

                }
           
           }

    }

    public static String[] ordenarAscendente(String[] textos){

            String aux="";

           for(int i=1; i<textos.length; i++){

                for(int j=0; j<textos.length-i; j++){

                    if(textos[j].trim().compareToIgnoreCase(textos[j+1])>0){

                        aux=textos[j];
                        textos[j]=textos[j+1];
                        textos[j+1]=aux;

                    }
                }
           }

        return textos;

    }

    public static String[] ordenarDescendente(String[] textos){

            String aux="";

           for(int i=1; i<textos.length; i++){

                for(int j=0; j<textos.length-i; j++){

                    if(textos[j].trim().compareToIgnoreCase(textos[j+1])<0){

                        aux=textos[j];
                        textos[j]=textos[j+1];
                        textos[j+1]=aux;

                    }
           
                }

           }

        return textos;

    }

}
