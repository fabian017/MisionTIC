print("Conversor de monedas a Dólar")
print("Las monedas a convertir son las siguientes: \n1. COL a USD")
print("2. ARG a USD")
print("3. MEX a USD")
moneda = int(input("Digite la moneda que desea convertir: "))
while moneda<=0 or moneda>3: # ASEGURA QUE LA OPCION SEA CORRECTA
    moneda= int(input("Conversión NO posible, Ingrese un valor correcto: "))
cantidad = float(input("Ingrese la cantidad que desea convertir: "))
if moneda==1:
    resultado = cantidad/3685.51
    print(f"{cantidad} pesos COL equivale a: {resultado} dólares USD.")
elif moneda==2:
    resultado = cantidad/94.06
    print(f"{cantidad} pesos ARG equivale a: {resultado} dólares USD. ")
elif moneda==3:
    resultado = cantidad/19.78
    print(f"{cantidad} pesos MEX equivalen a: {resultado} dólares USD.")

#HACER NUEVA CONVERSION
repetir = input("¿Desea hacer una nueva conversion? ")
while repetir.upper() == "SI" or repetir.upper() == "S":
    print("Conversor de monedas a Dólar")
    print("Las monedas a convertir son las siguientes: \n1. COL a USD")
    print("2. ARG a USD")
    print("3. MEX a USD")
    moneda = int(input("Digite la moneda que desea convertir: "))
    while moneda <= 0 or moneda > 3:
        moneda = int(input("Conversión NO posible, Ingrese un valor correcto: "))
    cantidad = float(input("Ingrese la cantidad que desea convertir: "))
    if moneda == 1:
        resultado = cantidad/3685.51
        print(f"{cantidad} pesos COL equivale a: {resultado} dólares USD.")
    elif moneda == 2:
        resultado = cantidad/94.06
        print(f"{cantidad} pesos ARG equivale a: {resultado} dólares USD. ")
    elif moneda == 3:
        resultado = cantidad/19.78
        print(f"{cantidad} pesos MEX equivalen a: {resultado} dólares USD.")
    repetir = input("¿Desea hacer otra conversion? ")
if repetir.upper() != "SI" or repetir.upper() !="S":
    print("Espero haber sido de gran ayuda :D")


