#include <stdio.h>
#include "entrada.h"

char *solicita_cadena(char *prompt, char *vcadena) {
    printf("%s\n",prompt);
    fgets(vcadena, 255, stdin);
    
    return(vcadena);

}
