
print("A continuación deberá de introducir 10 números:")
numeros=[]

for i in range(10):

    print("Escriba el número ",i+1,": ", end="")
    a=int(input())
    numeros.append(a) 

mayor=numeros[1]
menor=mayor

for i in range(10):

    if(numeros[i]>mayor):
        mayor=numeros[i]
    if(numeros[i]<menor):
        menor=numeros[i]

print(" ")
print("El número mayor es ",mayor, end="")
print(" ")
print("El número menor es ",menor, end="")
