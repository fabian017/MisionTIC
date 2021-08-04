#IMPORTAR LA LIBRERIA

import json

Empleados = '''
{
    "empleado": [{
            "emp_nombre": "Peter Parker",
            "emp_cedula": "88030123",
            "emp_correo": "peterparker@spidy.com",
            "licencia": false },
        {
            "emp_nombre": "Mary Yane",
            "emp_cedula": "60030123",
            "emp_correo": "maryjane@spidy.com",
            "licencia": true }
    ]
}
'''

#JSON A PYTHON
datos = json.loads(Empleados)
print(Empleados)
print(datos)

for individuo in datos['empleado']:
    print(individuo['emp_nombre']+','+individuo['emp_correo'])

for individuo in datos['empleado']:
    del individuo['emp_cedula']

#for individuo in datos['empleado']:
#    print(individuo['emp_cedula']+','+individuo['emp_nombre'])
print(datos)
