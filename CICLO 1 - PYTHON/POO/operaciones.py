class Operaciones:
    def __init__(self, numero1, numero2):
        self.numero1 = numero1
        self.numero2 = numero2
    def getNumero1(self):
        return self.numero1
    def getNumero2(self):
        return self.numero2
    def setNumero1(self, numero1):
        self.numero1 = numero1
    def setNumero2(self, numero2):
        self.numero2 = numero2
    def sumarNumeros(self):
        return self.numero1 + self.numero2
    def sumarNumero1(self, numero1):
        return self.numero1 + self.numero1
    def sumarNumero2(self, numero2):
        return self.numero2 + self.numero2


numero1 = int(input('Digite numero1:'))
numero2 = int(input('Digite numero2:'))
operacion1 = Operaciones(numero1, numero2)
print('La suma es:', operacion1.sumarNumeros())
