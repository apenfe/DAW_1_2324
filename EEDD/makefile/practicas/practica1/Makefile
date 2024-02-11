#variables
CC = gcc
OPCIONES = -o 
OBJETIVOS = calcular.o calc_command.o
LIBRERIA = calcular.c 
PRINCIPAL = calc_command.c
EXE = calc_command

calc_command: $(OBJETIVOS)
	
	$(CC) $(OBJETIVOS) $(OPCIONES) $(EXE)

calcular.o: $(LIBRERIA)
	
	$(CC) -c $(LIBRERIA)

calc_command.o: $(LIBRERIA)
	
	$(CC) -c $(PRINCIPAL) 

.PHONY: cleano cleanexe cleanall

cleano:
	rm -f $(OBJETIVOS)

cleanexe:
	rm -f $(EXE)

cleanall: cleano cleanexe

