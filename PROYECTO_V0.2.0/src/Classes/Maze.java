package classes;

/*
 * Maze.java
 * 
 * Esta clase contendrá, las siguientes propiedades:
 * 
 * map: Se trata de una matriz de 2 dimensiones de char. En esta matriz se almacenarán los caracteres leídos
 * de cada fichero de laberintos.
 * 
 * filename: Propiedad de tipo texto que contiene el nombre del fichero del laberinto que se ha cargado en el programa.
 * 
 * loaded: Propiedad booleana que inicialmente estará con valor false y se pondrá con valor true cuando se haya cargado 
 * correctamente un laberinto en el programa. Esto controlará que no se pueda mostrar ningún laberinto ni establecer las 
 * casillas de inicio y fin hasta que no se haya cargado previamente un laberinto.
 * 
 * startI: Propiedad numérica que contiene la coordenada I de la casilla de inicio.
 * 
 * startJ: Propiedad numérica que contiene la coordenada J de la casilla de inicio.
 * 
 * endI: Propiedad numérica que contiene la coordenada I de la casilla de fin.
 * 
 * endJ: Propiedad numérica que contiene la coordenada J de la casilla de fin.
 * 
 * Métodos de la Clase Maze:
 * 
 * loadMaze(): Método público que se encargará pedir a usuario un fichero a cargar con el laberinto. Se recomienda hacer 
 * métodos privados que realicen partes de toda esta funcionalidad para hacer más sencillo su mantenimiento.
 * 
 * showMaze(): Método público encargado de mostrar en pantalla la matriz con el laberinto que se ha cargado en el programa. 
 * Además, debe mostrar los números de filas y columnas, por lo que se debe reservar los márgenes necesarios de cada línea 
 * para que el laberinto se muestre correctamente. Nota: Los números de columnas se deben escribir en vertical en lugar de 
 * horizontal, para que se ajusten a la posición de cada columna de caracteres. Otro punto a tener en cuenta es que, si se 
 * ha cargado el laberinto, pero no las casillas de inicio y fin, solo mostrará el laberinto; si se han establecido además 
 * las casillas de inicio y fin, en las coordenadas correspondientes se tendrá que mostrar una "I" y una "F", en lugar de 
 * mostrar un espacio en blanco que tenía el laberinto.
 * 
 * setStartEnd(): Método público que se encarga de solicitar al usuario las coordenadas I y J de las casillas de inicio y fin.
 * 
 * isLoaded(): Método público que comprueba si se ha cargado el laberinto.
 * 
 * deleteMaze(): Método privado que resetea los valores del laberinto.
 * 
 * obtainTxtNames(): Método privado que obtiene los ficheros txt almacenados.
 * 
 * readMaze(): Método privado que lee un laberinto del archivo.
 * 
 * numberVertically(): Metodo privado que muestra los numeros de columna en forma vertical.
 * 
 * maxFigure(): Método privado que obtiene la cantidad maxima de cibras de un entero.
 * 
 * setIJ(): Método privado que simplifica la carga de entrada y salida.
 * 
 * sameInOut(): Método privado que comprueba si la entrada y la salida son la misma casilla.
 * 
 * APF - 31-01-2024
 * VERSION: 0.2.0
 * 
 */

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Maze{
	
	/* ATRIBUTOS DE LA CLASE MAZE */
	
	private char[][] map = new char[0][0];
	private String fileName;
	private boolean loaded;
	private int startI;
	private int startJ;
	private int endI;
	private int endJ;
	
	/* CONSTRUCTOR DE LA CLASE MAZE */
	
	public Maze() {
		
		this.loaded=false;
		
	}
	
	/* METODOS DE LA CLASE MAZE */
	
	/* METODO PARA SABER SI ESTA CARGADO EL LABERINTO */
	
	public boolean isLoaded() {
		return loaded;
	}
	
	/* METODO PARA RESETEAR VALORES DEL LABERINTO */
	
	private void deleteMaze(boolean total) {
		
		if(total) { /* SI QUEIRO RESETEARLOS TODOS */
			
			this.fileName = "";
			this.loaded = false;
			this.startI=0;
			this.startJ=0;
			this.endI=0;
			this.endJ=0;
			
		}else { /* SI SOLO QUIERO RESETEAR LA ENTRADA Y SALIDA */
			
			this.startI=0;
			this.startJ=0;
			this.endI=0;
			this.endJ=0;
			
		}
		
	}
	
	/* METODO PARA CARGAR EL LABERINTO DESEADO */

	public void loadMaze() {
		
		int num = 0;
		StringBuilder file = new StringBuilder();
				
		ArrayList<String> mazeNames = obtainTxtNames(Config.PATH); // OBTIENE LOS NOMBRES DE LOS LABERINTOS
		
		do { // LOS MUESTRA EN UN MENU
			
			System.out.println("\n\t------------------- LABERINTOS DISPONIBLES -------------------");
			
			for(int i =0; i<mazeNames.size();i++) {
				
				System.out.println("\t["+(i+1)+"]" + " ---> " + mazeNames.get(i));
				
			}
			
			System.out.println("\t[0] ---> SALIR");
			
			num = Input.getInt("\n\tSeleccione una opcion [0-"+mazeNames.size()+"]: ", false);
			
			if(num==0) {
				System.out.println("\tVOLVIENDO AL MENU...");
				return;
			}else if(num>=1 && num<=mazeNames.size()) {
				file.append(mazeNames.get(num-1));
				break;
			}else {
				System.out.println("\tDebe Seleccionar una opcion entre [0-"+mazeNames.size()+"]: ");
			}
			
		}while(true);
		
		if(isLoaded()) { // EN CASO DE SELECCIONAR OTRO LABERINTO Y QUE YA TUVIESEMOS OTRO CARGADO...
			deleteMaze(true); // SE RESETEAN LOS VALORES COMPLETOS
		}
		
		if(readMaze(Config.PATH+file.toString())) { // SI EL LABERINTO SE LEE CORRECTAMENTE
			System.out.println("\n\tEL ARCHIVO "+file.toString()+" HA SIDO CARGADO EXITOSAMENTE.");
			this.fileName=file.toString(); // SE LE DA NOMBRE
			this.loaded=true; // SE VUELVE A INDICAR QUE ESTÁ CARGADO
			
		}else {
			System.out.println("\n\tERROR AL LEER EL ARCHIVO "+file.toString());
		}
		
	}
	
	/* METODO PARA OBTENER LOS NOMBRE DE LOS TXT */
	
	private ArrayList<String> obtainTxtNames(String path) {
		
        ArrayList<String> namesFiles = new ArrayList<>();
        File[] files = new File[0];
        
        try {
        	
        	File route = new File(path);
            files = route.listFiles();
			
		} catch (Exception e) {
			
			System.out.println("\n\tERROR - CONTACTAR SERVICIO TECNICO.");
		}

        if (files != null) {
        	
            for (File file : files) { // POR CADA ARCHIVO...
                
                if (file.isFile() && file.getName().toLowerCase().endsWith(".txt")) {
                    namesFiles.add(file.getName());
                }
            }
            
        }

        return namesFiles;
    }
	
	/* METODO LEER LOS DATOS DE UN ARCHIVO */
	
	private boolean readMaze(String fullPath) {
		
		ArrayList<String> lines = new ArrayList<>();
		File userMaze = new File(fullPath);
		
        try( Scanner reader = new Scanner(userMaze)) {
        	
     
        	
        	while(reader.hasNextLine()) {
        		
        		String line = reader.nextLine();
        		lines.add(line);
        		
        	}
        	
        }catch(Exception e) {
        	
        	System.out.println("Pongase en contacto con el soporte técnico.");
        	return false;
        
        }
        
        this.map = new char[lines.size()][lines.get(0).length()];
        
        for (int i = 0; i < lines.size(); i++) {
        	
        	String currentLine = lines.get(i);
        	
        	for (int j = 0; j < lines.get(0).length(); j++) {
        		
        		this.map[i][j]=currentLine.charAt(j);
    			
    		}
        	
		}

        return true;
    }
	
	/* METODO PARA VISUALIZAR EL LABERINTO */
	
	public void showMaze() {
		
		System.out.println("\n\tLaberinto: " + fileName); // SE INDICA EL NOMBRE
		
		numberVertically(); // SE MUESTRAN LOS NUMEROS DE COLUMNA EN VERTICAL

		for (int i = 0; i < map.length; i++) {

			System.out.print("\t" + i + " - \t");

			for (int j = 0; j < map[0].length; j++) {

				boolean check = true;

				if ((i == startI && j == startJ) && (startI != 0 && startJ != 0)) {
					System.out.print("I ");
					check = false;
				} else if ((i == endI && j == endJ) && (endI != 0 && endJ != 0)) {
					System.out.print("F ");
					check = false;
				}

				if (check) {

					System.out.print(map[i][j]+" ");

				}

			}

			System.out.println();
		}

	}
	
	/* METODO PARA MOSTRAR LOS NUMEROS DE COLUMNA EN VERTICAL */
	
	private void numberVertically() {
		
		int figure = maxFigure(map[0].length); // SE BUSCAN LAS CIFRAS DEL NUMERO MAS GRANDE
		
		for (int i = 0; i < figure; i++) { // SE RECORREN PRIMERO LAS ALTURAS POR EL NUMERO MAXIMO DE CIFRAS
			
			System.out.print("\n\t\t");
			
			/* SE RECORRE TOD EL TAMAÑO DE LAS COLUMNAS DE LA MATRIZ */
			
			for (int j = 0; j < map[0].length; j++) {
				
				int jFigure = maxFigure(j); // SE CALCULAN LAS CIFRAS DE LA COLUMNA ACTUAL
				
				if(jFigure < (i+1)) { // SI LAS CIFRAS DE LA COLMNA SON MENORES QUE EL Nº DE FILA
					
					if(jFigure==1 && i==0) { // SI LAS CIFRAS SON 1 Y LA FILA ES LA PRIMERA ENTONCES PINTA EL NUMERO
						System.out.print(j+" ");
					}else { // EN OTRO CASO, PONE UN SIMBOLO INDICADOR
						System.out.print("| ");
					}
				
				}else if(jFigure >= (i+1)) { // SI LAS CIFRAS DE LA COLUMNA SON MAYOR O IGUAL QUE EL Nº DE FILA
					
					String number =""+j; // CREAMOS UN STRING CON EL NUMERO DE LA COLUMNA
					int index =0;
					
					if(i<number.length()) { // SI LA FILA ES MENOR QUE LAS CIFRAS DEL NUMERO... 
						index=i; // EL INDICE SERÁ EL DE LA FILA
					}else {
						index=number.length()-1; // EN OTRO CASO SERÁ EL ULTIMO NUMERO.
					}
					
					System.out.print(number.charAt(index)+" "); // IMPRIME LA CIFRA CORRESPONDIENTE
					
				}
				
			}
			
		}
		
		System.out.print("\n\t\t");
		
		for (int i = 0; i < map[0].length; i++) {
			
			String linea = "| ";
			
			System.out.print(linea);
			
		}
		
		System.out.println("\n");

	}
	
	/* METODO PARA CALCULAR LAS CIFRAS DE UN NUMERO */
	
	private int maxFigure(int number) {
		
		int figure =0;
		
		if(number==0) {
			return 1;
		}
		
		while(number>0) {
			
			number/=10;
			figure++;
		}
		
		return figure;
			
	}
	
	/* METODO PARA ESTABLECER CASILLAS DE ENTRADA Y SALIDA DEL LABERINTO */
	
	public void setStartEnd() {
		
		deleteMaze(false); // SE RESETEAN LAS CASILLAS ANTERIORES
		
		showMaze();
		
		if(setIJ(true)) { // SI LA CASILLA DE ENTRADA SE ESTABLECE
			System.out.println("\r\tCASILLA DE ENTRADA FIJADA.");
		}else { // EN OTRO CASO, SI EL USUARIO DESISTE SE TERMINA EL PROGRAMA.
			System.out.println("\r\tNO SE HA PODIDO FIJAR LA CASILLA DE ENTRADA.");
			return;
		}
		
		showMaze();
		
		if(setIJ(false)) { // SI LA CASILLA DE SALIDA SE ESTABLECE
			System.out.println("\r\tCASILLA DE SALIDA FIJADA.");
		}else { // EN OTRO CASO, SI EL USUARIO DESISTE SE TERMINA EL PROGRAMA.
			System.out.println("\r\tNO SE HA PODIDO FIJAR LA CASILLA DE SALIDA.");
		}
		
		showMaze();
		
	}
	
	/* METODO PARA ESTABLECER CASILLA */
	
	private boolean setIJ(boolean entrada) { // SI ES TRUE SE ESTABLECE ENTRADA, SI ES FALSE LA SALIDA
		
		int num = 0;
		String casilla ="";
		
		if(entrada) {
			casilla="entrada";
		}else {
			casilla="salida";
		}
		
		do { 
			
			do { // ESTABLECE Y COMPRUEBA LA FILA
				
				num=Input.getInt("\r\tIntroduzca la fila de "+casilla+": ", true);
				
				if(num<0 || num>map.length-1) {
					System.out.println("\r\tEl número debe de ser mayor o igual que 0 y menor que"+(map.length-1));
				}
				
			}while(num<0 || num>map.length-1);
			
			if(entrada) {
				startI=num;
			}else {
				endI=num;
			}
			
			do { // ESTABLECE Y COMPRUEBA LA COLUMNA
				
				num=Input.getInt("\r\tIntroduzca la columna de "+casilla+": ", true);
				
				if(num<0 || num>map[0].length-1) {
					System.out.println("\r\tEl número debe de ser mayor o igual que 0 y menor que"+(map[0].length-1));
				}
				
			}while(num<0 || num>map[0].length-1);
			
			if(entrada) {
				startJ=num;
			}else {
				endJ=num;
			}
			
			if(sameInOut()) { // SI LAS CASILLAS DE ENTRADA Y SALIDA SON LAS MISMAS
				
				System.out.println("\r\tLas casillas de entrada y salida coinciden.");
				
				if(Config.confirmExit("\r\t¿Desea ingresar otra casilla de "+casilla+"? SI-S NO-N ", "N")) {
					deleteMaze(false); // SE RESETEAN ENTRADA Y SALIDA
					return false;
				}
				
			} else {

				if (entrada && (map[startI][startJ] == ' ')) { // SI LA CASILLA ES VALIDA...
					return true;
				} else if (!entrada && (map[endI][endJ] == ' ')) { // SI LA CASILLA ES VALIDA...
					return true;
				} else { // EN OTRO CASO...
					
					System.out.println("\r\tLa casilla coincide con una pared.");
					
					if (Config.confirmExit("\r\t¿Desea ingresar otra casilla de " + casilla + "? SI-S NO-N ", "N")) {
						deleteMaze(false); // SE RESETEAN ENTRADA Y SALIDA
						return false;
					}
				}

			}
			
		}while(true);
		
	}
	
	/* METODO PARA COMPROBAR SI ENTRADA Y SALIDA SON IGUALES */
	
	private boolean sameInOut() {
		
		return (startI==endI && endJ==startJ) && (startI!=0 && startJ!=0 );
		
	}
	
}