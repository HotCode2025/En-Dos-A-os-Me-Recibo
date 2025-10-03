class Persona2:
    def __init__(self,nombre,apellido,edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalles (self):
        print(f"Los datos a mostrar son los siguientes: {self._nombre}{self._apellido}{self._edad}")

    @property # decorador
    def nombre(self): #metodo getter
        print("Utilizando el metodo getter")
        return self._nombre

    @nombre.setter #metodo setter
    def nombre(self, nombre):
        print("Utilizando el metodo setter")
        self._nombre = nombre

    @property # decorador
    def apellido(self): #metodo getter
        print("Utilizando el metodo getter")
        return self._apellido

    @apellido.setter #metodo setter
    def apellido(self, apellido):
        print("Utilizando el metodo setter")
        self._apellido = apellido

    @property # decorador
    def edad(self): #metodo getter
        print("Utilizando el metodo getter")
        return self._edad

    @edad.setter #metodo setter
    def edad(self, edad):
        print("Utilizando el metodo setter")
        self._edad = edad

    def __del__(self):
        print(f"Persona2: {self._nombre}{self._apellido}{self._edad}")

if __name__ == '__main__':
    persona1 = Persona2("Tomas ","Blanco ",25)
    print(persona1.nombre) #Llamamos al método Get
    print(persona1.apellido)
    print(persona1.edad)
    persona1.nombre = 'Juan perez' #Llamamos al metodo setter
    print(persona1.nombre) #Otra vez llama al metodo get para mostrar
    print(persona1.mostrar_detalles())
    #Atributo read-only sería la edad porque no tiene el metodo set
    print(persona1.edad)

    print(__name__)



