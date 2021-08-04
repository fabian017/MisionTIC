def ordenamientoPorInsercion(lista):
   for i in range(1,len(lista)):
     valorActual = lista[i]
     posicion = i
     while posicion>0 and lista[posicion-1]>valorActual:
         lista[posicion]=lista[posicion-1]
         posicion = posicion-1
     lista[posicion]=valorActual

lista = [54,26,93,17,77,31,44,55,20]
ordenamientoPorInsercion(lista)
print(lista)