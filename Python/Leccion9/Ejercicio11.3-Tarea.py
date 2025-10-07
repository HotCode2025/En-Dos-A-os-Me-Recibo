class Persona: # Esta clase hereda de la clase object
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

# Getter y Setter para nombre
    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    # Getter y Setter para edad
    @property
    def edad(self):
        return self._edad

    @edad.setter
    def edad(self, edad):
        self._edad = edad


class Empleado(Persona): # Esta clase es hija de la clase Persona
    def __init__(self, nombre, edad, sueldo):
        super().__init__(nombre, edad)
        self.sueldo = sueldo

    # Getter y Setter para sueldo
    @property
    def sueldo(self):
        return self._sueldo

    @sueldo.setter
    def sueldo(self, sueldo):
        self._sueldo = sueldo

#Creamos objeto 1

# empleado1 = Empleado('Martín', 50, 80000)
# print(empleado1.nombre)
# print(empleado1.edad)
# print(empleado1.sueldo)

# Crear objeto 1
empleado1 = Empleado("Javier", 50, 80000)
print("-Empleado 1-")
print("Nombre:", empleado1.nombre)
print("Edad:", empleado1.edad)
print("Sueldo:", empleado1.sueldo)

# creamos el segundo objeto
empleado2 = Empleado("Lucía", 30, 95000)
print("-Empleado 2 original")
print("Nombre:", empleado2.nombre)
print("Edad:", empleado2.edad)
print("Sueldo:", empleado2.sueldo)

# modificamos los datos del objeto 2
empleado2.nombre = "Lucía Gómez"
empleado2.edad = 31
empleado2.sueldo = 100000

print("-Empleado 2 modificado-")
print("Nombre:", empleado2.nombre)
print("Edad:", empleado2.edad)
print("Sueldo:", empleado2.sueldo)

# Crear encapsulamiento y crear los metodos getter and setter, en cada uno deberia agregar los get
# Tarea: encapsular los atributos y agregar los métodos getters and setters
# Crear otro objeto, pasar los datos para nombre, edad y sueldo
# Mostrar estos datos, luego modificar y mostrar nuevamente