def ordenar(lista):
    lista.sort()
    for i in lista:
       print(i)

if __name__ == "__main__":
    print("Ordenar numeros")
    lista=[]
    numero1 = int(input("Ingresar un numero"))
    lista.append(numero1)
    numero2 = int(input("Ingresar un numero"))
    lista.append(numero2)
    print("numeros en orden: \n",ordenar(lista))

#len(v_password)*'*'


'''while True:
... try:
...         x = int(input("Please enter a number: "))
... break
... except ValueError:
... print("Oops!  That was no valid number.  Try again...")'''

'''
while True:
... try:
...         x = int(input("Please enter a number: "))
... break
... except ValueError:
... print("Oops!  That was no valid number.  Try again...")'''
