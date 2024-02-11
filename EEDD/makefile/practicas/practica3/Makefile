#variables
CC = gcc
OPCIONES = -o 
OBJETIVOS = calcular.o calc_command.o calc_interactive.o
PROG1 = calcular.o calc_command.o
PROG2 = calcular.o calc_interactive.o
LIBRERIA = calcular.c
PRINCIPAL1 = calc_command.c
PRINCIPAL2 = calc_interactive.c
EXE1 = calc_command
EXE2 = calc_interactive

all: $(OBJETIVOS)
	
	$(CC) $(PROG1) $(OPCIONES) $(EXE1)
	$(CC) $(PROG2) $(OPCIONES) $(EXE2)

calcular.o: $(LIBRERIA)
	
	$(CC) -c $(LIBRERIA)

calc_command.o: $(LIBRERIA)
	
	$(CC) -c $(PRINCIPAL1) 

calc_interactive.o: $(LIBRERIA)
	
	$(CC) -c $(PRINCIPAL2) 

.PHONY: cleano cleanexe cleanall

cleano:
	rm -f $(OBJETIVOS)

cleanexe:
	rm -f $(EXE1)
	rm -f $(EXE2)

cleanall: cleano cleanexe
