class Persona:

    contador_personas = 0 #Variable de clase
    @classmethod #Metodo de clase
    def generar_siguiente_valor(cls): 
        cls.contador_personas += 1
        return cls.contador_personas


    def __init__(self, nombre, edad):
        self.id_persona = Persona.generar_siguiente_valor()
        self.nombre = nombre
        self.edad = edad

    def __str__(self):
        return f'Persona [{self.id_persona} {self.nombre} {self.edad}]'
    
p1 = Persona('Juan', 28)
print(p1)
p2 = Persona('Karla', 25)
print(p2)
p3 = Persona('Carlos', 30)
print(p3)
Persona.generar_siguiente_valor() #Con el metodo de clase podemos incrementar el contador sin crear un objeto
p4 = Persona('María', 22)
print(p4)
print(f'Valor contador personas: {Persona.contador_personas}')
