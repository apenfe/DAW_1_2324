package UNO1;

/**
 * HolaMundo.java
 * Programa de tipo hola mundo para inicializacion.
 * apf - 2023.09.18
 */

public class HolaMundo { //Crea una clase de tipo HolaMundo
	public static void main(String[] args) { //Se especifica su main y los posibles parámetros que acepta de entrada

		System.out.println("Hola mundo...");  //Muestra mensaje con un salto de línea
        System.out.println("Programa: HolaMundo, Autor: Adrian, version: 2023/09/18");  //Muestra más datos

 /* También sería posible crear varias variables de tipo String y concatenarlas:
  * 
  *  String autor= "Adrian";
  *      ......
  *  System.out.println("Autor: " + autor + "..."+...);
  *
  */

	}
}

/* Las dos primeras palabras (public class) corresponden a palabras reservadas.
 * Estas generan una clase de tipo HolaMundo, este nombre debe coincidir con el nombre
 * del archivo de tipo .java
 *
 * Los corchetes de tipo {} que aparecen al final de esta primera línea y en la última
 * indican el ámbito de la clase, así como el de las variables que son definidas en esta.
 *
 * Las palabras (public static void main), hacen referencia también a palabras reservadas
 * que sirven para crear el programa principal "main" de la clase.
 * Al tratarse de un método, admite la entrada de datos, por ello dentro de los paréntesis
 * aparece lo siguiente: (String[] args), que en este caso, queda vacío al no ser necesario 
 * facilitar ninún tipo de dato para la ejecución.
 *
 * Tal como he comentado para la clase, en este método también se han usado los corchetes {}
 * que delimitan el ámbito de este.
 *
 * Por último la línea System.out.println(), es un método el cual realiza impresión por terminal
 * de los argumentos que se introduzcan en los paréntesis. 
 * En este caso sería un String "Hola mundo...". Además el "ln" crea un salto de línea y
 * finalmente se añade un ";" que es un signo obligatorio en el lenguaje Java.
 */

 /* CLASIFICACIÓN:
  *  PALABRAS RESERVADAS:(public, class, static, void)
  *  SENTENCIAS: System.out.println(...); y main(String[] args)
  *  IDENTIFICADORES: HolaMundo (Para designar el nombre de la clase)
  *  DELIMITADORES:[],{},(),"" y ;
  * 
  */

 /* Algunas líneas salen desplazadas con respecto a otras debido a una serie de pautas que especifican las buenas
  * prácticas de programación. Una guía de estilo para JAVA.
  * 
  * Este desplazamiento con tabulador permite que el código sea leido de forma clara, facilitando el entendimiento de
  * este y abaratando su mantenimiento.
  *
  * Algunas palabras se escriben con mayúscula inicial como norma de estilo, como podria ser diferenciar nombres de:
  * Clases, variables, métodos o constantes. 
  */

 /* En caso de poner minúscula en el nombre de la clase, no se ejecuta, al no corrresponder este con el nombre del
  * fichero: HolaMundo != holaMundo
  */
