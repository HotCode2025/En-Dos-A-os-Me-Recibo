class Persona: # creamos la clase Persona

    def __init__(self, nombre, apellido, edad, *args, **kwargs): # se lo llama metodo init dunder
        self.nombre = nombre
        self.apellido = apellido
        self._dni = dni # este atributo esta encapsulado de una manera sugerida
        self.edad = edad
        self.args = args
        self.kwargs = kwargs

    def __str__(self): # se lo llama metodo str dunder
         print(f'Persona: {self.nombre} {self.apellido} - Edad: {self.edad}')

    def mostrar_detalle(self):
        print(f'La clase persona tiene los siguientes datos: {self.nombre} {self.apellido} {self.edad}, la direccion es: {self.args} y los datos son: {self.args}, los datos importantes son: {self.kwargs}')

persona1 = Persona("Marcos", "Homola",30321233, 24) # Necesitamos enviar argumentos
# print(persona1.nombre )
# print(persona1.apellido)
# print(persona1.edad)

print(f' El ojeto1 de la clase persona: {persona1.nombre} {persona1.apellido} - Edad: {persona1.edad} su edad es: {persona1.edad}')
persona2 = Persona("Osvaldo", "Giordanini", 45)
print(f' El ojeto2 de la clase persona: {persona2.nombre} {persona2.apellido} - Edad: {persona2.edad} su edad es: {persona2.edad}')

persona1.nombre = "Juan Carlos" # Modificamos el atributo nombre del objeto persona1
persona1.apellido = "Lopez"
persona1.edad = 26
print(f' El ojeto1 de la clase persona: {persona1.nombre} {persona1.apellido} - Edad: {persona1.edad} su edad es: {persona1.edad}')

#los atributos son caracterisitcos
#los metodos el comportamiento que van a tener los objetos (acciones)
persona1.mostrar_detalle() # la referencia en este caso se pasa de manera automatica
persona2.mostrar_detalle()

# persona.mostrar_detalle(persona1) # de esta manera se pasa la referencia del objeto persona1
persona1.telefono = "123456789"
print(f'Este es el telefono de: {persona1.nombre} {persona1.telefono}') #hemos creado un atributo  de un objeto

#print(persona2.telefono) # error porque no existe el atributo telefono
persona3 = Persona('Rogelio' , 'Gonzalez', 12304501,30, 'telefono' , '123456789', 'calle lopez', 823, 'manzana' , 77, 'casa', 18, altura =1.83, peso = 85, CFavorito = 'Azul' , auto='Peugeot' , modelo= 2021)
persona3.mostrar_detalle()
# print(persona3._dni)  esto no se debe utilizar en python(esta encapsulado), esto dice que lo desconocemos
# persona3.__nombre # esta totalmente encapsulado


