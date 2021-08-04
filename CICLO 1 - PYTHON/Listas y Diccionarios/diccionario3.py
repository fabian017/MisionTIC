"""Codifica un programa en python que nos permita guardar los nombres de los
alumnos de una clase y las notas que han obtenido.Cada alumno puede tener
distinta cantidad de notas. Guarda la información en un diccionario cuya
claves serán los nombres de los alumnos y los valores serán listas con las
notas de cada alumno.
El programa pedirá el número de alumnos que vamos a introducir, pedirá su
nombre e irá pidiendo sus notas hasta que introduzcamos un número
negativo. Al final el programa nos mostrará la lista de alumnos y la nota
"""
registro ={}
titulo = "Programa que guarda notas"
print(titulo.center(50," "))
estudiantes = int(input("¿Cuantos estudiantes estan registrados? "))
for estudiante in range(1,estudiantes+1):
    nombre = input(f"Nombre de estudiante {estudiante}: ").title()
    while nombre in registro:
        nombre = input(f"Estudiante registrado, ingrese otro estudiante {estudiante}: ").title()
    notas = []
    n = 1
    nota = float(input(f"Digite nota {n}: "))
    while nota > 0 and nota <=10:
        n += 1
        notas.append(nota)
        nota = float(input(f"Digite nota {n}: "))
        if nota < 0:
            # termina el while y vuelve al for
            continue
    notas.append(['media',sum(notas)/len(notas)])
    registro[nombre] = notas # Guarda la lista de notas
    print()
print()
for i in registro: # imprime el diccionario en vertical
    print(f"{i}: {registro[i]}")


    '''while True:
        nota = float(input(f"Digite nota {i}: "))
        while nota > 10:
            nota = float(input(f"Inválido, Digite nota {i}: "))
        notas.append(nota)
        i +=1
        registro[nombre] = notas
        if nota < 0:
            print(registro)
            print("fin del programa")
            break
        else:
            continue'''


