package zoologicoPoo08;

import java.util.ArrayList;

/*
 * 
 * • La aplicación permitirá introducir los distintos elementos en el zoológico (zonas,
 * instalaciones, animales, trabajadores y asignaciones) Se pide controlar que no se
 * introduzcan códigos identificativos repetidos (por ejemplo dos instalaciones distintas con el
 * mismo número)
 * 
 * • Además la aplicación debe permitir sacar los siguientes listados:
 * 
 * 	◦ Un listado con las instalaciones del zoológico, donde se indicará el número de la
 * 	instalación, su año de instalación, su descripción y el nombre de la zona en la que se
 * 	encuentra.
 * 
 * 	◦ Un listado con los animales del zoológico, donde se mostrará la especie del animal, el
 * nombre, año de nacimiento, número de instalación donde se encuentra y nombre de la
 * zona donde se encuentra.
 * 
 * 	◦ Un listado las zonas donde trabaja un trabajador concreto. (Se introducirá el DNI del
 * trabajador y aparecerá la información) La información a mostrar será:
 * 
 * 			▪ El nombre y apellidos del trabajador, su especialidad.
 * 			▪ El nombre de cada zona donde trabaja y el horario de trabajo
 * 
 */

/*
 * OPCIONAL
 * Para que la aplicación estuviera completa se podrían añadir muchas más opciones, como por
 * ejemplo opciones de modificación o eliminación de datos. Se pueden realizar búsquedas y sacar
 * otros listados. Además se podría guardar el contenido de la clase Zoológico en un archivo y
 * recuperar esta información cada vez que se ejecute la aplicación, de forma que los datos persistan
 * en el disco duro.
 * 
 * Todas estas opciones quedan como propuesta opcional para que pueda seguir practicando
 */

public class Principal {

	public static Zoologico zoo;
	public static int opcion;

	public static void main(String[] args) {

		opcion = -1;
		nombreZoo();

		do {

			opcion = menuZoo();
			opcionesZoo(opcion);

		} while (opcion != 0);

	}

	public static void nombreZoo() {

		String nombre = Entrada.pedirTexto("¿Cual es el nombre del zoo? ");
		zoo = new Zoologico(nombre);

	}

	public static int menuZoo() {

		System.out.println("\n------ Zoo " + zoo.getNombre() + " ------");
		System.out.println("1 ---> CREAR ZONA");
		System.out.println("2 ---> CREAR INSTALACION");
		System.out.println("3 ---> CREAR ANIMAL");
		System.out.println("4 ---> CREAR TRABAJADOR");
		System.out.println("5 ---> CREAR ASIGNACION");
		System.out.println("6 ---> LISTADOS");
		System.out.println("7 ---> SALIR");
		System.out.println();

		int opcion = Entrada.pedirEntero("Elija la opción deseada: ", true);

		return opcion;

	}

	public static int menuListasZoo() {

		System.out.println("\n------ Listados Zoo " + zoo.getNombre() + " ------");
		System.out.println("1 ---> LISTADO INSTALACIONES");
		System.out.println("2 ---> LISTADO ANIMALES");
		System.out.println("3 ---> LISTADO ZONAS TRABAJADOR");
		System.out.println("4 ---> SALIR");
		System.out.println();

		int opcion = Entrada.pedirEntero("Elija la opción deseada: ", true);

		return opcion;

	}

	public static void opcionesZoo(int num) {

		switch (num) {

		case 1: // ZONAS

			String nombre = Entrada.pedirTexto("Inserte un nombre para la zona: ");
			double superficie = Entrada.pedirDouble("Inserte una superficie para la zona: ", true);

			if(zoo.setZona(nombre,superficie)) {
				
				System.out.println("Zona añadida correctamente.");
				
			}else {
				
				System.out.println("Error al crear la zona.");
				
			}

			break;

		case 2: // INSTALACIONES
			
			ArrayList<Zonas> zonas = zoo.getZonas();
			
			String descripcion = Entrada.pedirTexto("Inserte una descripcion para la instalacion: ");
			int anio = Entrada.pedirEntero("Inserte año de creacion de la Instalacion: ", true);
			
			System.out.println("ZONAS DISPONIBLES----------------------");
			for(int i=0; i<zonas.size();i++) {
				System.out.println((i+1)+" ---> "+zonas.get(i).getCodigo());
			}
			System.out.println();
			
			String zona = Entrada.pedirTexto("Inserte CODIGO DE LA ZONA de la instalacion: ");
			
			if(zonas.size()>0) {
				
				for(int i=0; i<zonas.size();i++) {
					
					if(zonas.get(i).getCodigo().equals(zona)) {
						
						if(zoo.setInstalacion(descripcion,anio,zonas.get(i))) {
							
							System.out.println("Instalacion añadida correctamente.");
							break;
						}else {
							System.out.println("Error al crear la instalacion.");
							break;
						}
						
					}
				}
				
			}else {
				System.out.println("No existen zonas.");

			}
			
			break;

		case 3: // ANIMALES
			
			ArrayList<Instalaciones> instalaciones = zoo.getInstalaciones();
			
			String nombreAnimal = Entrada.pedirTexto("Inserte el nombre del animal: ");
			String especie = Entrada.pedirTexto("Inserte la especie: ");
			int anioAnimal = Entrada.pedirEntero("Inserte el año de nacimeinto: ", true);
			
			System.out.println("INSTALACIONES DISPONIBLES----------------------");
			for(int i=0; i<instalaciones.size();i++) {
				System.out.println((i+1)+" ---> "+instalaciones.get(i).getNumInstalacion()+" - "+instalaciones.get(i).getDescripcion());
			}
			System.out.println();
			
			int instalacion = Entrada.pedirEntero("Inserte codigo la instalacion: ",true);
			
			if(instalaciones.size()>0) {
				
				for(int i=0; i<instalaciones.size();i++) {
					
					if(instalaciones.get(i).getNumInstalacion()==instalacion) {
						
						if(zoo.setAnimal(nombreAnimal,especie,anioAnimal,instalaciones.get(i))) {
							
							System.out.println("Animal añadido correctamente.");
							break;
						}else {
							System.out.println("Error al crear el animal.");
							break;
						}
						
					}else {
						
						System.out.println("Error al crear el animal.");
						
					}
				}
				
			}else {
				System.out.println("No existen Instalaciones.");

			}

			break;

		case 4: // TRABAJADORES
		
			String nombreTrabajador = Entrada.pedirTexto("Inserte el nombre del trabajador: ");
			String apellido = Entrada.pedirTexto("Inserte el apellido del trabajador: ");
			String especialidad = Entrada.pedirTexto("Inserte la especialidad del trabajador: ");
			String dni = Entrada.pedirTexto("Inserte el DNI del trabajador: ");
					
			if(zoo.setTrabajador(nombreTrabajador,apellido,especialidad,dni)) {

				System.out.println("Trabajador añadido correctamente.");

			}else {

				System.out.println("Error al crear el Trabajador.");

			}

			break;

		case 5: // ASIGNACIONES
			
			ArrayList<Trabajadores> trabajadores = zoo.getTrabajadores();
			ArrayList<Zonas> zonasAsignacion = zoo.getZonas();
		
			String horario = Entrada.pedirTexto("Inserte un horario: ");
			
			System.out.println("DNI DISPONIBLES----------------------");
			for(int i=0; i<trabajadores.size();i++) {
				System.out.println((i+1)+" ---> "+trabajadores.get(i).getDni());
			}
			System.out.println();
			
			String trabajador = Entrada.pedirTexto("Inserte DNI trabajador: ");
			
			System.out.println("ZONAS DISPONIBLES----------------------");
			for(int i=0; i<zonasAsignacion.size();i++) {
				System.out.println((i+1)+" ---> "+zonasAsignacion.get(i).getCodigo());
			}
			System.out.println();
			
			String zonaAsignacion = Entrada.pedirTexto("Inserte CODIGO DE LA ZONA de tarbajo: ");
			
			if(zonasAsignacion.size()>0 && trabajadores.size()>0) {
				
				int worker =-1;
				int zone =-1;
				
				for (int i = 0; i < trabajadores.size(); i++) {
					if(trabajadores.get(i).getDni().equals(trabajador)) {
						worker=i;
						break;
					}
				}
				
				for (int i = 0; i < zonasAsignacion.size(); i++) {
					if(zonasAsignacion.get(i).getCodigo().equals(zonaAsignacion)) {
						zone=i;
						break;
					}
				}
				
				if(worker>=0&&zone>=0) {
					if(zoo.setAsignacion(horario, trabajadores.get(worker), zonasAsignacion.get(zone))) {
						System.out.println("ASignacion añadida correctamente.");
					}else {
						System.out.println("Error al añadir asignacion");

					}
				}else {
					System.out.println("No existen Zonas o trabajadores especificados.");

				}
				
			}else {
				System.out.println("No existen Zonas o trabajadores.");
			}

			break;

		case 6:
			
			do {
				
				opcion = menuListasZoo();
				opcionesListasZoo(opcion);
				
			}while(opcion!=0);
			
			opcion = -1;

			break;

		case 7:
			
			if(salida("¿Esta seguro que desea salir? ","S")) {
				opcion=0;
				System.out.println("Fin del programa.");

			}

			break;

		default:
			
			System.out.println("\n\tLa opción debe ser entre 1 y 7.");

		}

	}

	public static boolean salida(String enunciado, String respuesta) {

		if (Entrada.pedirTexto(enunciado + " - " + respuesta).equalsIgnoreCase(respuesta)) {
			return true;
		} else {
			return false;
		}

	}

	public static void opcionesListasZoo(int num) {

		switch (num) {

		case 1: // LISTADO INSTALACIONES
			
			ArrayList<Instalaciones> instalaciones =  zoo.getInstalaciones();
			
			System.out.println();
			System.out.println("INSTALACIONES DISPONIBLES EN EL ZOO----------------------");
			for(int i=0; i<instalaciones.size();i++) {
				System.out.println((i+1)+" ---> "+instalaciones.get(i).getNumInstalacion()+" - "+instalaciones.get(i).getAnioInstalacion()+" - "+instalaciones.get(i).getDescripcion()+" - "+instalaciones.get(i).getZona().getNombre());
			}
			System.out.println();
			
			/*
			 * ◦ Un listado con las instalaciones del zoológico, donde se indicará el número de la
			 * instalación, su año de instalación, su descripción y el nombre de la zona en la que se
			 * encuentra.
			 * 
			 */

			break;

		case 2: // LISTADO ANIMALES
			
			ArrayList<Animales> animales =  zoo.getAnimales();
			
			System.out.println();
			System.out.println("ANIMALES EN EL ZOO----------------------");
			for(int i=0; i<animales.size();i++) {
				System.out.println((i+1)+" ---> "+animales.get(i).getEspecie()+" - "+animales.get(i).getNombre()+" - "+animales.get(i).getAnioNacimiento()+" - "+animales.get(i).getInstalacion().getNumInstalacion()+" - "+animales.get(i).getInstalacion().getZona().getNombre());
			}
			System.out.println();
			
			/*
			 * Un listado con los animales del zoológico, donde se mostrará la especie del animal, el
			 * nombre, año de nacimiento, número de instalación donde se encuentra y nombre de la
			 * zona donde se encuentra
			 * 
			 */

			break;

		case 3:
			
			/*
			 * Un listado las zonas donde trabaja un trabajador concreto. (Se introducirá el DNI del
			 * trabajador y aparecerá la información. La información a mostrar será:
			 * 
			 * 		▪ El nombre y apellidos del trabajador, su especialidad.
			 * 		▪ El nombre de cada zona donde trabaja y el horario de trabajo.
			 * 
			 */
			
			ArrayList<Trabajadores> trabajadores = zoo.getTrabajadores();
			
			System.out.println("TRABAJADORES DISPONIBLES----------------------");
			for(int i=0; i<trabajadores.size();i++) {
				System.out.println((i+1)+" ---> "+trabajadores.get(i).getDni());
			}
			System.out.println();
			
			String trabajador = Entrada.pedirTexto("Inserte DNI trabajador: ");
			
			int indice =0;
			for(int i=0; i<trabajadores.size();i++) {
				
				if(trabajadores.get(i).getDni().equals(trabajador)) {
					System.out.println(trabajadores.get(i).getNombre());
					System.out.println(trabajadores.get(i).getApellido());
					System.out.println(trabajadores.get(i).getEspecialidad());

					indice=i;
					break;
				}
			}
			
			ArrayList<Asignacion> asignaciones = zoo.getAsignaciones();
			
			System.out.println();
			System.out.println("ASIGNACIONES DE "+trabajadores.get(indice).getNombre()+"----------------------");
			for(int i=0; i<asignaciones.size();i++) {
				
				if(asignaciones.get(i).getTrabajador().getDni().equals(trabajador)) {
					System.out.println("Horario: "+asignaciones.get(i).getHorario()+" - ZONA: "+asignaciones.get(i).getZona().getNombre());
				}
			}
			System.out.println();
			

			break;

		case 4:

			if (salida("¿Esta seguro que desea volver al menu principal? ", "S")) {
				opcion = 0;
			}

			break;

		default:

			System.out.println("\n\tLa opción debe ser entre 1 y 4.");

		}

	}

	public static void proximamente() {

		System.out.println("\n\tPROXIMAMENTE");

	}
}