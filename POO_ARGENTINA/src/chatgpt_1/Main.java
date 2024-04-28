package chatgpt_1;

public class Main{
	
	public static void main(String[] args) {
		
		Administrativo a = new Administrativo("adrian","1234",123,2);
		Tecnico t = new Tecnico("lucia","1235",120,1);
		Gerente g = new Gerente("Raul","1236",180,6);
		
		Empleado[] empleados = new Empleado[3];
		
		empleados[0]=a;
		empleados[1]=t;
		empleados[2]=g;
		
		recorrer(empleados);
		
		GestorBaseDatos db = new GestorBaseDatos();
		
		db.insertarEmpleado(a, a.horasExtra);
		db.insertarEmpleado(t, t.proyectosAsigandos);
		db.insertarEmpleado(g, g.bono);
		
		db.leerEmpleados();
		System.out.println("FIN");
		
	}
	
	public static void recorrer(Empleado[] e) {
		
		for (int i = 0; i < e.length; i++) {
			
			System.out.println("empleado "+(i+1));
			System.out.println("salario: "+e[i].calcularSalario());
			System.out.println("Detalles: "+e[i].mostrarDetalles());
			
		}
		
	}
	
}