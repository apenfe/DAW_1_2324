package Grafos;

import java.util.HashSet;

public class Laberinto {

	/*public static int mayorArea(int[][] matriz) { /// MAYOR AREA (SE DEDICA A INVOCAR METODOS PARA RESOLVER EL
													/// EJERCICIO) ///

		//int[] equipotenciales = buscarEquipotencial(matriz);
		int max = 0;

		for (int i = 0; i < equipotenciales.length; i++) {

			if (analizarEquipotenciales(matriz, equipotenciales[i]) > max) {
				max = analizarEquipotenciales(matriz, equipotenciales[i]);
			}
		}

		return max;
	}*/

	public static HashSet<Integer> buscarEquipotencial(int[][] matriz) { /// BUSCAR EQUIPOTENCIAL (SE DEDICA A BUSCAR NUMEROS DIFERENTES EN MATRIZ DADA) ///
		
		HashSet<Integer> numeros = new HashSet<Integer>();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {

				numeros.add(matriz[i][j]);

			}
		}

		return numeros;
	}

	public static void imprimeMatriz(int[][] matriz) { /// IMPRIME MATRIZ (SE DEDICA A IMPRIMIR MATRICES M*N) ///

		for (int i = 0; i < matriz.length; i++) {
			System.out.print("\n\t");
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}
	}
	
	public static void imprimeLaberinto(int[][] matriz,char pared, char pasillo) { /// IMPRIME MATRIZ (SE DEDICA A IMPRIMIR MATRICES M*N) ///

		for (int i = 0; i < matriz.length; i++) {
			System.out.print("\n\t");
			for (int j = 0; j < matriz[0].length; j++) {
				
				if(matriz[i][j]==0) {
					System.out.print(pasillo+" ");

				}else {
					System.out.print(pared+" ");

				}
				
			}
		}
	}

	/*public static int analizarEquipotenciales(int[][] matriz, int equipotencial) { /// ANALIZAR EQUIPOTENCIALES (ANALIZA
																					/// LOS EQUIPOTENCIALES RECIBIDOS)
																					/// ///

		int[][] control = new int[matriz.length][matriz[0].length];
		int maximo = -1, cont = 0; // cuando este dato salga debo volver a crear otro max para ver todos los
									// numeros analizados y dar el maximo real de todos.

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {

				if (matriz[i][j] == equipotencial && control[i][j] == 0) { // en este if debe permanecer hasta que no se
																			// acabe de analizar todas casillas
																			// adjuntas.

					control[i][j] = equipotencial;
					cont++;

					maxcont = -1;
					analizaAdyacentes(matriz, control, i, j, equipotencial, cont);
					cont = maxcont;

					if (cont > maximo) {
						maximo = cont;
					}

					cont = 0;
					maxcont = -1;
				}
			}
		}

		return maximo;
	}*/

	/*public static void analizaAdyacentes(int[][] matriz, int[][] control, int fila, int columna, int equipotencial,int cont) { /// ANALIZAR ADYACENTES (ANALIZA LAS CASILLAS ADYACENTES Y LAS SUMA) ///

		int[] candidatos = { -1, -1, -1, -1, -1, -1, -1, -1 };

		if (fila - 1 >= 0 && matriz[fila - 1][columna] == equipotencial && control[fila - 1][columna] == 0) { // Verificar
																												// el
																												// valor
																												// superior
																												// si
																												// existe

			candidatos[0] = fila - 1;
			candidatos[1] = columna;
			cont++;
			control[fila - 1][columna] = equipotencial;
		}

		if (fila + 1 < matriz.length && matriz[fila + 1][columna] == equipotencial && control[fila + 1][columna] == 0) { // Verificar
																															// el
																															// valor
																															// inferior
																															// si
																															// existe

			candidatos[6] = fila + 1;
			candidatos[7] = columna;
			cont++;
			control[fila + 1][columna] = equipotencial;
		}

		if (columna - 1 >= 0 && matriz[fila][columna - 1] == equipotencial && control[fila][columna - 1] == 0) { // Verificar
																													// el
																													// valor
																													// lateral
																													// izquierdo
																													// si
																													// existe

			candidatos[2] = fila;
			candidatos[3] = columna - 1;
			cont++;
			control[fila][columna - 1] = equipotencial;
		}

		if (columna + 1 < matriz[0].length && matriz[fila][columna + 1] == equipotencial
				&& control[fila][columna + 1] == 0) { // Verificar el valor lateral derecho si existe

			candidatos[4] = fila;
			candidatos[5] = columna + 1;
			cont++;
			control[fila][columna + 1] = equipotencial;
		}

		for (int i = 0; i < 8; i += 2) {

			if (candidatos[i] != -1) {

				if (cont > maxcont) {
					maxcont = cont;
				}
				analizaAdyacentes(matriz, control, candidatos[i], candidatos[i + 1], equipotencial, cont);
			}
		}
	}*/

}