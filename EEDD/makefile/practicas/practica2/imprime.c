#include <stdio.h>
#include "imprime.h"

void imprime(int nveces, char *cadena) {
    int i;

    for(i=1;i <= nveces; i++) {
        printf("##%s", cadena);
    }

}


