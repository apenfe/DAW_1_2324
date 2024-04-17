package Ejercicio_8;

import java.util.ArrayList;
import java.util.Collections;

public class Prueba{
	
	public static void main(String[] args) {
		
		Double[] listaA = {5.7,7.0,8.0,9.3,9.3};
		Double[] listaB = new Double[5];
		Double[] listaC = {5.0,7.0,3.0,9.3,9.3};
		Double[] listaD = {5.7,7.0,9.0,9.3,9.3};
		Double[] listaE = {5.3,1.0,8.0,9.3,9.3};
		Double[] listaF = {5.7,1.1,8.0,9.3,9.3};
		Double[] listaG = {5.7,1.0,3.0,9.3,9.3};
		Double[] listaH = {5.7,3.0,2.0,9.3,9.3};
		Double[] listaI = {5.7,3.0,1.0,9.3,9.3};
		Double[] listaJ = {5.7,6.0,0.0,9.3,9.3};
		
		listaB[0]= 4.0;
		listaB[1]= 5.1;
		listaB[2]= 6.7;
		listaB[3]= 7.2;
		listaB[4]= 8.0;
		
		Estudiante a = new Estudiante(listaA,"Adrian","Peñalver");
		Estudiante b = new Estudiante(listaB,"Julio","Iglesias");
		Estudiante c = new Estudiante(listaC,"luis","Peñalver");
		Estudiante d = new Estudiante(listaD,"julian","Iglesias");
		Estudiante e = new Estudiante(listaE,"julia","Peñalver");
		Estudiante f = new Estudiante(listaF,"maria","Iglesias");
		Estudiante g = new Estudiante(listaG,"tamara","Peñalver");
		Estudiante h = new Estudiante(listaH,"mario","Iglesias");
		Estudiante i = new Estudiante(listaI,"david","Peñalver");
		Estudiante j = new Estudiante(listaJ,"lucia","Iglesias");
		
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
		
		estudiantes.add(a);
		estudiantes.add(b);
		estudiantes.add(c);
		estudiantes.add(d);
		estudiantes.add(e);
		estudiantes.add(f);
		estudiantes.add(g);
		estudiantes.add(h);
		estudiantes.add(i);
		estudiantes.add(j);
		
		Collections.sort(estudiantes);
		
		System.out.println("Lista de estudiantes ordenados por nota media de evaluación:");
        
        for (int x = 0 ; x<estudiantes.size() ;x++) {
        	
        	System.out.println(estudiantes.get(x).toString());
        	
	    }
		
	}
	
}