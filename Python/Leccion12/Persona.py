class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def __add__(self, other):
        return self.nombre + other.nombre
    
    def __sub__(self, otro):
        return self.edad - otro.edad
    
p1 = Persona('Ramiro', 23)
p2 = Persona('Candela', 22)
# p1.__add__(p2)  sintaxis interna y automática
print(p1 + p2)  # sintaxis externa y sobrecarga del operador +, devuelve 'RamiroCandela'
print(p1 - p2)  # sintaxis externa y sobrecarga del operador -, devuelve 1