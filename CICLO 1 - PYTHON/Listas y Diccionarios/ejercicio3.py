'''Diseñar un programa que tenga los siguientes requerimientos:
Crea una tabla(lista con dos dimensiones) de 5x5 enteros.
Carga la tabla con valores numéricos enteros.
Suma todos los elementos de cada fila y todos los elementos de cada columna
visualizando los resultados en pantalla.'''

lista = []

#Llenar la lista
for ext in range(5):
    lista.append([])
    for inte in range(5):
        valor = int(input(f"fila {ext+1}, columna {inte+1}: "))
        lista[ext].append(valor)
# crea matriz 5x5 con valores de 0 a 4
# mtx = [list(range(5)) for _ in range(5)]
print()
for fila in lista: # Imprimir la lista en forma de matriz
    print("[", end="")
    for i in fila:
        print(f"{i:5}", end="  ")
    print(f"  ]")
print()


for ext in range(5): # Sumar las filas
    for inte in lista[ext]:
        continue
    print(f"La suma de la fila {ext+1} es: {sum(lista[ext])}")
print()

for ext in range(5):
    suma = 0
    for inte in range(5):
        suma += lista[inte][ext]
    print(f"La suma de la columna {ext+1} es: {suma}")
print("hola")




    


