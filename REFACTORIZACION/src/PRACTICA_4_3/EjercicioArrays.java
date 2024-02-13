package PRACTICA_4_3;

import java.util.Arrays;
import java.util.List;

public class EjercicioArrays {
	
	public static final int NUM_ALUMNOS = 40;
    
    public static void main(String[] args) {
    	
        //vector con las notas generadas
        Integer[] control = crearNotasAleatorias(NUM_ALUMNOS);
        int indMaxNota, indMinNota;
        
        int minNota = buscarMaxMin(true,11,control);
        int maxNota = buscarMaxMin(false,0,control);
        
        //creamos una lista de los alumnos de la clase
        int[] listaClase = new int[NUM_ALUMNOS];
        for (int i = 0; i < NUM_ALUMNOS; i++){
            listaClase[i] = i+1;
        }
        //Empezamos el uso de listas para facilitar la tarea de índices.
        List notas = Arrays.asList(control);
        indMinNota = notas.indexOf(minNota) + 1;
        indMaxNota = notas.indexOf(maxNota) + 1;

        //Comprobamos el resultado del ejercicio   
        System.out.println("Mínimo es: " + minNota);
        System.out.println("Máximo es: " + maxNota);
        System.out.println("Indice del mínimo es : " + indMinNota);
        System.out.println("Indice del máximo es : " + indMaxNota);
        System.out.println("Lista de clase :" + Arrays.toString(listaClase));
        System.out.println("Array de Notas :" + notas);
        
        //creamos el array de notas "practicas"
        Integer[] practicas = crearNotasAleatorias(NUM_ALUMNOS);
        
        //Creamos el vector calificaciones
        float[] calificaciones = new float[NUM_ALUMNOS];
        for(int i = 0; i<control.length; i++){
            calificaciones[i] = 
                    (((float) control[i] 
                    + (float) practicas[i]) 
                    / 2);
        }
        System.out.println("Prácticas      :" + Arrays.toString(practicas));
        System.out.println("Calificaciones :" + Arrays.toString(calificaciones));
        
        //Sacamos la estadística de calificaciones
        //hacemos un array de 10 para la estadística.
        float[] estadistica = new float[10];
      
        for (int i=0; i<10; i++){
            float count = 0;
         
            for (int j=0; j<control.length; j++){
                if ((i < calificaciones[j]) && ((i+1) >= calificaciones[j] )) {
             
                    count += 1;
                }
            }
            if (count != 0){
                estadistica[i] = ( (float)count / NUM_ALUMNOS);
            }else{ estadistica[i] = 0;}
            double sol = (Math.round(estadistica[i] * 10000.0)) / 100.0;
            System.out.println("Estadística nota tramo <=" 
                + (i+1) + " = " 
                + sol + "%");
        }
        //Aprobados y suspensos
        int[] aprobados = new int[NUM_ALUMNOS];
        int[] suspensos = new int[NUM_ALUMNOS];
        int countAprobados = 0;
        int countSuspensos = 0;
        for (int i=0; i<NUM_ALUMNOS; i++){
            if (calificaciones[i] < 5){
                aprobados[i] = i;
                countAprobados += 1;
            }else{ 
                suspensos[i] = i;
                countSuspensos += 1;
            }
        }        
        System.out.println("Relación de aprobados por nº de lista: " 
                + Arrays.toString(aprobados));
        System.out.println("Relación de suspensos por nº de lista: " 
                + Arrays.toString(suspensos));
        //Resumen de aprobados y suspensos
        int i = 0;
        int x = 0;
        int[] a = new int[countAprobados];
        int[] s = new int[countSuspensos];
        while(i < aprobados.length){
            if(aprobados[i] != 0){
                a[x] = aprobados[i];
                i++;
                x++;
            }else{ i++; }
        }
        
        i = x = 0;
        while(i < suspensos.length){
            if(suspensos[i] != 0){
                s[x] = suspensos[i];
                i++;
                x++;
            }else{ i++; }
        }
        System.out.println("Resumen  de aprobados por nº de lista: " 
                + Arrays.toString(a));
        System.out.println("Resumen  de aprobados por nº de lista: " 
                + Arrays.toString(s));
    
        /*6. Suponer un vector de Calificaciones de tamaño 40 
        (máximo de alumnos por clase), pero que solo almacena las
        notas de 31 alumnos. Realizar un programa que permita insertar en
        la posición 4 del vector la calificación de un nuevo 
        alumno en clase al que supuestamente le corresponde como nota un 6.*/
        double[] calif = new double[40];
        for (int j=0; j<31; j++){
            calif[j] = (int)(Math.random()*11);
        }
        System.out.println("Nota antigua alumno nº4: " + calif[3]); 
        calif[3] = 6;
        System.out.println("Nota nueva   alumno nº4: " + calif[3]);
    }
    
	public static Integer[] crearNotasAleatorias(int num) {

		Integer[] salida = new Integer[num];
		
		for (int i = 0; i < salida.length; i++) {
			
			salida[i] = (int) (Math.random() * 11);
			
		}
		
		return salida;

	}
	
	public static int buscarMaxMin(boolean maximo, int postEval, Integer[] control) {
	    
		int nota=0;
		
        for(int i=0; i<control.length; i++){
            int preEval = control[i];
            if ((preEval < postEval)&&maximo||(preEval > postEval)&&!maximo){
                nota = preEval;
                postEval = control[i];
            }
        }
        
        return nota;

    }
	
}
