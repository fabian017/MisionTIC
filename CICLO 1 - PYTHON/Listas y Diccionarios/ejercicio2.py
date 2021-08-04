'''Diseñe un algoritmo que pida un número al usuario un número de mes(por ejemplo, el 5) y 
diga cuántos días tiene(por ejemplo, 31)y el nombre del mes.
Debes usar listas. Para simplificarlo vamos a suponer que febrero tiene 28 días'''

meses = ["enero","Febrero","Marzo","Abril", "Mayo", "Junio", "Julio", "Agosto", 
"Septiembre", "Octubre", "Noviembre", "Diciembre"]
dias = [31,28,31,30,31,30,31, 31, 30,31,30,31]
while True:
    mes = int(input("Digite el mes (1-12): "))
    while mes < 1 and mes > 12:
        mes = int(input("Valor incorecto, Digite el mes (1-12)"))
    if mes >= 1 and mes <= 12:
        print(f"El mes {mes} es: {meses[mes-1]} tiene {dias[mes-1]}")
    elif mes == 0:
        break

