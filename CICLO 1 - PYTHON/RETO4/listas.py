def menu():
    print()
    print("-- MENU --\nBienvenido al menú de listas:")
    print("1. Contar\n2. Modificar\n3. Eliminar\n4. Mostrar\n5. Agregar\n6. Terminar")
    opcion = int(input("¿Que opción desea ejecutar?: "))
    while opcion < 1 or opcion > 6: # Comprueba que la opcion sea posible
        opcion = int(input("Opción Inválida, ¿Que opción desea ejecutar?: "))
    if opcion == 1:
        contar = input("¿Que palabra desea contar?: ").title()
        while palabra not in lista: # Verifica que la palabra este en la lista
            contar = input("Valor inválido, digite otra palabra: ").title()
        print(f"La palabra '{contar}' se repite {lista.count(contar)} veces")
        menu()
    elif opcion == 2:
        elemento = input("La palabra que desea reemplazar es: ").title()
        while elemento not in lista:  # Verifica que la palabra este en la lista
            elemento = input("Valor inválido, digite otra palabra: ").title()
        reemplazar = input("La nueva palabra es: ").title()
        print()
        for indice, valor in enumerate(lista):
            if valor == elemento: # Encuentra la palabra a reemplazar
                lista[indice] = reemplazar
        print(lista)
        menu()
    elif opcion == 3:
        borrar = input("¿Que palabra desea elminar de la lista: ").title()
        while borrar in lista:  # Verifica que la palabra este en la lista
            lista.remove(borrar)
            print()
        print(lista)
        menu()
    elif opcion == 4:
        for i in lista:
            print(i)
        menu()
    elif opcion == 5:
        mas = input("Palabra que quiere agregar: ").title()
        lista.append(mas)
        print()
        print(lista)
        menu()
    elif opcion == 6:
        terminar = input("¿Esta seguro de terminar el programa?: ").upper()
        if terminar == "SI" or terminar == "S":
            print("Ha terminado la actividad")
        else:
            menu()


if __name__ == "__main__":
    estudiante = "Jose Fabian Jimenez Ovalle G-27"
    print (estudiante.center(50,"-"))
    print("Reto 4")
    lista = []
    n = 1
    añadir = input("¿Desea añadir una palabra a la lista?").upper()
    while añadir == "SI" or añadir == "S": # Ciclo para añadir las palabras
        palabra = input(f"Digite la palabra {n}: ").title()
        lista.append(palabra) # Agrega la palabra a lista
        n += 1
        añadir = input("¿Desea añadir una palabra a la lista?").upper()
    print()
    print(lista)
    menu()



    



