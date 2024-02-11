package TRES3;

/* OK
 * 
 * Ejercicio05.java
 *
 * Escribe un método llamado contarCaracteresPalabrasLineas() que reciba un texto como parámetro y devuelva como
 * resultado un código que codifique, de alguna manera, la siguiente información:
 *      El número de caracteres.
 *      El número de palabras.
 *      El número de líneas.
 *
 * El diseño y estructura del código es libre a condición de que sirva para el fin requerido. A modo de 
 * sugerencia se puede utilizar un String con el formato: cccc-pppp-llll Para el texto de ejemplo:
 * "Hoy es   lunes\n y mañana \tmartes" produciría el código: "0023-0006-0002"
 *
 * Se supone que una palabra está separada de otra por uno o más espacios en blanco, caracteres de tabulación o
 * caracteres de nueva línea.
 * Prueba el método pedido desde main() utilizando un método llamado interpretarCodigo() para mostrar el resultado
 * del método anterior.
 * El método interpretarCodigo() recibe dos argumentos: un código producido por contarCaracteresPalabrasLineas()
 * y un número que indica qué información se quiere extraer:
 *      1 para el total de caracteres
 *      2 para el total de palabras
 *      3 para el total de líneas
 * Prueba exhaustivamente los métodos pedidos desde main().
 *
 * Adrián Peñalver Fernández
 *
 * 19/11/2023
 *
 */

import java.util.Scanner;

public class Ejercicio05{

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String [] args){

        int opcion=0;
        boolean check= true;
       
        System.out.print("\nIntroduzca el texto a codificar: ");
        String texto = teclado.nextLine();

        do{

            System.out.println("\n\t¿Que opción desea realizar?\n");
            System.out.println("\t1 - Total de caracteres.");
            System.out.println("\t2 - Total de palabras.");
            System.out.println("\t3 - Total de lineas.");
            System.out.println("\t4 - Salir");
            System.out.print("\n\tOpción: ");

             do{
                  
                    try{
                        opcion = Integer.parseInt(teclado.nextLine().trim());  
                        check =false;
                    }catch(Exception e){
                        System.out.print("\nERROR --- > Introduzca un dato válido. (ENTERO DEL 1 AL 4): ");
                    }

            }while(check); 
            
            switch(opcion){

                case 1:

                    interpretarCodigo(contarCaracteresPalabrasLineas(texto),1);

                break;

                case 2:

                    interpretarCodigo(contarCaracteresPalabrasLineas(texto),2);

                break;

                case 3:
        
                    interpretarCodigo(contarCaracteresPalabrasLineas(texto),3);

                break;

                case 4:

                    System.out.println("\nFIN DEL PROGRAMA.\n");
                    return;

                default:

                    System.out.println("\nSELECCIONE UNA OPCIÓN VÁLIDA.\n");

            }
            
        }while(true);
    } 

    public static String contarCaracteresPalabrasLineas(String texto){

        String codigo = "";
        int cont = 0, numero=1,cifras=0;

            for(int i=0; i<texto.length(); i++){
                if(texto.charAt(i)==' '||texto.charAt(i)=='\t'||texto.charAt(i)=='\n'){
                    continue;
                }else{
                    cont++;
                }
            }

        numero=cont;

        while(numero>0){

            numero=numero/10;
            cifras++;

        }

        for(int i=1; i<=4-cifras ; i++){
            codigo+="0";   
        }
         codigo+=cont+"-";
         cont=1;
        cifras=0;

//---------------------------------------------------------------------

        for(int i=0; i<texto.length(); i++){

                if((texto.charAt(i)==' '&&texto.charAt(i-1)!=' ')||texto.charAt(i)=='\t'||texto.charAt(i)=='\n'){
                    cont++;
                }else{
                    continue;
                }
            }

        numero=cont;

        while(numero>0){

            numero=numero/10;
            cifras++;

        }

        for(int i=1; i<=4-cifras ; i++){
            codigo+="0";   
        }

         codigo+=cont+"-";
        cont=1;
        cifras=0;

        for(int i=0; i<texto.length(); i++){

                if(texto.charAt(i)=='\n'){
                    cont++;
                }else{
                    continue;
                }
            }

        numero=cont;

        while(numero>0){

            numero=numero/10;
            cifras++;

        }

        for(int i=1; i<=4-cifras ; i++){
            codigo+="0";   
        }

         codigo+=cont;
        return codigo;
    }

    public static void interpretarCodigo(String codigo, int numero){

        System.out.println("\nEl código es: "+codigo);

        if(numero==1){

            System.out.print("\nEl total de caracteres son: ");
            for(int i=0; i<4; i++){
                
                System.out.print(codigo.charAt(i));
          
            }

            System.out.println();

        }else if(numero==2){

            System.out.print("\nEl total de palabras es: ");
            for(int i=5; i<9; i++){
                
                    System.out.print(codigo.charAt(i));
            }

            System.out.println();

        }else{

            System.out.print("\nEl total de lineas es: ");
            for(int i=10; i<14; i++){
                
                    System.out.print(codigo.charAt(i));
               
            }

            System.out.println();

        }
       
    }

}
