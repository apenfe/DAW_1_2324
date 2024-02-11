/* calc_interactive.c */
/* Computes an operation with 2 numbers */
#include <stdio.h>
#include "calcular.h"

int RequestData(int *a,int *b,char *op)
{ 
  char trash;
  printf("Introduce el primer numero: \n");
  scanf("%d",a);
  printf("Introduce el segundo numero: \n");
  scanf("%d",b);
  /* remove new linea character (\n) */
  scanf("%c",&trash);
  printf("Introduce la operación a realizar (+,-,x,/):\n");
  scanf("%c",op);
  return 0;
}

int main(void) { 
  int a, b;
  char op;
  
  RequestData(&a,&b,&op);

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
  default:
    printf("Operacion no permitida.\n"); 
    return(0);
  }

}
