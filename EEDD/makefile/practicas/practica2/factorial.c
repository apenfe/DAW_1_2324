#include "factorial.h"

int factorial(int n) {
    int c, result = 1;
    for (c = 1; c <= n; c++) {
        result = result * c;
    }
    return (result);
}


