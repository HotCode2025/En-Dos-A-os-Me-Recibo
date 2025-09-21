#  8.1 CREACIÓN DE UNA CLASE

class Persona: # Creamos una clase
   # pass # No se procesa nada

# 8.2 ATRIBUTOS EN MÉTODOS Y CREACIÓN DE UN OBJETO

#    def __init__(self): # Metodo constructor
#       self.nombre = 'Juan' # Atributo
#        self.apellido = 'Zalazar' # Atributo
#        self.edad = 22

# Ahora vamos a crear un método constructor sin parámetros
# print(type(Persona))
# persona1 = Persona()
# print(persona1.nombre)
# print(persona1.apellido)
# print(persona1.edad)

# 8.3 Creación de objetos con argumentos
    #   Ahora vamos a crear un método constructor con parámetros

    def __init__(self, nombre, apellido, edad): # Se lo llama método Init Dunder
        self.nombre = nombre # Atributo
        self.apellido = apellido # Atributo
        self.edad = edad
    def mostrar_detalle(self): # Método de instancia
        print(f'Persona: {self.nombre} {self.apellido} {self.edad}') # Usamos self para acceder a los atributos

persona1 = Persona('Ariel', 'Betancud', 40)
# print(persona1.nombre)
# print(persona1.apellido)
# print(persona1.edad)

# 8.4 CREAMOS MÁS OBJETOS EN UNA CLASE

persona2 = Persona('Osvaldo', 'Giordanini', 45)
print(f'El objeto2 de la clase persona es: {persona2.nombre} {persona2.apellido} Su edad es: {persona2.edad}')

persona1= Persona('Ariel', 'Betancud', 40)
print(f'El objeto1 de la clase persona es: {persona1.nombre} {persona1.apellido} Su edad es: {persona1.edad}')

# 8.5 REFERENCIAS DE MEMORIA DE OBJETOS CON EL DEBUG

# Ponermos punto de ruptura en la línea 28, click derecho DEBUG PERSONA
# Luego con F7 (Step Into) para entrar en la clase
# Vemos las referencias de memoria y todo apunta al mismo espacio de memoria, hexadecimal
# Todo sucede en un mismo espacio de memoria
# Los objetos no comparten los valores, solo comparten los atributos
# y asi podemos asignar diferentes valores a cada atributo

# 8.6 MODIFICAR ATRIBUTOS DE UN OBJETO

persona1.nombre = 'Liliana'
persona1.apellido = 'Buccella'
persona1.edad = 40
print(f'El objeto1 modificado de la clase persona es: {persona1.nombre} {persona1.apellido}, su edad es: {persona1.edad}')

# 8.7 MÉTODOS DE INSTANCIA. CREAR UML

# Los atributos son: caracteristicas
# Los métodos son: el comportamiento que van a tener los objetos (acciones)
# El método es igual que una función, pero un método está asociado a una clase y la función no

# Descargamos la extensión UML de Visual Studio Code
# La buscamos como "umlet"
# luego creamos archivo con extensión .uxf
# podemos crear el diagrama arrastrando y soltando los elementos
# y en solapa de propiedades podemos cambiar los nombres

# 8.8 MÉTODOS DE INSTANCIA: DEFINIMOS UN MÉTODO

persona1.mostrar_detalle() # Llamamos al método de instancia
persona2.mostrar_detalle()

# 8.9 COMMIT EN GITHUB DESKTOP

# Podemos usar el programa GitHub Desktop para subir los cambios a GitHub