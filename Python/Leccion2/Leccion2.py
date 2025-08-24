
# Tipo set
planetas = {'Marte', 'Júpiter', 'Venus'}
print(len(planetas)) # Usamos la funcion len=lenght significa largo

# Revisamos si un elemento esta en el set
#print('Jupiter' in planetas)
print('Júpiter' in planetas)

#Agregamos un elemento
planetas.add('Tierra') # add es una funcion que sirve para agregar elementos
print(planetas) #nota: nunca se pueden agregar elementos duplicados o repetidos

#Eliminar un elemento, puede arrojar un error si el elemento no existe
planetas.remove('Júpiter') #esta funcion arroja error si el elemento no existe
print(planetas)
planetas.discard('Tierra') #no arroja error si el elemento no existe
print(planetas)

# Limpiar set o conjunto
planetas.clear() #limpia todos los elementos del set
print(planetas)

#Eliminar el set o conjunto
#del planetas
#print(planetas) #arroja error porque el set ya no existe

# "Maradona" : 10 Un diccionario esta compuesto por dos elemntos
# Una llave y un valor
# dict(key,value)
diccionario = {
    'IDE' : 'Integrated Development Environment',
    'POO' : 'Programacion Orientada a Objetos',
    'SABD' : 'Sistema de Administracion de Base de Datos'
}
#Verificamos la cantidad de elementos del diccionario
print(len(diccionario)) #len es una funcion que cuenta los elementos
print(diccionario)

#Accedemos a un elemento del diccionario
print(diccionario['IDE']) #accedemos al valor de la llave IDE

#Otra forma de recuperar un elemento del diccionario
print(diccionario.get('POO')) #get es una funcion que recupera el valor de la llave
print(diccionario.get('SABD')) #arroja error porque la llave no existe

#Modificamos los elementos del diccionario
diccionario['IDE'] = 'Entorno de Desarrollo Integrado'
print(diccionario)

# Como recorrer los elementos de un diccionario
for termino in diccionario: #termino es la llave del diccionario
    print(termino)

#for termino, valor in diccionario: # Recorremos mostrando solo las llaves
#    print(termino) #esto no funciona, da error

# Necesitamos una funcion especial para mostrar llaves y valores
for termino, valor in diccionario.items(): # Recorremos mostrando llaves y valores
    print(termino, valor)

#Otras maneras de accerder a un diccionario
for termino in diccionario.keys(): # Estamos usando un función
    print(termino) #mostramos solo las llaves

for valor in diccionario.values(): # Estamos usando un función
    print(valor) #mostramos los valores sin las llaves

# Comprobar si un elemento existe en el diccionario
print('IDE' in diccionario) #devuelve True o False, o sea un booleano

# Agregar un elemento
diccionario['PK'] = 'Primary Key'
print(diccionario)

# Eliminar un elemento
diccionario.pop('SABD') #pop es una funcion que elimina un elemento
print(diccionario)

# Como vaciar un diccionario
diccionario.clear()
print(diccionario)

# Eliminar un diccionario
del diccionario
#print(diccionario) #arroja error porque el diccionario ya no existe

# Concatenamos listas
lista1 = [1,2,3,1]
lista2 = [4,5,6,1]
lista3 = lista1 + lista2 # Usamos el operador + para concatenar
print(lista3)

lista3.extend([7,8,9,1]) # Funcion para agregar varios elementos a una lista
print(lista3) 

print(lista3.index(5)) # Funcion para saber la ubicación de un elemento
# print(lista3.index(0)) # esto arrojaria un error por no ser elemento de la lista

#Como saber cuantos elementos repetidos hay dentro de una lista
print(lista3.count(1)) # Funcion count cuenta cuantos elementos repetidos hay

#Para poner al reves una lista
lista3.reverse()
print(lista3)

#Para que una lista se multiplique repitiendo elementos
lista3 = lista3 * 2
print(lista3)

#Métodos de ordenamiento
lista3.sort() # Ordena la lista de menor a mayor
print(lista3)
lista3.sort(reverse=True) # Ordena la lista de mayor a menor
print(lista3)

# Tuplas son inmutables, no se pueden modificar

#Repaso de tuplas
tupla = (4, 'Hola' , 6.78, [1, 2, 78], 4, 'Hola') # Puedo tener diferentes tipos de datos dentro
print(tupla)

# podemos buscar elementos dentro de una tupla, podemos preguntar 

# Podemos preguntar si un elemento existe dentro de una tupla
print( 4 in tupla) # Acción boolean, devuelve True o False

# Lo que se puede usar dentro de tuplas son: index, count, len












