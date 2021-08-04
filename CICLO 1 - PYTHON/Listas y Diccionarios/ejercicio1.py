'''(comprendidas entre 0 y 10). Acontinuación, debe mostrar todas las notas, la
nota media, la nota más alta que ha sacado y la menor.
'''
notas = []
for indice in range(0,5):
    nota = float(input(f"Dgite la nota {indice+1}: "))
    while nota < 0 or nota > 10:
        nota = float(input(f"Valor incorrecto, Digite la nota {indice+1}: "))
    if nota >= 0 and nota <= 10:
        notas.append(nota)

for i in notas: # Imprimir en vertical
    print(i)

media = sum(notas)/len(notas)
maxima = max(notas)
minima = min(notas)

print(f"La nota maxima es: {maxima}")
print(f"La nota minima es: {minima}")
print(f"El promedio es: {media}")

