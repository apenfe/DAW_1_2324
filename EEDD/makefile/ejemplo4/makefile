#variables
CC = gcc
OPCIONES = -o 
OBJETIVOS = fibonacci.o Ejemplo01.o
LIBRERIA = fibonacci.c 
PRINCIPAL = Ejemplo01.c
EXE = programa

programa: $(OBJETIVOS)
	
	$(CC) $(OBJETIVOS) $(OPCIONES) $(EXE)
	./$(EXE)

fibonacci.o: $(LIBRERIA)
	
	$(CC) -c $(LIBRERIA)

Ejemplo01.o: $(LIBRERIA)
	
	$(CC) -c $(PRINCIPAL) 

.PHONY: cleano cleanexe cleanall

cleano:
	rm -f $(OBJETIVOS)

cleanexe:
	rm -f $(EXE)

cleanall: cleano cleanexe

