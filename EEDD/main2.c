/* 
* main2.c
*  
*  pida un texto al usuario, cuente la cantidad de palabras de las que se compone el texto
*  y muestre la cantidad por la salida de consola. También deberá mostrar cada una de las 
*  palabras en líneas diferentes, una debajo de otra.
*
* Adrián Peñalver Fernández
*
* 21/10/2023
*/

#include<stdio.h> // printf
#include <string.h>

int aux = 0;
char frase[150];

int main(){

    printf("A continuacion debera introducir una frase: ");
    scanf("%[^\n]s",&frase);

    for(int i=0 ; i<strlen(frase) ; i++){

        if(frase[i]!=' '){
            printf("%c",frase[i]);

            if(i==strlen(frase)-1 && frase[strlen(frase)-1]!=' '){
            aux++;
            }

        }else{

            if(frase[i-1]!=' '){
                printf("\n");
                aux++;
            }
            if(i==0 && frase[0]==' '){
                aux--;
            }
        }
    }

    printf("\n");

    printf("Se han contado un total de %d palabras.",aux);
    
return 0;

}