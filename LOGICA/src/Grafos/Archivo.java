package Grafos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Archivo{
	
	/*"\n------------------- MUENU -------------------\n"
			+"[1] - CARGAR LABERINTO\n"
			+"[2] - VER LABERINTO ACTUAL\n"
			+"[3] - ESTABLECER CASILLAS DE ENTRADA Y SALIDA\n"
			+"[4] - BUSCAR CAMINOS\n"
			+"[5] - VER USUARIO ACTUAL\n"
			+"[6] - CERRAR SESION\n"
			+"[0] - SALIR\n\n"
			+"Seleccione una opcion [0-6]: ";*/
	
	public static final String PATH ="C:\\Users\\adria\\eclipse-workspace\\LOGICA\\src\\Grafos\\";
	
	public static int[][] cargar(String ruta) {
		
		ArrayList<String> lineas = new ArrayList<String>();
		
		try {
			
			File archivo = new File(PATH+ruta);
			Scanner lector = new Scanner(archivo);
			
			while(lector.hasNextLine()) {
				
				String linea = lector.nextLine();
				lineas.add(linea);
				
			}
			
			lector.close();
			
		}catch(Exception e) {
			System.out.println("ERROR");
		}
		
		int filas = lineas.size();
		int columnas = lineas.get(0).split(" ").length;
		
		int[][] matriz = new int[filas][columnas];

		for(int i=0; i<filas; i++) {
			
			for(int j=0; j<columnas; j++) {
				
				matriz[i][j]=Integer.parseInt(lineas.get(i).split(" ")[j]);
				
			}
			
		}
		
		return matriz;
		
	}
	
	public static boolean guardar(int[][] matriz,String ruta) {
		
		try {
			
			FileWriter escritor = new FileWriter(PATH+ruta);
			
			for (int i = 0; i < matriz.length; i++) {
				
				for (int j = 0; j < matriz.length; j++) {
					
					escritor.write(matriz[i][j]+" ");
				}
				
				escritor.write("\n");
			}
			
			escritor.close();
			return true;
			
		}catch(Exception e) {
			System.out.println("ERROR");
			e.printStackTrace();
			return false;
		}
		
	}
	
	public static boolean crearArchivo(String ruta) {

		try {

			File myObj = new File(PATH+ruta);

			if (myObj.createNewFile()) {

				System.out.println("Archivo creado: " + myObj.getName());
				return true;
			} else {

				System.out.println("File already exists.");
				return false;
			}

		} catch (IOException e) {

			System.out.println("An error occurred.");
			e.printStackTrace();
			return false;
		}

	}
	
	public static int[][] crearLaberinto(boolean regular) {
		
		int filas=0, columnas=0;
		
		do {
			
			filas = Entrada.pedirEntero("¿Cuantas filas desea? ", true);
			
			if(filas<=4) {
				System.out.println("El tamaño debe de ser superior a 4");
			}
			
		}while(filas<=4);
		
		if(regular) {
			
			do {
				
				columnas = Entrada.pedirEntero("¿Cuantas columnas desea? ", true);
				
				if(columnas<=4) {
					System.out.println("El tamaño debe de ser superior a 4");
				}
				
			}while(columnas<=4);
			
		}
		
		if(!regular) {
			columnas=filas;
		}
		
		int[][] matriz = new int[filas][columnas];
		
		for (int i = 0; i < matriz.length; i++) {
			
			int rango = (int)(Math.random()*10+1);
			rango++;
			
			for (int j = 0; j < matriz[0].length; j++) {
				
				if(i==0||i==matriz.length-1||j==0||j==matriz[0].length-1) {
					
					matriz[i][j]=1;
					
				}else {
					
					int resultado = (int)(Math.random()*rango+1);
					
					if(resultado%2==0) {
						
						matriz[i][j]=1;
						
					}else {
						
						matriz[i][j]=0;
					}
					
				}
				
			}
			
		}
		
		return matriz;
	}

}