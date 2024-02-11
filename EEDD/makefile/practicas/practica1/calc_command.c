/* calc_command.c */
/* Calculadora para calcular 2 operandos */
#include <stdio.h>
#include <stdlib.h>
#include "calcular.h"

int main(int argc, char **argv ) { 
  int a, b;
  char op;

  sscanf(argv[1], "%i", &a);
  sscanf(argv[2], "%i", &b);
  sscanf(argv[3], "%c", &op);

  switch (op) { 
  case '+':
    printf("%d %c %d = %f\n", a, op, b, add(a,b));
    break;
  case '-':
    printf("%d %c %d = %f\n", a, op, b, sub(a,b));
    break;
  case 'x':
    printf("%d %c %d = %f\n", a, op, b, mult(a,b));
    break;
  case '/':
    printf("%d %c %d = %f\n", a, op, b, divi(a,b));
    break;
  default: printf("Uso: calc_command numero1 numero2 operador\n"); 
    exit(0);
  }
  return 0;
}
