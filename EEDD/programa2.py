# Un programa que pida 10 números, los ordene de menor a mayor y los muestre por la salida de consola.
# Después, deberá preguntar al usuario si quiere o no repetir el proceso para volver a pedir números o finalizar.

aux=0
booleano=True

while booleano:

    numeros=[]
    print("A continuación deberá introducir 10 números: ")

    for i in range(10):

        print("Escriba el número ",i+1,": ", end="")
        a=int(input())
        numeros.append(a) 

    for m in range(10):
        for n in range(9):

            if numeros[n]>numeros[n+1]:
                aux = numeros[n]
                numeros[n] = numeros[n+1]
                numeros[n+1] = aux

    print(" ")

    for j in range(10):
        print(" ", numeros[j], end="" )

    print(" ")
    print("¿Desea ordenar otros 10 números? S/N ",end="")
    b=input()

    if b == "s":
        booleano=True
        print(" ")
    else:
        booleano=False

                