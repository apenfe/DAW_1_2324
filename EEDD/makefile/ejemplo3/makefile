OPCIONES = -g -Wall #variable
OPCIONSALIDA = -o
OBJETIVOS = programa

programa: Ejemplo01.c
	gcc $< $(OPCIONES) $(OPCIONSALIDA) $@
	./programa

clean:
	rm $(OBJETIVOS)
