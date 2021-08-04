#DECLARAR LA CLASE
class Persona:
    #METODO __INIT__ O CONSTRUCTOR
    def __init__(self, nombre, apellido, edad):
        #ATRIBUTOS O PROPIEDADES
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
    #METODOS DE ACCESO GET(OBTENER) Y SET(ACTUALIZAR)
    #METODOS GET
    def getNombre(self):
        return self.nombre
    def getApellido(self):
        return self.apellido
    def getEdad(self):
        return self.edad
    #METODOS SET
    def setNombre(self, nombre):
        if nombre == str:
            self.nombre = nombre
        else:
            print('Digite valor valido')
    #METODOS TRANSACCIONALES
    def imprimirPersona(self):
        return '\nNombre:'+self.nombre+'\nApellido:'+self.apellido+'\nEdad:'+str(self.edad)


#OBJETO O INSTANCIA DE UNA CLASE
persona1 = Persona('Alma', 'Chacon', 15)
print(persona1.imprimirPersona())
#print(persona1.getNombre())
#persona1.setNombre('Alma Ibeth')
#persona1.setNombre(100)
#print(persona1.getNombre())
persona2 = Persona('Fernanda', 'Barbosa', 15)
print(persona2.getNombre())
#print(persona1.getNombre(),persona1.getApellido(),persona1.getEdad())
#print(persona2.getNombre(),persona2.getApellido(),persona2.getEdad())
