package repaso_chatgpt_1;

/*

5. Crea una clase `Main` que contenga el método `main` donde se realizará lo siguiente:

   - Utilizar el método `insertar` de la clase `GestorBD` para guardar los empleados en la base de datos.
   - Consultar la base de datos para recuperar los empleados almacenados y mostrar sus detalles.

 */

public class Main{
	
	public static GestorBaseDatos db = new GestorBaseDatos();
	
	public static void main(String[] args) {
		
		
		Gerente g = new Gerente("luis",1,2300,23);
		Gerente g1 = new Gerente("adrian",2,2400,25);
		Tecnico t = new Tecnico("paco",3,1300,3);
		Administrativo a = new Administrativo("mario",4,1500,2);
		
		Empleado[] empleados = new Empleado[4];
		empleados[0]=g;
		empleados[1]=g1;
		empleados[2]=t;
		empleados[3]=a;
		
		db.insertarGerente(g1);
		db.insertarGerente(g);
		
		db.leerGerentes();
		
	}
	
}