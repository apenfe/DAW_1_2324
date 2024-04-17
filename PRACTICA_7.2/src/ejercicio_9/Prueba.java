package ejercicio_9;

import java.util.ArrayList;
import java.util.Collections;

public class Prueba{
	
	public static void main(String[] args) {
		
		//double sueldo, int horasTrabajadas, String nombre, String apellidos
		Trabajador a = new Trabajador(2000, 40,"Adrian","Peñalver");
		Trabajador b = new Trabajador(1500, 40,"Julio","Iglesias");
		Trabajador c = new Trabajador(2200, 40,"luis","Peñalver");
		Trabajador d = new Trabajador(2100, 40,"julian","Iglesias");
		Trabajador e = new Trabajador(2050, 40,"julia","Peñalver");
		Trabajador f = new Trabajador(2070, 40,"maria","Iglesias");
		Trabajador g = new Trabajador(2230, 40,"tamara","Peñalver");
		Trabajador h = new Trabajador(1800, 40,"mario","Iglesias");
		Trabajador i = new Trabajador(1200, 40,"david","Peñalver");
		Trabajador j = new Trabajador(1000, 40,"lucia","Iglesias");
		
		ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();
		
		trabajadores.add(a);
		trabajadores.add(b);
		trabajadores.add(c);
		trabajadores.add(d);
		trabajadores.add(e);
		trabajadores.add(f);
		trabajadores.add(g);
		trabajadores.add(h);
		trabajadores.add(i);
		trabajadores.add(j);
		
		Collections.sort(trabajadores);
		
		System.out.println("Lista de trabajadores ordenados por salario por hora de menor a mayor:");
        
        for (int x = 0 ; x<trabajadores.size() ;x++) {
        	
        	System.out.println(trabajadores.get(x).toString());
        	
	    }
		
	}
	
}