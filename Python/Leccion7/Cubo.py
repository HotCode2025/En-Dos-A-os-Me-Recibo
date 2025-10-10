class Cubo:

    def __init__(self, ancho, alto , profundidad):
        self.ancho = ancho
        self.alto = alto
        self.profundidad = profundidad

    def volumen(self):
        return self.ancho * self.alto * self.profundidad
    
ancho = int(input("Ingrese el ancho del cubo: "))
alto = int(input("Ingrese el alto del cubo: "))
profundidad = int(input("Ingrese la profundidad del cubo: "))

cubo = Cubo(ancho, alto, profundidad)

print("El volumen del cubo es: ", cubo.volumen())