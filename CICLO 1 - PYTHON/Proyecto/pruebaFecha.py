from datetime import datetime
from datetime import timedelta

salario=1000000
fechaIng = '16/06/2020'
fechaActual = datetime.now()
fechaIngreso = datetime.strptime(fechaIng, "%d/%m/%Y")
antiguedad = fechaActual -fechaIngreso
meses = round(antiguedad.days/30, 0)
print(f"meses: {meses}")
prestaciones = (meses* salario)/12
print(type(antiguedad))
print(prestaciones)
