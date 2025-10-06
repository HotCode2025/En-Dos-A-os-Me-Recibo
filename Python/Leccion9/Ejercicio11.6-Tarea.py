#Definir una clase padre llamada vehiculo y dos clases hijas llamadas
#auto y bicicleta, las cuales heredan de la clase padre vehiculo. 
#la clase padre debe tener los siguientes atributos y metodos:

#vehiculo (clase padre)
#atributos: color, ruedas
# metodos: (__init__(color, ruedas), y __str__( ))

#auto (clase hija de vehiculo)
#atributos:(velocidad(km/h))
#metodos: (__init__(color, ruedas, velocidad), y __str__( ))

#bicicleta (clase hija de vehiculo)
#atributos:(tipo(urbana/montaña/etc.))
#metodos: (__init__(color, ruedas, tipo), y __str__( ))

#crear un objeto de cada clase

class Vehiculo:
    def __init__(self, color, ruedas):
        self.color = color
        self.ruedas = ruedas
    def __str__(self):
        return f"Color: {self.color}, Ruedas: {self.ruedas}"

class Auto(Vehiculo):
    def __init__(self, color, ruedas, velocidad):
        super().__init__(color, ruedas)
        self.velocidad = velocidad
    def __str__(self):
        return f"Color: {self.color}, Ruedas: {self.ruedas}, Velocidad: {self.velocidad}"

class Bicicleta(Vehiculo):
    def __init__(self, color, ruedas, tipo):
        super().__init__(color, ruedas)
        self.tipo = tipo
    def __str__(self):
        return f"Color: {self.color}, Ruedas: {self.ruedas}, Tipo: {self.tipo}"

auto = Auto("azul", 4, 120)
print(auto)
bici = Bicicleta("rojo", 2, "montaña")
print(bici)