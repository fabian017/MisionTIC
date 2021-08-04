#JUAN CARLOS JIMENEZ
diccionario = {}
i = 0
errorMin = 0
errorMax = 0
errorAmbas = 0
promedioMin = 0
promedioMax = 0
sumaMin = 0
sumaMax = 0
while True:
    temperatura = []
    i += 1
    tmin = int(input(f"\nDIA {i} --> Digite la temperatura minima: "))
    tmax = int(input(f"DIA {i} --> Digite temperatura maxima: "))
    while tmax < tmin:
        tmax = int(input(
            "La temperatura maxima no puede ser menor que la temperatura minima. Digite temperatura maxima: "))
    sumaMin += tmin
    sumaMax += tmax
    if tmin == 0 and tmax == 0:
        if i == 1:
            print("No hay salida de campo")
        elif i > 1:
            print("\nSe Ha terminado la entrada de datos.")
            print("\n       tMin tMax")
            for d in diccionario:
                print(f"{d}: {diccionario[d]}")
            print(f"\nDuracion de la salida de campo: {i-1} dias")
            error= errorMax + errorMin + errorAmbas
            porcentajeError =  (error*100)/(i-1)
            promedioMin = sumaMin/(i-1)
            promedioMax = sumaMax/(i-1)
            print(f"Dias con error: {error}\nDias con temperatura menor a 5 grados: {errorMin}\nDias con temperatura mayor a 35 grados: {errorMax}")
            print(f"Dias con error en ambas temperaturas: {errorAmbas}")
            print(f"\nTemperatura minima promedio: {promedioMin}")
            print(f"Temperatura maxima promedio: {promedioMax}")
            print(f"\nError en {porcentajeError}% del total de dias de la salida de campo.")
            break
    if tmin < 5 and tmax > 35:
        errorAmbas += 1
        sumaMax -= tmax
        sumaMin -= tmin
    elif tmin < 5:
        errorMin += 1
        sumaMin -= tmin
    elif tmax > 35:
        errorMax += 1
        sumaMax -= tmax
    temperatura.append(tmin)
    temperatura.append(tmax)
    dia = f"Dia {i}"
    diccionario[dia] = temperatura






