def ordenamientoPorSeleccion(lista):
   for i in range(len(lista)-1, 0, -1):
       mayor = 0
       for posicion in range(1, i+1):
           if lista[posicion] > lista[mayor]:
               mayor = posicion
       cont = lista[i]
       lista[i] = lista[mayor]
       lista[mayor] = cont


lista = [54, 26, 93, 17, 77, 31, 44, 55, 20]
ordenamientoPorSeleccion(lista)
print(lista)
