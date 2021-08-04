'''Escribir un programa que implemente una agenda. En la agenda se podrán
guardar nombres y números de teléfono. 
'''

def agenda():
    print("\nAGENDA VIRTUAL\n1. Añadir/Modificar\n2. Buscar")
    print("3. Borrar\n4. Listar")
    opcion = int(input("Digite una opcion: "))
    while opcion < 1 or opcion > 4:  # Comprueba que la opcion sea posible
        opcion = int(input("Opción Inválida, Digite una opcion: "))
    if opcion == 1:
        modificar = input("Ingrese un nombre: ").title()
        if modificar in diccionario:
            print(f"{modificar}: {diccionario[modificar]}")
            tel = input("¿Desea actualizar su telefono? ").upper()
            if tel == "S" or tel == "SI":
                contacto = input("Ingrese el numero de telefono: ")
                diccionario.update({modificar: contacto})
                print(f"\nActualizacion\n{modificar}: {diccionario[modificar]}")
            else:
                print(f"{modificar}: {diccionario[modificar]}")
        elif modificar not in diccionario:
            contacto = input("Ingrese el numero de telefono: ")
            diccionario[modificar] = contacto
            # imprime el contacto de la agenda
            print(f"\nNUEVO: {modificar} --> {diccionario[modificar]}")
        agenda()
    elif opcion == 2:
        buscar = input("Ingrese un nombre: ").title()
        for i in diccionario:  # imprime los contactos con ese nombre
            cadena = i
            if buscar in cadena:  # imprime los contactos con ese nombre
                print(f"\nBUSQUEDA: {i} --> {diccionario[i]}")
            else:
                print("No hay ningun contacto con ese nombre")
        agenda()
    elif opcion == 3:
        borrar = input("ingrese un nombre: ").title()
        if borrar in diccionario:
            rta = input("¿Desea borrar el contacto?: ").upper()
            if rta == "SI" or rta =="S":
                diccionario.pop(borrar)
                print("Contacto borrado")
        agenda()
    elif opcion == 4:
        print()
        for i in diccionario:
            print(f"{i}: {diccionario[i]}")
        agenda()



if __name__ == '__main__':
    print("Jose Fabian Jimenez Ovalle G-27")
    diccionario = {}
    agenda()


