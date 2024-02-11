#include <stdlib.h>
#include "entrada.h"
#include "imprime.h"
#include "factorial.h"

int main(void) {
    char *cadena;

    cadena = malloc(255 * sizeof(char));
    solicita_cadena("Introduzca cadena: ",cadena);
    imprime(factorial(3),cadena);
     
    free(cadena);

    return(0);
}
