class Rectangulo:
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura
    def area(self):
        return self.base*self.altura


class Cuadrado(Rectangulo):
    def __init__(self, lado):
        super().__init__(lado, lado)


rectangulo1 = Rectangulo(10, 20)
print(rectangulo1.area())
cuadrado1 = Cuadrado(30)
print(cuadrado1.area())
