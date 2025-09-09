#Desempaquetado de listas o list unpacking
def show(name, lastName):
    print(name+' '+lastName)

person = ['Ariel', 'Mendez']
show(*person) #El asterisco sirve para desempaquetar la lista y pasar sus elementos como argumentos individuales a la función

person2 = ('Ramiro', 'Muñoz')
show(*person2) #También funciona con tuplas

person3 = {'Marcos', 'Gonzalez'}
show(*person3) #También funciona con diccionarios

person4 = {'name': 'Laura', 'lastName': 'Perez'}
show(**person4) #También funciona con diccionarios, pero tiene que estar en formato clave:valor

numbers = [1, 2, 3, 4, 5, 6, 7] #Aun con la lista vacia el else se ejecuta
for i in numbers:
    print(i)
    if i == 4: #Cuando i es igual a 4 se rompe el bucle y no se ejecuta el else
        break
else:
    print('El bucle termino')

#lista comprehension, lista de comprension
names = ['Paolo', 'Rodrigo', 'Lupe', 'Pepe']
alongP = [p for p in names if p[0] == 'P'] #Esto es lo mismo que hacer un for, y devuelve una nueva lista con los elementos que cumplen la condición
print(alongP)

bottleC = [{'name': 'Quilmes', 'country': 'Arg'}, {'name': 'Corona', 'country': 'Mx'}, {'name': 'Brahma', 'country': 'Br'}]

argentina = [b for b in bottleC if b['country'] == 'Arg']
print(argentina)
print(bottleC)

#Paso de Argumentos (funciones)
def miFuncion2(name, lastName):
    print('Saludos a todos los de la clase')
    print(f'Nombre: {name}, Apellido: {lastName}')
miFuncion2('Jorge', 'Pereyra') #Se pasan los argumentos en el mismo orden en que estan en la función
miFuncion2('Ariel', 'Betancud')
miFuncion2('Analia', 'Paez')

#La palabra return en funciones, creamos una funcion para sumar:
def sumar(a, b):
    return a + b
resultado = sumar(78, 22)
print(f'El resultado de la suma es: {resultado}')
print(f'El resultado de la suma es: {sumar(100, 90)}')


def sumar2(a = 0, b = 0):
    return a + b
resultado2 = sumar2()
print(f'El resultado de la suma es: {resultado2}') #Esto da error porque no se ha pasado ningún argumento a la función, pero si le damos un valor por defecto a los parámetros, no da error
print(f'El resultado de la suma es: {sumar2(22, 66)}')

#Argumentos, variables en funciones
def listarNames(*nombres): #Normalmente se utiliza *args
    for i in nombres:
        print(i)

listarNames('Ariel', 'Jorge', 'Analia', 'Paola') #Se pueden pasar todos los argumentos que se quieran, y se reciben como una tupla
listarNames('Liliana', 'Hector', 'Ramiro')

def listarTerminos(**kwargs):
    for i, valor in kwargs.items():
        print(f'{i} : {valor}')

listarTerminos(IDE = 'Integrated Development Environment', PK = 'Primary Key')
listarTerminos(Nombre = 'Lionel Messi')


def desplegarNombres(nombres):
    for i in nombres:
        print(i)

nombres2 = ['Tito', 'Pedro', 'Carlos']
desplegarNombres(nombres2)
desplegarNombres('Carla')
# desplegarNombres(10) #No son objetos iterables
desplegarNombres((10, 11)) #lo convertimos a una Tupla iterable
desplegarNombres([22, 54, 67]) #lo convertimos a una lista iterable


#Funciones recursivas
def factorial(numero):
    if numero == 1:
        return 1 #Caso base
    else:
        return numero * factorial(numero - 1)
    
resultado = factorial(5)
print(resultado)
