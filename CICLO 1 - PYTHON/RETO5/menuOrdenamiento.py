from datetime import datetime
import sys

# FUNCIONES
def ordenamientoInsercion(lista):
    inicio = datetime.now()
    for i in range(1, len(lista)):
        valorActual = lista[i]
        posicion = i
        while posicion > 0 and lista[posicion-1] > valorActual:
            lista[posicion] = lista[posicion-1]
            posicion = posicion-1
        lista[posicion] = valorActual
    print(f"La lista ordenada por el metodo de Insercion es: \n{lista}")
    print(f"Duracion: {datetime.now()- inicio}")

def ordenamientoSeleccion(lista):
    inicio = datetime.now()
    for i in range(len(lista)-1, 0, -1):
       mayor = 0
       for posicion in range(1, i+1):
           if lista[posicion] > lista[mayor]:
               mayor = posicion
       cont = lista[i]
       lista[i] = lista[mayor]
       lista[mayor] = cont
    print(f"La lista ordenada por el metodo de Seleccion es: \n{lista}")
    print(f"Duracion: {datetime.now()- inicio}")

def ordenamientoBurbuja(lista):
    inicio = datetime.now()
    for numPasada in range(len(lista)-1, 0, -1):
        for i in range(numPasada):
            if lista[i] > lista[i+1]:
                contador = lista[i]
                lista[i] = lista[i+1]
                lista[i+1] = contador
    print(f"La lista ordenada por el metodo Burbuja es: \n{lista}")
    print(f"Duracion: {datetime.now()- inicio}")

# MENU QUE IMPLEMENTA LAS FUNCIONES
def menu(lista):
    print("\nMENU DE ORDENAMIENTO  DE LISTAS")
    print("Estas son las opciones del menu de ordenamiento de listas: ")
    print("1. Burbuja\n2. Seleccion\n3. Insercion\n4. Salir")
    opcion = int(input("¿Que opcion eliges? "))
    while  opcion<1 or opcion>4:
        opcion = int(input("ENTRADA INVÁLIDA. ¿Que opcion eliges? "))
    if  opcion == 1:
        ordenamientoBurbuja(lista)
        menu(lista)
    elif opcion == 2:
        ordenamientoSeleccion(lista)
        menu(lista)
    elif opcion == 3:
        ordenamientoInsercion(lista)
        menu(lista)
    elif opcion == 4:
        print("Ha salido del menu")

#LLenar la lista
def llenarLista():
    lista = []
    tamano = int(input("¿Cuantos elementos tiene la lista? "))
    for i in range(1, tamano+1):
        elemento = int(input(f"Digite el elemento {i}: "))
        lista.append(elemento)
    menu(lista)


if __name__ ==  '__main__':
    print("Jose Fabian Jimenez Ovalle  G-27")
    print("RETO5")
    lista = []
    tamano = int(input("¿Cuantos elementos tiene la lista? "))
    for i in range(1, tamano+1):
        elemento = int(input(f"Digite el elemento {i}: "))
        lista.append(elemento)
    menu(lista)


