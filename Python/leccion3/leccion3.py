# REPASO DE SET O CONJUNTO
#Para definir un conjunto
from pprint import pprint

conjunto1 = set()
conjunto2 = {'bye',}
conjunto1.add(7)
conjunto1.add('hola')
print(conjunto1)
conjunto2.add('hola')
print(conjunto1)
print(3 not in conjunto2) # preguntamos si numero 3 NO está
#Como hacer la igualdad de los dos conjuntos
print(conjunto2 == conjunto1) # devuelve un bool

#Operaciones de conjuntos
conjunto3 = conjunto1 | conjunto2 # La linea uno los conjuntos
print(conjunto3)

#Interceccion de conjuntos
conjunto3 = conjunto1 & conjunto2 #Esto Une los elementos en comun
print(conjunto2)

conjunto3 = conjunto1 - conjunto2 # Asigna el valor que esta en el conjunto y no en el conjunto2
print(conjunto3)

conjunto3 = conjunto2 - conjunto1
print(conjunto3)

conjunto3 = conjunto2 ^ conjunto1 # Los elementos que no comparten o que son diferentes entre sí
print(conjunto3)

conjunto3 = conjunto1 | conjunto2
print(conjunto1.issubset(conjunto3)) # Preguntamos si un conjunto es subconunto dentro de otro
print(conjunto2.issubset(conjunto3))
print(conjunto3.issubset(conjunto1))

print(conjunto3.issuperset(conjunto1)) #Preguntamos los elementos del conjunto 1 están en el conjunto 3
print(conjunto3.issuperset(conjunto2))# Si es true el conjunto 3 es superconjunto.
print(conjunto3.issuperset(conjunto1))

# Como saber si ambos conjuntos son disconexsos, esto es si no comparten elementos en comun
print(conjunto1.isdisjoint(conjunto2)) # No hay cosas en comun
# Convertir un conjunto a inmutable
conjunto1 = frozenset # Esto hace que el conjunto sea inmutable, es decir, no se puede eliminar ni modificar nada

# REPASO DE DICCIONARIOS
diccionarioNuevo = {'azul': 'blue', 'verde':'green', 'rojo':'red', 'amarillo':'yellow'}
print(diccionarioNuevo)

# Como eliminar
del (diccionarioNuevo['azul'])
print(diccionarioNuevo)
#Dentro de un diccionario se pueden agregar diferentes tipos de datos
diccionario2 = {'ariel':{'edad': 40, 'altura': 1.83},'osvaldo':[45,1.85],'natalia':[35,1.67]}
print(diccionario2)

seleccionArgentina = {
    10 : {'nombre': 'lionel messi', 'edad':35, 'altura':1.70, 'precio': '50 millones', 'posicion': 'delantero'},
    11 : {'nombre': 'Di maria', 'edad':34,'altura': 1.83, 'precio':'12 millones','posicion':'delantero'},
    21 : {'nombre': 'dybala', 'edad':28,'altura': 1.77, 'precio':'35 millones','posicion':'media punta'},
    19 : {'nombre': 'otamendi', 'edad':34,'altura': 1.83, 'precio':'3.5 millones','posicion':'defensor'},
    1 : {'nombre': 'armani', 'edad':35,'altura': 1.89, 'precio':'3.5 millones','posicion':'arquero'}
}
print(seleccionArgentina.values())
for llave1, valor in seleccionArgentina.items():
    print(llave1,valor)
print("Tenemos cargado en el diccionario la cantidad de : ",end='')
print(len(seleccionArgentina))

print("----------------------------------------------------------------------------------")
# COMO TAREA AGREGAR POR LO MENOS 4 JUGADORES MÁS AL DICCIONARIO DE LA SELECCIÓN
seleccionArgentina.update({
    3 : {'nombre': 'tagliafico', 'edad':32,'altura': 1.73, 'precio':'4 millones','posicion':'lateral derecho'},
    22 : {'nombre': 'lautaro martinez', 'edad':28,'altura': 1.74, 'precio':'10 millones','posicion':'delantero'},
    5: {'nombre': 'paredes', 'edad':31,'altura': 1.82, 'precio':'4 millones','posicion':'volante central'},
    9 : {'nombre': 'alvarez', 'edad':25,'altura': 1.70, 'precio':'60 millones','posicion':'delantero'}
})
for llave2, valor in seleccionArgentina.items():
    print(llave2,valor)

print("Tenemos cargado en el diccionario la cantidad de : ",end='')
print(len(seleccionArgentina))

#METODO PARA LISTAS: PILAS
pila = [1,2,3]
#Agregar elementos a la pila en el final
pila.append(4)
pila.append(5)
print(pila)

#Sacando elementos por el final
elementoBorradoPila = pila.pop()
print(f'sacamos el elemento {elementoBorradoPila}')
print(f'La pila ahora queda así {pila}')

# Colas con listas
#Estructura de datos de tipo FIFO (first input / first output )

cola = ['ariel','osvaldo','liliana','pilar']
cola.append('natalia')
cola.append('josé')
print(cola)

# sacamos un elemento de la lista
seRetira = cola.pop(0)
print(f'ATENDIDO EL CLIENTE: {seRetira}')
seRetira = cola.pop(0)
print(f'ATENDIDO EL CLIENTE: {seRetira}')
seRetira = cola.pop(0)
print(f'ATENDIDO EL CLIENTE: {seRetira}')
seRetira = cola.pop(0)
print(f'ATENDIDO EL CLIENTE: {seRetira}')
seRetira = cola.pop(0)
print(f'ATENDIDO EL CLIENTE: {seRetira}')
seRetira = cola.pop(0)
print(f'ATENDIDO EL CLIENTE: {seRetira}')