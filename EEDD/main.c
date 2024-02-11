/* 
* main.c
*  
* Ejecución de un programa similar a la práctica anterior (1.4.) que pida 10 números, los
* ordene de menor a mayor y los muestre por la salida de consola. Después, deberá preguntar
* al usuario si quiere o no repetir el proceso para repetir el proceso o finalizar.
*
* Adrián Peñalver Fernández
*
* 18/10/2023
*/

#include<stdio.h> // printf
#include<stdbool.h> // Booleanos

int aux = 0;
bool check = true;
int numeros[10];
char b;

int main(){

    while(check){

        printf("A continuacion debera introducir 10 numeros: \n");

        for(int i=0; i<10; i++){
            printf("Escriba el numero %d: ",(i+1));
            scanf("%d", &numeros[i]); 
        }

        for(int m=0 ; m<10 ; m++){
            for(int n=0 ; n<9 ; n++){

                if(numeros[n]>numeros[n+1]){
                    aux = numeros[n];
                    numeros[n] = numeros[n+1];
                    numeros[n+1] = aux;
                }
            }
        }

        printf("\n");

        for(int i=0; i<10; i++){
            printf("El numero en posicion %d es: ",(i+1));
            printf(" %d \n", numeros[i]);   
        }

        printf("\n");
        printf("Desea ordenar otros 10 numeros? S/N ");
        scanf(" %c", &b);

        if(b=='s'|| b=='S'){
            check=true;
            printf(" ");   
        }else{
            check=false;
        }
    }

return 0;

}