package superHeroesPoo01;

import java.util.ArrayList;
import java.util.Scanner;

import Moudev2022.Entrada;

public class principal{
	
	public static Scanner teclado = new Scanner(System.in);
	public static final String FILE_NAME = "figuras.txt";
	public static final String FILE_PATH = ".\\src\\superHeroesPoo01\\";
	
	public static void main(String[] args) {
		
		int opcion =0;
		ArrayList<figura> figuras = new ArrayList<figura>();
		ArrayList<coleccion> colecciones = new ArrayList<coleccion>();
		
		do {
			
			System.out.println("--- MENU ---");
			System.out.println("1 - AÑADIR FIGURA");
			System.out.println("2 - CREAR COLECCION");
			System.out.println("3 - AÑADIR FIGURA A COLECCION");
			System.out.println("4 - VER COLECCIONES");
			System.out.println("5 - VER FIGURAS");
			System.out.println("0 - SALIR");
			opcion=Entrada.pedirEntero("Seleccione una opcion: ");
			
			if(opcion==1) { // AÑADIR FIGURA
				
				String nombre = Entrada.pedirTexto("NOMBRE: ");
				superHeroe heroe = new superHeroe(nombre);
				String descripcion = Entrada.pedirTexto("DESCRIPCION: ");
				heroe.setDescripcion(descripcion);
				String capa = Entrada.pedirTexto("¿TIENE CAPA? S-SI N-NO ");
				
				if(capa.equalsIgnoreCase("S")) {
					heroe.setCapa(true);
				}else {
					heroe.setCapa(false);
				}
				//---------------------------------------------------
				
				double alto = (double)Entrada.pedirEntero("ALTO: ");
				double ancho = (double)Entrada.pedirEntero("ANCHO: ");
				double profundidad = (double)Entrada.pedirEntero("PROFUNDIDAD: ");
				dimension dimensiones = new dimension(alto,ancho,profundidad);
				//---------------------------------------------------
				
				String codigo = Entrada.pedirTexto("CODIGO: ");
				double precio = (double)Entrada.pedirEntero("PRECIO: ");
				
				figura actual = new figura(codigo,precio,heroe,dimensiones);
				
				figuras.add(actual);
				
			}else if(opcion==2) { // AÑADIR COLECCION
				
				String nombrecoleccion = Entrada.pedirTexto("NOMBRE COLECCION: ");
				
				coleccion actual = new coleccion(nombrecoleccion);
				
				colecciones.add(actual);
		
				
			}else if(opcion==3) { // AÑADIR FIGURA A COLECCION
				
				int coleccion=0;
				
				if(figuras.size()==0||colecciones.size()==0) {
					System.out.println("Debe añadir figuras y/o colecciones.");
				}else {
					
					System.out.println("--- COLECCIONES ---");
					
					for(int i=0; i<colecciones.size();i++) {
						System.out.println((i+1)+" - "+colecciones.get(i).getNombreColeccion());
					}
					
					opcion=Entrada.pedirEntero("Seleccione una coleccion: ");
					coleccion=opcion;
					
					System.out.println("--- FIGURAS ---");
					
					for(int i=0; i<figuras.size();i++) {
						System.out.println((i+1)+" - "+figuras.get(i).getSuperheroe().getNombre());
					}
					
					opcion=Entrada.pedirEntero("¿Cual desea añadir? ");
					
					colecciones.get(coleccion-1).anadirFigura(figuras.get(opcion-1));
				}
				
			}else if(opcion==4) { // VER COLECCIONES
				
				if(colecciones.size()==0) {
					System.out.println("Debe añadir colecciones.");
				}else {
					
					System.out.println("--- COLECCIONES ---");
					
					for(int i=0; i<colecciones.size();i++) {
						System.out.println((i+1)+" - "+colecciones.get(i).getNombreColeccion());
					}
					
					opcion=Entrada.pedirEntero("Seleccione una coleccion: ");
					
					System.out.println(colecciones.get(opcion-1).toString());
					System.out.println(colecciones.get(opcion-1).conCapa());
					System.out.println(colecciones.get(opcion-1).masValioso());
					System.out.println(colecciones.get(opcion-1).getValorColeccion());
					System.out.println(colecciones.get(opcion-1).getVolumenColeccion());
				
				}
				
				
			}else if(opcion==5) { // VER FIGURAS
				
				if(figuras.size()==0) {
					System.out.println("Debe añadir figuras.");
				}else {
					
					System.out.println("--- FIGURAS ---");
					
					for(int i=0; i<figuras.size();i++) {
						System.out.println((i+1)+" - "+figuras.get(i).getSuperheroe().getNombre());
					}
					
					opcion=Entrada.pedirEntero("Seleccione una figura: ");
					
					System.out.println(figuras.get(opcion-1).toString());
					
				}
				
				
			}else if(opcion==0) {
				System.out.println("FIN DEL PROGARMA...");
				return;
			}else {
				System.out.println("DEBE SELECCIONAR UNA OPCION ENTRE 0 Y 5.");
			}
			
		}while(true);
		
	}
	
	public static void escribir() {
		
	}
	
	public static void leer() {
		
	}

}