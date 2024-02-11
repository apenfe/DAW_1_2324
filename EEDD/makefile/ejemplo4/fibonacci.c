#include "fibonacci.h"

int fibonacci(int pos){

    int penultimo =0;
    int ultimo =1;
    int actual=0;

    if(pos==1){
        actual=1;
    }

    for(int i=2; i<=pos; i++){
        actual=ultimo+penultimo;
        penultimo=ultimo;
        ultimo=actual;
    }

    return actual;

}
