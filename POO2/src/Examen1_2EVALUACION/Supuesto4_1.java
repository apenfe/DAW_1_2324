package Examen1_2EVALUACION;

import java.util.Scanner;

/*
 *  
 *  Una vez se hayan recogido los datos de todos los usuarios, deberá mostrar un listado ordenado 
 *  alfabéticamente por apellido para seleccionar un usuario y mostrar sus datos.
 *  
 *  El programa debe cumplir con las siguientes consideraciones:
 *  
 *  En el programa principal, después de obtener el array de Usuario y llamar a la ordenación, se debe 
 *  mostrar un menú listando todos los usuarios de acuerdo al ejemplo y pedir un número de opción para llamar 
 *  a un método que muestra únicamente al usuario seleccionado. No hace falta que muestre el menú con los usuarios 
 *  en bucle, con mostrarlo una única vez es suficiente.
 *  
 *  
 */

public class Supuesto4_1{
	
	public static final int USUARIOS = 2;
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Usuario[] usuarios = pedirUsuarios();
		
		
		System.out.println("USUARIOS: ");
		for (int i = 0; i < usuarios.length; i++) {
			System.out.println((i+1)+" --->"+usuarios[i].getApellidos()+", "+usuarios[i].getNombre());
		}
		System.out.println("Seleccione una opcion: ");
		int opcion = Integer.parseInt(teclado.nextLine().trim());
		
		opcion--;
		
		if(opcion>=0&&opcion<usuarios.length) {
			mostrarUsuarios(usuarios, opcion);
		}else {
			System.out.println("Opcion no valida");
		}
		
		
		
		
	}
	
	public static Usuario[] pedirUsuarios() {
		
		Usuario[] salida = new Usuario[USUARIOS];
		
		for (int i = 0; i < salida.length; i++) {
			
			System.out.print("Introduce un nombre: ");
			String nombre = teclado.nextLine();
			System.out.print("Introduce apellidos: ");
			String apellidos = teclado.nextLine();
			System.out.print("Introduce un email: ");
			String email = teclado.nextLine();
			
			salida[i]=new Usuario(nombre,apellidos,email);
			
		}
		
		ordenarUsuarios(salida);
		
		
		return salida;
		
	}
	
	public static Usuario[] ordenarUsuarios(Usuario[] salida) {
		
		for (int i = 1; i < salida.length; i++) {
			
			for (int j = 0; j < salida.length-i; j++) {
				
				if(salida[j].getApellidos().compareToIgnoreCase(salida[j+1].getApellidos())>1) {
					
					Usuario aux = salida[j];
					salida[j]=salida[j+1];
					salida[j+1]=aux;
					
				}	
				
			}
			
		}
		
		return salida;
		
	}
	
	public static void mostrarUsuarios(Usuario[] salida, int opcion) {
		
		System.out.println(salida[opcion].toString());
		
	}

	
}