
class MiClase:

    #Variable de Clase, este atributo dará a cada objeto el mismo valor
    variable_clase = 'Esta es una variable de clase'

    def __init__(self, variable_instancia): #La variable de instancia, da diferentes valores a cada objeto
        self.variable_instancia = variable_instancia

print(MiClase.variable_clase)
obj1 = MiClase('esta es una variable de instancia')
print(obj1.variable_instancia)
print(obj1.variable_clase)
obj2 = MiClase('otra variable de instancia')
print(obj2.variable_instancia)
print(obj2.variable_clase)