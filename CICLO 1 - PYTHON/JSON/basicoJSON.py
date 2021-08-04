#IMPORTAR LA LIBRERIA
import json

Persona = '''
{
    "codigo": 1,
    "nombre": "Peter",
    "apellido": "Parker",
    "Edad": 39,
    "Telefono": null,
    "empleado": true,
    "Lenguajes": ["Python", "Java", "Javascript", "Kotlin"]
}'''

'''
print(Persona)
print(type(Persona))
#DE JSON A PYTHON
jsonAPython=json.loads(Persona)
print(jsonAPython)
print(type(jsonAPython))
print(jsonAPython['Lenguajes'])
'''

'''#nueva_lista=[True, False, 'Hola Mundo']
diccionario = {
    'codigo': 1,
    'nombre': 'Peter Parker',
    'profesion': 'Fotografo'
}

#DE PYTHON A JSON
pythonAJSON = json.dumps(diccionario)
print(pythonAJSON)
print(type(pythonAJSON))'''

#IMPORTAR LA LIBRERIA
#CODIFICAR ARCHIVOS EN JSON
nueva_lista = [True, False, 'Hola Mundo']
with open("pruebaJSON.json", "a") as archivo:
    #sentencias
    json.dump(nueva_lista, archivo)

#DECODIFICAR ARHIVOS EN JSON
with open("pruebaJSON.json", "a") as archivo:
    #sentencias
    #datosJSON = json.load(archivos)
    pass