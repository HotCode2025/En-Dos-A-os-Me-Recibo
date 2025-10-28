from Empleado import Empleado
from Gerente import Gerente

def imprimir_objeto(obj):
    #print(obj) #De manera indirecta se llama al metodo __str__ de la clase Empleado o Gerente
    print(type(obj)) #Tipo de objeto que esta en la variable obj
    print(obj.mostrar_detalles()) #Llamada al metodo mostrar_detalles
    if(isinstance(obj, Gerente)): #isinstance verifica si el objeto es de la clase Gerente
        print(obj.departamento)

e1 = Empleado('Ramiro', 50000.00)
imprimir_objeto(e1) #Pasamos el objeto Empleado

g1 = Gerente('Carlos', 80000.00, 'Sistemas')
imprimir_objeto(g1) #Pasamos el objeto Gerente

# Existe el polimorfismo porque la funcion imprimir_objeto puede recibir objetos de diferentes clases (Empleado o Gerente) y se comporta de manera diferente dependiendo del tipo de objeto que recibe.
