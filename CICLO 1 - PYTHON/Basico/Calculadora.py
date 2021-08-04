print("Calculadora RETO1")
print("¿Que operacion quieres hacer? \n1. Suma \n2. Resta \n3. Multiplicacion \n4. Divsion")
opcion=int(input("Digite la ocpión: "))
while opcion<1 or opcion>4:
    print("Opcion inválida")
    opcion=int(input('Digite una opcion correcta'))
if opcion==1:
    numero1=int(input("Digite el numero 1: "))
    numero2 = int(input("Digite el numero 2: "))
    suma = numero1 + numero2
    print(f'La suma es: {suma}')
elif opcion == 2:
    numero1 = int(input("Digite el numero 1: "))
    numero2 = int(input("Digite el numero 2: "))
    resta = numero1 - numero2
    print(f'La resta es: {resta}')
elif opcion == 3:
    numero1 = int(input("Digite el numero 1: "))
    numero2 = int(input("Digite el numero 2: "))
    multiplicacion = numero1 * numero2
    print(f'La multiplicacion es: {multiplicacion}')
elif opcion == 4:
    numero1 = int(input("Digite el numero 1: "))
    numero2 = int(input("Digite el numero 2: "))
    division = numero1 / numero2
    print(f'La division es: {division}')




