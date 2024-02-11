package Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ficheros05{
	
	public static Scanner teclado = new Scanner(System.in);	
	public static final String FILE ="deepwork.txt";
	public static final String PATH =".\\files\\";
	
	public static void main(String[] args) {
		
		do {
			
			System.out.println("--- MUENU ---\n 1 - LEER ARCHIVO\n 2 - ESCRIBIR LINEA\n 3 - SALIR\n");
			System.out.print("Seleccione una opcion: ");
			int opcion = Integer.parseInt(teclado.nextLine().trim());
			
			if(opcion==1) { //leer
				
				ArrayList<Asignaturas> lista = leer();
				
				for (int i = 0; i < lista.size(); i++) {
					
					System.out.print("nombre: ");
					System.out.println(lista.get(i).getNombre());
					System.out.print("dia: ");
					System.out.println(lista.get(i).getDia());
					System.out.print("mes: ");
					System.out.println(lista.get(i).getMes());
					System.out.print("horas: ");
					System.out.println(lista.get(i).getHoras());
					System.out.println();
					
				}
				
			}else if(opcion==2) { // escribir
				
				String dato="";
				System.out.print("Inserte un nombre: ");
				dato += teclado.nextLine()+"#";	
				System.out.print("Inserte un dia: ");
				dato += teclado.nextLine()+"#";	
				System.out.print("Inserte un mes: ");
				dato += teclado.nextLine()+"#";	
				System.out.print("Inserte las horas: ");
				dato += teclado.nextLine()+"#";	
				
				if(escribir(dato)) {
					System.out.println("Nueva linea insertada.");
				}else {
					System.out.println("Algo fue mal.");
				}
				
			}else if(opcion==3) {
				System.out.println("FIN DEL PROGRAMA.");
				return;
			}else {
				System.out.println("Seleccione una opcion valida.");
			}
			
		}while(true);
		
	}
	
	public static ArrayList<Asignaturas> leer(){
	
		ArrayList<Asignaturas> list = new ArrayList<Asignaturas>();
		
		try {
	
			File myObj = new File(PATH + FILE);
			Scanner myReader = new Scanner(myObj);
	
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String[] campos = data.split("#");
				
				Asignaturas actual = new Asignaturas(campos[0],campos[1],campos[2],campos[3]);
				
				list.add(actual);
			}
	
			myReader.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	
		return list;
			
	}
	
	public static boolean escribir(String linea){
		
		try {
		      FileWriter escritor = new FileWriter(PATH+FILE,true);
		      
		      escritor.write(linea+"\n");
		      escritor.close();
		      
		} catch (IOException e) {
		      
		      e.printStackTrace();
		      return false;
		}
		
		return true;
		
	}
	
}

class Asignaturas{
	
	private String nombre;
	private String dia;
	private String mes;
	private String horas;
	
	public Asignaturas(String nombre,String dia,String mes,String horas ) {
		setNombre(nombre);
		setDia(dia);
		setMes(mes);
		setHoras(horas);
		
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	public String getNombre() {
		
		return this.nombre;
		
	}
	
	public void setDia(String dia) {
		
		this.dia = dia;
		
	}
	
	public String getDia() {
		
		return this.dia;
		
	}
	
	public void setMes(String mes) {
		
		this.mes = mes;
		
	}
	
	public String getMes() {
		
		return this.mes;
		
	}
	
	public void setHoras(String horas) {
		
		this.horas = horas;
		
	}
	
	public String getHoras() {
		
		return this.horas;
		
	}
	
}