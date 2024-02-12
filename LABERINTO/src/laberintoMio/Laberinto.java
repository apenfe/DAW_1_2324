package laberintoMio;

import java.util.ArrayList;
import java.util.Arrays;

public class Laberinto{
	
	// Para laberintos de una sola solucion:
	/*
	 * 1º metodo sin salida
	 * 2º busco nodos
	 * si no tengo nodos, cojo casillas en blnaco y es el camino
	 * si tengo nodos, no hay una unica solcion ----> buscar otro metodo
	 * en otro caso, es posible que no tenga una solucion
	 * 
	 */
	
	// Para laberintos con mas de una solucion:
	/*
	 * 1º llamada desde el caso anterior con un laberinto ya simplificado
	 * 2º algoritmo de primer camino mejorado, haciendo uso de backtrack, que de prioridad hacia la direccion mas propicia
	 */
	
	/*
	 * Si se pide la solucion mas corta...
	 */
	
	private int[][] control = new int[0][0];
	private int[][] casillas = new int[0][0];
	private int[] entrada = new int[2];
	private int[] salida = new int[2];
	
	public Laberinto() {
		
	}
	
	public Laberinto(int ie, int je, int is, int js, int[][] laberinto) {
		
		casillas = laberinto;
		control = new int[casillas.length][casillas[0].length];
		
		entrada[0] = ie;
		entrada[1] = je;
		
		salida[0] = is;
		salida[1] = js;
		
		for (int i = 0; i < casillas.length; i++) {
			
			for (int j = 0; j < casillas[0].length; j++) {
				
				if(laberinto[i][j]==1) {
					
					control[i][j]=1;
					
				}else {
					
					control[i][j]=0;
					
				}
				
			}
			
		}
		
	}
	
	public Laberinto(int[][] laberinto) {
		
		casillas = laberinto;
		control = new int[casillas.length][casillas[0].length];
		
		do {
			
			entrada[0] = (int) (Math.random() * casillas.length-1) + 1;
			entrada[1] = (int) (Math.random() * casillas[0].length-1) + 1;
			salida[0] = (int) (Math.random() * casillas.length-1) + 1;
			salida[1] = (int) (Math.random() * casillas[0].length-1) + 1;
			
			if(casillas[entrada[0]][entrada[1]]==0&&casillas[salida[0]][salida[1]]==0) {
				break;
			}
			
			
		}while(true);
		
		for (int i = 0; i < casillas.length; i++) {
			
			for (int j = 0; j < casillas[0].length; j++) {
				
				if(laberinto[i][j]==1) {
					
					control[i][j]=1;
					
				}else {
					
					control[i][j]=0;
					
				}
				
			}
			
		}
		
	}
	
	public ArrayList<Integer[]> obtenerNodosTotales(){
		
		ArrayList<Integer[]> nodos = new ArrayList<Integer[]>();
		
		for (int i = 0; i < control.length; i++) {
			
			for (int j = 0; j < control[0].length; j++) {
				
				if(esNodo(i,j)) {
					Integer[] nodo = new Integer[2];
					nodo[0]=i;
					nodo[1]=j;
					nodos.add(nodo);
					
				
				}
				
			}
			
		}
		
		return nodos;
	}
	
	public void imprimirLaberinto(boolean laberinto) {
		
		if(laberinto) {
			
			for (int i = 0; i < casillas.length; i++) {
				
				System.out.print("\t");
				
				for (int j = 0; j < casillas[0].length; j++) {
					
					boolean check = true;
					
					if(i==entrada[0]&&j==entrada[1]) {
						System.out.print("E ");
						check=false;
					}else if(i==salida[0]&&j==salida[1]) {
						System.out.print("S ");
						check=false;
					}
					
					if(check) {
						
						if(casillas[i][j]==1) {
							System.out.print("# ");
						}else if(casillas[i][j]==0) {
							System.out.print("  ");
						}
						
					}
					
				}
				
				System.out.println();
			}
			
		}else {
			
			System.out.print("\t  ");
			
			for (int i = 0; i < casillas[0].length; i++) {
				System.out.print( i+" ");
			}
			
			System.out.println();
			
			for (int i = 0; i < casillas.length; i++) {
				
				System.out.print("\t" + i+" ");
				
				for (int j = 0; j < casillas[0].length; j++) {
					
					boolean check = true;
					
					//if(i==-1) {
					//	System.out.print(j+1+" ");
					//}
					
					if(i==entrada[0]&&j==entrada[1]) {
						System.out.print("E ");
						check=false;
					}else if(i==salida[0]&&j==salida[1]) {
						System.out.print("S ");
						check=false;
					}
					
					if(check) {
						
						if(control[i][j]==1) {
							System.out.print("# ");
						}else if(control[i][j]==0) {
							System.out.print("  ");
						}else if(control[i][j]==2) {
							System.out.print("* ");
						}
						
					}
					
				}
				
				System.out.println();
			}
			
		}
		
	}
	
	public boolean esNodo(int fila, int columna) { // si es casilla devuelve false, si es nodo devuelve true
		
		if(control[fila][columna]==0) {
			
			int cont =0;
			
			if(control[fila-1][columna]==0) {
				cont ++;
			}
			
			if(control[fila+1][columna]==0) {
				cont ++;
			}
			
			if(control[fila][columna-1]==0) {
				cont ++;
			}
			
			if(control[fila][columna+1]==0) {
				cont ++;
			}
			
			if(cont>=3) {
				
				return true;
				
			}else {
				return false;
			}
			
		}
		
		return false;
			
	}

	public int[][] getControl() {
		return control;
	}

	public void setControl(int[][] control) {
		this.control = control;
	}

	public int[][] getCasillas() {
		return casillas;
	}

	public void setCasillas(int[][] casillas) {
		this.casillas = casillas;
	}

	public int[] getEntrada() {
		return entrada;
	}

	public void setEntrada(int[] entrada) {
		this.entrada = entrada;
	}

	public int[] getSalida() {
		return salida;
	}

	public void setSalida(int[] salida) {
		this.salida = salida;
	}
	
	public int contarblancos() {
		
		int salida=0;
		
		for (int i = 0; i < casillas.length; i++) {
			
			for (int j = 0; j < casillas[0].length; j++) {
				
				if(control[i][j]==0) {
					salida++;
					
				}
				
			}
			
		}
		
		return salida;	
		
	}
	
	public void sinSalida() {
		
		for (int i = 1; i < casillas.length-1; i++) {
			
			for (int j = 1; j < casillas[0].length-1; j++) {
				
				if(control[i][j]==0) {
					
					int cont =0;
					
					if(control[i-1][j]==0) {
						cont ++;
					}
					
					if(control[i+1][j]==0) {
						cont ++;
					}
					
					if(control[i][j-1]==0) {
						cont ++;
					}
					
					if(control[i][j+1]==0) {
						cont ++;
					}
					
					if(cont<=1) {
						
						if(esentradaosalida(i, j)) {
							continue;
						}else {
							control[i][j]=1;
						}
						
					}else {
						
						continue;
					}
					
				}
				
			}
			
		}
		
	}
	
	public boolean esentradaosalida(int i, int j) {
		
		if(i==entrada[0] && j==entrada[1]) {
			return true;
		}
		
		if(i==salida[0] && j==salida[1]) {
			return true;
		}
		
		return false;
		
	}
	    
	public boolean avanzar(int i, int j) {

		if (i == salida[0] && j == salida[1]) {
			return true;
		}
		
		if (control[i][j] == 1 || control[i][j] == 2) {
			return false; 
		}
		
		control[i][j] = 2;
								
		boolean result;
		
		result = avanzar(i, j+1);
		if (result) {
			return true;
		}
		
		result = avanzar(i-1, j);
		if (result) {
			return true;
		}
		
		result = avanzar(i, j-1);
		if (result) {
			return true;
		}
		
		result = avanzar(i+1, j);
		if (result) {
			return true;
		}
		
		control[i][j] = 0;
		return false;
	}
	
	public int[][] caminoMasCorto(int i, int j, int[][] check) {
		
		 int[][] mejorSolucion = Arrays.copyOf(check, check.length);
	     int pasosMax = Integer.MAX_VALUE;

	     caminoMasCortoRec(0,i,j,check,mejorSolucion,pasosMax);

	     return mejorSolucion;

	}
	
	private void caminoMasCortoRec(int pasos, int i, int j, int[][] check, int[][] mejorSolucion, int pasosMax) {

        if (check[i][j] == 1 || check[i][j] == 2) {
            return; // Fuera de los límites o en una pared
        }

        if (i == salida[0] && j== salida[1]) {
            // Llegamos a la salida, actualizamos la mejor solución si es más corta
            if (pasos < pasosMax) {
                pasosMax = pasos;
                
                for (int k = 0; k < check.length; k++) {
                    mejorSolucion[k] = Arrays.copyOf(check[k], check[k].length);
                }
              
            }
            return;
        }

        // Marcar la posición actual como visitada
        check[i][j] = 2;

        // Explorar las cuatro direcciones posibles
        caminoMasCortoRec(pasos + 1, i - 1, j, check, mejorSolucion, pasosMax);
        caminoMasCortoRec(pasos + 1, i + 1, j, check, mejorSolucion, pasosMax);
        caminoMasCortoRec(pasos + 1, i, j - 1, check, mejorSolucion, pasosMax);
        caminoMasCortoRec(pasos + 1, i, j + 1, check, mejorSolucion, pasosMax);

        // Desmarcar la posición actual para retroceder
        check[i][j] = 0;
    }


	
}