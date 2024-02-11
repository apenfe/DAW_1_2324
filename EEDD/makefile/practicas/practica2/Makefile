#variables
CC = gcc
OPCIONES = -o 
OBJETIVOS = entrada.o imprime.o factorial.o main.o
LIBRERIA = entrada.c imprime.c factorial.c 
PRINCIPAL = main.c
EXE = main

main: $(OBJETIVOS)
	
	$(CC) $(OBJETIVOS) $(OPCIONES) $(EXE)

calcular.o: $(LIBRERIA)
	
	$(CC) -c $(LIBRERIA)

main.o: $(LIBRERIA)
	
	$(CC) -c $(PRINCIPAL) 

.PHONY: cleano cleanexe cleanall

cleano:
	rm -f $(OBJETIVOS)

cleanexe:
	rm -f $(EXE)

cleanall: cleano cleanexe
