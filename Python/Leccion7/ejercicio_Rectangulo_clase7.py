class Rectangulo:
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    def calcular_area(self):
        return self.base * self.altura

#Definimos los tres objetos o rectangulos
base1 = float(input("Ingrese la base del primer rectángulo: "))
altura1 = float(input("Ingrese la altura del primer rectángulo: "))
rect1 = Rectangulo(base1, altura1)

base2 = float(input('Ingrese la base del segundo rectangulo: '))
altura2 = float(input('Ingrese la base del segundo rectangulo: '))
rect2 = Rectangulo(base2, altura2)

base3 = float(input('Ingrese la base del Tercer rectangulo: '))
altura3 = float(input('Ingrese la base del tercer rectangulo: '))
rect3 = Rectangulo(base3, altura3)

#Mostramos las areas
print(f'El area del primer rectangulo es: {rect1.calcular_area()}')
print(f'El area del segundo rectangulo es: {rect2.calcular_area()}')
print(f'El area del tercer rectangulo es: {rect3.calcular_area()}')






