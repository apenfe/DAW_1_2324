package DOS1;

/* Practica Uno.
 * Escribe un programa simple que muestre, más o menos centrado, el patrón:
 *                                |\_/|
 *                               / @ @ \
 *                              ( > º < )
 *                               `»»x««´
 *                               /  O  \
 *
 * Nota: El carácter  \, no se puede mostrar directamente, se debe poner doble \\.
 *
 * Autor: Adrián Peñalver Fernández
 *
 * 02/10/23
 */

public class PracticaUno{

    public static void main(String [] args){

        String fila1="       _____,,;;;`;       ;';;;,,_____      ";
        String fila2="    ,~(  )  , )~~\\|       |/~~( ,  (  )~;   ";
        String fila3="    ' / / --`--,             .--'-- \\ \\ `   ";
        String fila4="    /  \\    | '             ` |    /  \\    ";
        

        String dibujo[][]={{" "," "," ","|","\\","_","/","|"," "," "," "},
                           {" "," ","/"," ","@"," ","@"," ","\\"," "," "},
                           {" ","("," "," ",">","*","<"," "," ",")"," "},           
                           {" "," ","`","»","»","x","«","«","´"," "," "},
                           {" "," "," ","/"," "," "," ","\\"," "," "," "}};

        System.out.println("Ejemplo de gato haciendo uso de Matriz: \n");

        for(int i=0; i<5; i++){
            for(int j=0; j<11; j++){
  
                System.out.print(dibujo[i][j]);
               
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("Otro ejemplo haciendo uso de String: \n");
        System.out.println(fila1);
        System.out.println(fila2);
        System.out.println(fila3);
        System.out.println(fila4);

    }
}
