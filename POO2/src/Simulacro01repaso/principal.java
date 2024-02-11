package Simulacro01repaso;

public class principal{
	
	public static void main(String[] args) {
		
		int alumnos=0;
		
		do {
			
			alumnos=Entrada.pedirInt("Inserte la cantidad de alumnos: ");
			
			if(alumnos<=0) {
				System.out.println("La cantidad de alumnos debe ser superior a 0.");
			}
		
		}while(alumnos<=0);
		
		Alumno[] clase =new Alumno[alumnos];
		
		for(int i=0; i<clase.length; i++) {
			
			String nombre=Entrada.pedirTexto("Nombre del alumno "+(i+1)+": ");
			String apellidos=Entrada.pedirTexto("Apellidos del alumno "+(i+1)+": ");
			String nre=Entrada.pedirTexto("NRE del alumno "+(i+1)+": ");
			String email=Entrada.pedirTexto("Email del alumno "+(i+1)+": ");
			String direccion=Entrada.pedirTexto("Direccion del alumno "+(i+1)+": ");

			clase[i]= new Alumno(nombre,apellidos,nre,email,direccion);
		}
		
		for(int i=0; i<clase.length; i++) {

			System.out.println("Los datos del alumno "+(i+1)+" son: ");
			System.out.println(clase[i].info());

		}
		
		while(true) {
			
			System.out.println("--- MENU ---\n");
			
			for(int i=0; i<clase.length; i++) {
				
				System.out.println((i)+" - "+clase[i].getNombre());

			}
			
			System.out.println((clase.length)+" - SALIR.");
			
			alumnos = Entrada.pedirInt("Seleccione una de las opciones anteriores: ");

			if(alumnos==clase.length) {
				System.out.println("FIN DEL PROGRAMA");
				return;
			}else if(alumnos<0||alumnos>clase.length) {
				System.out.println("Seleccione una opcion valida");
			}else {
				System.out.println(clase[alumnos].info());
			}
			
		}
		
	}
	
}