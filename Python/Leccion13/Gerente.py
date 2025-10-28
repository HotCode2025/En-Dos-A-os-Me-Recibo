from Empleado import Empleado

class Gerente(Empleado): #Clase Hija
    def __init__(self, nombre, sueldo, departamento): #Constructor
        super().__init__(nombre, sueldo) #Llamada al constructor de la clase padre
        self.departamento = departamento

    def __str__(self): 
        return f'Gerente [Departamento: {self.departamento}] {super().__str__()}'