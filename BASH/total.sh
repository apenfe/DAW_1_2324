#!/bin/bash

#Segundo script: crea un script llamado total.sh que reciba una serie de parametros, te muestre el numero total de parametros
# y te muestra cada uno por pantalla, uno por linea.

total_parametros=$#

echo "numero total de parametros: $total_parametros"

for parametro in "$@"; do

echo "$parametro"

done

#OTRA FORMA

echo "numero $#"

while [ $# -ne 0 ]
do

echo $1
shift

done