package PRACTICA_4_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjercicioArrays {
	
	public static final int NUM_ALUMNOS = 10;
	
	public static Integer[] control = crearNotasAleatorias(true); //vector con las notas generadas
	public static Integer[] listaClase = crearNotasAleatorias(false); //creamos una lista de los alumnos de la clase
	public static Integer[] practicas = crearNotasAleatorias(true); //creamos el array de notas "practicas"
	public static float[] calificaciones = new float[NUM_ALUMNOS];
	public static float[] estadistica = new float[NUM_ALUMNOS]; //hacemos un array de 10 para la estadística.
	public static int[] aprobados = new int[NUM_ALUMNOS];
    public static int[] suspensos = new int[NUM_ALUMNOS];
    public static double[] calif = new double[40];
    
    public static void main(String[] args) {
        
    	resultadoEjercicio();
    	resultadoPracticas();
    	estadistica();
    	aprobadosYSuspensos();
    	cambiarNota(3,6);
        
    }
    
	public static Integer[] crearNotasAleatorias(boolean aleatorio) {

		Integer[] salida = new Integer[NUM_ALUMNOS];
		
		for (int i = 0; i < salida.length; i++) {
			
			if(aleatorio) {
				salida[i] = (int) (Math.random() * 11);
			}else {
				salida[i] = i+1;
			}
			
		}
		return salida;

	}
	
	public static void crearNotas(String comando) {
		
		int x = NUM_ALUMNOS;
		
		if(comando.equals("calif")) {
			x= 31;
		}
		
		for (int i = 0; i < x; i++) {
			
			if(comando.equals("calificaciones")) {
				calificaciones[i] = (((float) control[i] + (float) practicas[i]) / 2);
			}else if(comando.equals("calif")){
				calif[i] = (int)(Math.random()*11);
			}
			
		}

	}

	
	public static int buscarMaxMin(boolean maximo, int postEval) {
	    
		int nota=0;
		
        for(int i=0; i<control.length; i++){
            int preEval = control[i];
            if ((preEval < postEval)&&maximo||(preEval > postEval)&&!maximo){
                nota = preEval;
                postEval = control[i];
            }
        }
        
        if(maximo) {
        	System.out.println("Minimo es: " + nota);
        }else {
        	System.out.println("Maximo es: " + nota);
        }
        
        return nota;

    }

	public static void buscarPeorMejor(int minNota, int maxNota) {
		
		List notas = Arrays.asList(control);
		System.out.println("Indice del máximo es : " + (notas.indexOf(minNota) + 1));
        System.out.println("Indice del minimo es : " + (notas.indexOf(maxNota) + 1));

	}
	
	public static void resultadoEjercicio() {
		
		 //Comprobamos el resultado del ejercicio   
        buscarPeorMejor(buscarMaxMin(false,0),buscarMaxMin(true,11)); //Empezamos el uso de listas para facilitar la tarea de índices.
        System.out.println("Lista de clase :" + Arrays.toString(listaClase));
        System.out.println("Array de Notas :" + Arrays.toString(control)+"\n");	

	}
	
	public static void resultadoPracticas() {
		
        crearNotas("calificaciones"); //Creamos el vector calificaciones
        System.out.println("Prácticas      :" + Arrays.toString(practicas));
        System.out.println("Calificaciones :" + Arrays.toString(calificaciones)+"\n");

	}
	
	public static void estadistica() {
      
        for (int i=0; i<10; i++){ //Sacamos la estadística de calificaciones
        	
            float count = 0;
         
            for (int j=0; j<control.length; j++){
            	
                if ((i < calificaciones[j]) && ((i+1) >= calificaciones[j] )) {
             
                    count += 1;
                }
                
            }
            
            if (count != 0){
            	
                estadistica[i] = ( (float)count / NUM_ALUMNOS);
                
            }else{
            	
            	estadistica[i] = 0;
            	
            }
            
            double sol = (Math.round(estadistica[i] * 10000.0)) / 100.0;
            System.out.println("Estadística nota tramo <=" + (i+1) + " = " + sol + "%");
        }
        
        System.out.println();
        
	}
	
	public static void aprobadosYSuspensos() {
	    
        for (int i=0; i<NUM_ALUMNOS; i++){
        	
            if (calificaciones[i] < 5){
                suspensos[i] = i;
            }else{ 
                aprobados[i] = i;
            }
        }        
        System.out.println("Relación de aprobados por nº de lista: " + Arrays.toString(aprobados));
        System.out.println("Relación de suspensos por nº de lista: " + Arrays.toString(suspensos));
        
        resumenAprobadosYSuspensos();
        
	}
	
	public static void resumenAprobadosYSuspensos() {
  
        Integer[] a = resumen(aprobados);
        Integer[] s = resumen(suspensos) ;
        
        System.out.println("Resumen  de aprobados por nº de lista: " + Arrays.toString(a));
        System.out.println("Resumen  de suspensos por nº de lista: " + Arrays.toString(s));
          
	}
	
	public static Integer[] resumen(int[] vector) {
	      
       int i = 0;
       ArrayList<Integer> numeros = new ArrayList<Integer>();
       
       while(i < vector.length){
       	
           if(vector[i] != 0){
               numeros.add(vector[i]);
           }
           	
           	i++;
           
       }
       
       return numeros.toArray(new Integer[0]); 
       
	}
	
	public static void cambiarNota(int alumno, double nota) {
		
		crearNotas("calif");
        System.out.println("Nota antigua alumno nº"+(alumno+1)+": " + calif[alumno]); 
        calif[alumno] = nota;
        System.out.println("Nota nueva   alumno nº"+(alumno+1)+": " + calif[alumno]);
       
	}

}
