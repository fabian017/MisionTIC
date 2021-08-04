''' Escribe un programa python que pida un número por teclado y que cree un
diccionario cuyas claves sean desde el número 1 hastael número indicado, y
los valores sean los cuadrados de las claves. '''
numeros = []
valor = int(input("Digite un numero limite: "))
for numero in range(1,valor+1):
    numeros.append([numero, numero**2])#Crea sublistas con el numero y su cuadrado
diccionario = dict(numeros) # Convierte las sublistas en claves y valores
print(diccionario)
