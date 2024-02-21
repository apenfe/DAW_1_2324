package Classes;

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

/*
 * Maze.java
 * 
 * Modificaciones de la clase Maze
 * Se debe crear un atributo privado el cual será una lista dinámica que contendrá objetos 
 * Coordinate (la clase creada para guardar las coordenadas y dirección), donde se guardará la 
 * colección de objetos con las coordenadas de cada casilla por la que pasar para completar el 
 * camino que se está buscando. Se recomienda que sea un Stack (pila) o un ArrayList ya que el 
 * camino a buscar cambiará de tamaño en función de las dimensiones del laberinto, su distribución 
 * y las posiciones de inicio y fin. Si se quiere utilizar otro tipo de array o lista, se permite 
 * siempre que cumpla con la funcionalidad.
 * 
 * path: Stack, ArrayList o array de tipo "Coordinate" que utilizará el algoritmo para guardar las 
 * coordenadas y dirección del camino a buscar para luego mostrarlo.
 * 
 * APF - 19-02-2024
 * VERSION: 1.0.0
 * 
 */

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Maze{
	
	/* ATRIBUTOS DE LA CLASE MAZE */
	private Stack<Coordinate> path = new Stack<Coordinate>(); 
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
		
		if(total) { // SI QUEIRO RESETEARLOS TODOS
			
			this.fileName = "";
			this.loaded = false;
			this.startI=0;
			this.startJ=0;
			this.endI=0;
			this.endJ=0;
			
		}else { // SI SOLO QUIERO RESETEAR LA ENTRADA Y SALIDA
			
			this.startI=0;
			this.startJ=0;
			this.endI=0;
			this.endJ=0;
			
		}
		
	}
	
	/* METODO PARA CARGAR EL LABERINTO DESEADO */

	public void loadMaze() {
		
		int num = 0;
		String file = ""; 
				
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
				file+=mazeNames.get(num-1);
				break;
			}else {
				System.out.println("\tDebe Seleccionar una opcion entre [0-"+mazeNames.size()+"]: ");
			}
			
		}while(true);
		
		if(isLoaded()) { // EN CASO DE SELECCIONAR OTRO LABERINTO Y QUE YA TUVIESEMOS OTRO CARGADO...
			deleteMaze(true); // SE RESETEAN LOS VALORES COMPLETOS
		}
		
		if(readMaze(Config.PATH+file)) { // SI EL LABERINTO SE LEE CORRECTAMENTE
			System.out.println("\n\tEL ARCHIVO "+file+" HA SIDO CARGADO EXITOSAMENTE.");
			this.fileName=file; // SE LE DA NOMBRE
			this.loaded=true; // SE VUELVE A INDICAR QUE ESTÁ CARGADO
			
		}else {
			System.out.println("\n\tERROR AL LEER EL ARCHIVO "+file);
		}
		
	}
	
	/* METODO PARA OBTENER LOS NOMBRE DE LOS TXT */
	
	private ArrayList<String> obtainTxtNames(String path) {
		
        ArrayList<String> namesFiles = new ArrayList<String>();
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
		
		ArrayList<String> lines = new ArrayList<String>();
		
        try {
        	
        	File userMaze = new File(fullPath);
        	Scanner reader = new Scanner(userMaze);
        	
        	while(reader.hasNextLine()) {
        		
        		String line = reader.nextLine();
        		lines.add(line);
        		
        	}
        	
        	reader.close();
        	
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
					System.out.print(Config.ROJO+"I "+Config.RESET);
					check = false;
				} else if ((i == endI && j == endJ) && (endI != 0 && endJ != 0)) {
					System.out.print(Config.ROJO+"F "+Config.RESET);
					check = false;
				}

				if (check) {
					
					boolean camino = false;
					
					//********************************* AQUI TENGO QUE REVISAR
					
					for (int k = 0; k < path.size(); k++) {
						
						if(i==path.get(k).getX() && j==path.get(k).getY()) {
							
							// metodo carcater
							System.out.print(Config.VERDE+symbolPath(path.get(k))+" "+Config.RESET);
							camino=true;
							
						}
						
					}
					
					//*********************************
					if(!camino) {
						System.out.print(map[i][j]+" ");
					}

				}

			}

			System.out.println();
		}

	}
	
	private char symbolPath(Coordinate coordenada) {

		if (coordenada.getDirection()==1) {
			return '^';
		}
		
		if (coordenada.getDirection()==2) {
			return '>';
		}
		
		if (coordenada.getDirection()==3) {
			return 'V';
		}
		
		if (coordenada.getDirection()==4) {
			return '<';
		}
		
		return '*';
		
	}
	
/*	private void setDirections() {

		for (int i = 0; i < path.size()-1; i++) {
			
			if(path.get(i+1).) { // si esta por arriba abajo
				
			}else if(path.get(i+1)) { // si esta por abajo arriba
				
			}else if(path.get(i+1)) { // si esta por derecha abajo
				
			}else if(path.get(i+1)) { // si esta por izquierda abajo
				
			}
			
		}
		
	}*/
	
	/* METODO PARA MOSTRAR LOS NUMEROS DE COLUMNA EN VERTICAL */
	
	private void numberVertically() {
		
		int figure = maxFigure(map[0].length); // SE BUSCAN LAS CIFRAS DEL NUMERO MAS GRANDE
		
		for (int i = 0; i < figure; i++) { // SE RECORREN PRIMERO LAS ALTURAS POR EL NUMERO MAXIMO DE CIFRAS
			
			System.out.print("\n\t\t");
			
			for (int j = 0; j < map[0].length; j++) { // SE RECORRE TODO EL TAMAÑO DE LAS COLUMNAS DE LA MATRIZ
				
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
			
			num=0;
			
			do { // ESTABLECE Y COMPRUEBA LA COLUMNA
				
				num=Input.getInt("\tIntroduzca la columna de "+casilla+": ", true);
				
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
		
		if((startI==endI && endJ==startJ) && (startI!=0 && startJ!=0 )) {
			return true;
		}
		
		return false;
	}
	
	/* METODO PARA COMPROBAR SI ENTRADA Y SALIDA NO SE HAN CREADO*/
	
	public boolean inOutNotZero() {
		
		if((startI==endI && endJ==startJ) && (startI==0 && startJ==0 )) {
			return false;
		}
		
		return true;
	}

	/*
	 * #######################################################################################################################################
	 */

	/* METODO PARA BUSCAR EL PRIMER CAMINO POSIBLE */

	public void firstWay() {

		long inicio = System.currentTimeMillis();
		
		if (goAheadIntelligent(startI, startJ)) {

			showMaze();

			long fin = System.currentTimeMillis();
			
			double time = ((double)fin-(double)inicio)/1000.0;
			System.out.println("\n\tTiempo acumulado: "+time+" (s).");

		} else {
			System.out.println("\n\tEl laberinto no tiene solución.");
		}
		path.clear();
		Input.toContinue();

	}
	
	private boolean checkPath(int i, int j, Stack<Coordinate> path) {
		
		for (int k = 0; k < path.size(); k++) {
			
			if(path.get(k).getX()==i&&path.get(k).getY()==j) {
				return true;
			}
			
		}
		
		return false;
		
	}
	
	private boolean goAheadIntelligent(int i, int j) {
		
		int distI = i-endI;
		int distJ = j-endJ;
		int[][] movements = new int[4][2];
		
		if(distI>=0 && distJ<=0) { // si esta arriba y derecha
			
			movements[0][0] = i-1; // arriba
			movements[0][1] = j; // arriba
			
			movements[1][0] = i; // derecha
			movements[1][1] = j+1; // derecha
			
			movements[2][0] = i+1; // abajo
			movements[2][1] = j; // abajo
			
			movements[3][0] = i; // izquierda
			movements[3][1] = j-1; // izquierda
			
		}else if(distI>=0 && distJ>=0) { // si esta arriba e izquierda
			
			movements[0][0] = i-1; // arriba
			movements[0][1] = j; // arriba
			
			movements[1][0] = i; // izquierda
			movements[1][1] = j-1; // izquierda
			
			movements[2][0] = i+1; // abajo
			movements[2][1] = j; // abajo
			
			movements[3][0] = i; // derecha
			movements[3][1] = j+1; // derecha
			
		}else if(distI<=0 && distJ<=0) { // si esta abajo y derecha
			
			movements[0][0] = i+1; // abajo
			movements[0][1] = j; // abajo

			movements[1][0] = i; // derecha
			movements[1][1] = j+1; // derecha

			movements[2][0] = i-1; // arriba
			movements[2][1] = j; // arriba

			movements[3][0] = i; // izquierda
			movements[3][1] = j-1; // izquierda

			
		}else if(distI<=0 && distJ>=0) { // si esta abajo e izquierda
			
			movements[0][0] = i+1; // abajo
			movements[0][1] = j; // abajo

			movements[1][0] = i; // izquierda
			movements[1][1] = j-1; // izquierda

			movements[2][0] = i-1; // arriba
			movements[2][1] = j; // arriba

			movements[3][0] = i; // derecha
			movements[3][1] = j+1; // derecha

		}

		if (i == endI && j == endJ) {
			return true;
		}
		
		if (map[i][j] == '#' || checkPath(i,j,path)) {
			return false; 
		}
		
		path.push(new Coordinate(i,j));
		//map[i][j] = '*';
								
		boolean result;
		
		result = goAheadIntelligent(movements[0][0],movements[0][1]);
		if (result) {
			return true;
		}
		
		result = goAheadIntelligent(movements[1][0], movements[1][1]);
		if (result) {
			return true;
		}
		
		result = goAheadIntelligent(movements[2][0], movements[2][1]);
		if (result) {
			return true;
		}
		
		result = goAheadIntelligent(movements[3][0], movements[3][1]);
		if (result) {
			return true;
		}
		
		path.pop();
		//map[i][j] = ' ';
		return false;
	}

	/* METODO PARA BUSCAR EL CAMINO MAS CORTO */

	public void shorterWay() {

		long inicio = System.currentTimeMillis();
		Stack<Coordinate> path2 = new Stack<Coordinate>();

		path.clear();
		
		int size = (map.length)+(map[0].length)*10;
		
		for (int i = 0; i < size; i++) {
			
			path.push(new Coordinate(0,i));
			
		}
		
		goAheadAllWays(startI, startJ, path2);

		showMaze();
		path.clear();
		
		long fin = System.currentTimeMillis();
		
		double time = ((double)fin-(double)inicio)/1000.0;
		System.out.println("\n\tTiempo acumulado: "+time+" (s).");
		Input.toContinue();

	}
	
	private boolean goAheadAllWays(int i, int j, Stack<Coordinate> path2 ) { // DEBO CREAR UNA LISTA INTERNA Y SOLO SI SE CUMPLE CONDICION AÑADIR LA A LA GENERAL

		if (i == endI && j == endJ) { // aqui debo devolver el array list completo como un array y añadirlo
			
			//System.out.println("SOLUCION ENCONTRADA...");
			
		//	System.out.println("Tamaño path: "+path.size());
		//	System.out.println("Tamaño path2: "+path2.size());

			
			if(path2.size()<path.size()) {
				
				System.out.println("\t SOLUCION MAS CORTA");
				path.clear();
				path.addAll(path2);
				
			}
			
			return false;
		}
		
		if (map[i][j] == '#' || checkPath(i,j,path2)) {
			return false; 
		}
		
		path2.push(new Coordinate(i,j));
		
		goAheadAllWays(i, j+1, path2);

		goAheadAllWays(i-1, j, path2);

		goAheadAllWays(i, j-1, path2);

		goAheadAllWays(i+1, j, path2);
		
		path2.pop();
		return false;
		
	}
	
}