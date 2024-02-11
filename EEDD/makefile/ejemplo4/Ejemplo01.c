#include <stdio.h>
#include "fibonacci.h"

int main(){

printf("INICIO DEL PROGRAMA\n");

    printf("INTRODUCE UNA POSICION EN LA SECUENCIA DE FIBONACCI: ");
    int posicion;
    scanf("%d",&posicion);

    int resultado = fibonacci(posicion);
    printf("El valor de la posición %d en la secuencia de fibonacci es %d",posicion,resultado);

printf("FIN DEL PROGRAMA\n");

return 0;
}
