# EJERCICIO 10.3 PY: con una "class Persona" en PY
# crear tres objetos más, utilizando los métodos getter and setter #
# para modificar, y mostrar los cambios con el método mostrar detalles

class Persona:
    def __init__(self, nombre, apellido, edad, *args, **kwargs):
        self.__nombre = nombre
        self.__apellido = apellido
        self.__edad = edad
        self.__args = args
        self.__kwargs = kwargs

    #Getters
    def get_nombre(self):
        return self.__nombre

    def get_apellido(self):
        return self.__apellido

    def get_edad(self):
        return self.__edad

    def get_args(self):
        return self.__args

    def get_kwargs(self):
        return self.__kwargs

        # Setters

    def set_nombre(self, nombre):
        self.__nombre = nombre

    def set_apellido(self, apellido):
        self.__apellido = apellido

    def set_edad(self, edad):
        if edad >= 0:
            self.__edad = edad
        else:
            print("La edad no puede ser negativa.")

    def set_args(self, *args):
        self.__args = args

    def set_kwargs(self, **kwargs):
        self.__kwargs = kwargs

    def mostrarDetalle(self):
        print(f"La clase Persona tiene los siguientes datos: {self.__nombre} {self.__apellido} {self.__edad}, la direccion es: {self.__args}, los datos importantes: {self.__kwargs}")

#Creamos los objetos
persona4 = Persona('Lucas','Perez',23,'Dirección','Rivadavia 234',EstadoCivil='soltero')
persona5 = Persona('juan','alvarez',20,'Dirección','marconi 234',EstadoCivil='soltero')
persona6 = Persona('natanael','cardozo',30,'Dirección','avellaneda 234',EstadoCivil='casado')

#Mostramos los datos iniciales de los objetos
persona4.mostrarDetalle()
persona5.mostrarDetalle()
persona6.mostrarDetalle()

#Usamos metodo setters para hacer modificaciones
persona4.set_nombre("Carlos")
persona4.set_apellido("Pérez López")
persona4.set_edad(26)
persona4.set_args("Dirección", "San Martín 456")
persona4.set_kwargs(EstadoCivil="casado", Trabajo="Ingeniero")

persona5.set_nombre("María")
persona5.set_apellido("Gómez Díaz")
persona5.set_edad(31)
persona5.set_args("Dirección", "Mitre 789")
persona5.set_kwargs(EstadoCivil="casada", Trabajo="Doctora")

persona6.set_nombre("Luis ramon")
persona6.set_apellido("Martínez Soto")
persona6.set_edad(21)
persona6.set_args("Dirección", "Belgrano 321")
persona6.set_kwargs(EstadoCivil="soltero", Trabajo="Estudiante")

#Ahora utilizamos el metodo get para mostrar informacion específica
print(persona4.get_nombre(), persona4.get_apellido(), persona4.get_edad(), persona4.get_args(), persona4.get_kwargs())
print(persona5.get_nombre(), persona5.get_apellido(), persona5.get_edad(), persona5.get_args(), persona5.get_kwargs())
print(persona6.get_nombre(), persona6.get_apellido(), persona6.get_edad(), persona6.get_args(), persona6.get_kwargs())
