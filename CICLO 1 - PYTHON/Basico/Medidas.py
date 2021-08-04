print("Programa convierte una medida de pies a yardas, pulgadas, centimetros y metros")
pies = float(input("ingrese la medida en pies 'ft': "))
pulgadas = pies*12
metros = pies*12*2.54/100
centimetros = pies*12*2.54
yardas = pies/3
print(f'{pies} pies metros es: {metros}')
print(f'{pies} pies en centimetros es: {centimetros}')
print(f'{pies} pies en yardas es: {yardas}')
print(f'{pies} pies en pulgadas es: {pulgadas}')
