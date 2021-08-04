# Juan Carlos Jimenez

def años(matricula, edad):
    #CALCULAR DESCUENTO POR EDAD
    if edad >= 15 and edad <= 18:
        descuentoEdad = (matricula*25)/100
    elif edad >= 19 and edad <= 21:
        descuentoEdad = (matricula*15)/100
    elif edad >= 22 and edad <= 25:
        descuentoEdad = (matricula*10)/100
    elif edad > 25:
        descuentoEdad = 0
    print(f"Descuento por edad: {descuentoEdad} COP")
    return descuentoEdad

def puntaje(matricula, examen):
    #CALCULAR DESCUENTO POR PUNTAJE DE EXAMEN
    if examen >= 80 and examen < 86:
        descuentoExamen = (matricula*30)/100
    elif examen >= 86 and examen < 91:
        descuentoExamen = (matricula*35)/100
    elif examen >= 91 and examen < 96:
        descuentoExamen = (matricula*40)/100
    elif examen >= 91 and examen < 96:
        descuentoExamen = (matricula*40)/100
    elif examen >= 96:
        descuentoExamen = (matricula*45)/100
    else:
        descuentoExamen = 0
    print(f"Descuento por puntaje de examen: {descuentoExamen} COP")
    return descuentoExamen

def ingreso(matricula, ingFamiliar):
    #CALCULAR EDAD POR INGRESO FAMILIAR
    if ingFamiliar<=1:
        descuentoIng = (matricula*30)/100
    elif ingFamiliar > 1 and ingFamiliar <= 2:
        descuentoIng = (matricula*20)/100
    elif ingFamiliar > 2 and ingFamiliar <= 3:
        descuentoIng = (matricula*10)/100
    elif ingFamiliar > 3 and ingFamiliar <= 4:
        descuentoIng = (matricula*5)/100
    elif ingFamiliar > 4:
        descuentoIng = 0
    print(f"Descuento por ingreso familiar: {descuentoIng} COP")
    return descuentoIng


def total():
    nombreCompleto = input("Digite su nombre completo: ").title()
    edad = int(input("Digite su edad: "))
    while edad <= 14:
        edad = int(input("VALOR INVÁLIDO. Digite su edad: "))
    matricula = int(input("Digite el valor de la matricula COP: "))
    while matricula < 0:
        matricula = int(
            input("VALOR INVÁLIDO. Digite el valor de la matricula COP: "))
    examen = int(input("Digite el porcentaje obtenido en el examen: "))
    while examen < 0 or examen > 100:  # Verifica que el puntaje sea válido
        examen = int(
            input("VALOR INVÁLIDO. Digite el porcentaje obtenido en el examen: "))
    ingFamiliar = float(
        input("Digite el numero de SMV de su ingreso familiar: "))
    while ingFamiliar < 0:
        ingFamiliar = float(
            input("VALOR INVÁLIDO. Digite el numero de SMV de su ingreso familiar: "))
    print(f"\nNombre completo: {nombreCompleto}")
    descuentoTotal = años(matricula, edad) + puntaje(matricula, examen) + ingreso(matricula, ingFamiliar)
    print(f"Descuento total: {descuentoTotal} COP")
    otraVez = input("\n¿Desea calcular descuento de nuevo? [si] o [no] ").upper()
    if otraVez == "SI" or otraVez == "S":
        print()
        total()
    elif  otraVez != "SI" or otraVez != "S":
        print(f"{nombreCompleto}, se ha terminado el programa.")

if __name__ == "__main__":
    total()

