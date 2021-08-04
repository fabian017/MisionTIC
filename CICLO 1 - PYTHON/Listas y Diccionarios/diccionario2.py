'''Vamos a crear un programa en python donde vamos a declarar un diccionario
para guardar los precios de las distintas frutas. Elprograma pedirá el nombre
de la fruta y la cantidad que se ha vendido y nos mostrará el precio final de
la fruta a partir de los datos guardados en el diccionario. Si la fruta no existe
nos dará un error. Tras cada consulta el programa nos preguntará si
queremos hacer otra consulta
'''
mercado = {
    "fresa": 4600,
    "maracuya": 2500,
    "lulo": 1800,
    "fruta de dragon": 8000
}
while True:
    fruta = input("Digite la fruta: ").lower()
    while fruta not in mercado:
        fruta = input("No disponible, Digite otra fruta: ").lower()
    if fruta in mercado:
        cantidad = float(input("Cuantas libras desea llevar? "))
        print(f"EL precio de la {fruta} es: {cantidad*mercado[fruta]}")
    salir = input("¿Desea salir? ").upper()
    if salir != "S" or salir != "SI":
        continue
    elif salir == "S" or salir == "SI":
        print("Gracias por su compra!")
        break
