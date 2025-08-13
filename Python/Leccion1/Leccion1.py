# lista = Ariel , Liliana , Natalia , Osvaldo

nombres = ['Naty' , 'Osvaldo' , 'Lily' , 'Ariel']

#print(nombres)
#print(nombres [0])
#print(nombres [1])
#print(nombres [3])

#print(nombres[-1])
#print(nombres[-2])
print(nombres)
print(nombres[0:2])#solo muestra el indice 0, 1 pero no el indice 2
#ir del inicio de la lista al indice sin incluirlo
print(nombres[:3])
#desde el indice indicado hasta el final
print(nombres[1:])
#modificamos un valor
nombres[2] = 'Liliana'
nombres[0] = 'Natalia'
print(nombres)
#Iterar una lista
for nombre in nombres: #nombre es singular, la lista es plural
    print(nombre)
else:
    print('Se acabaron los elementos de la lista')

#preguntamos cuantos elementos tiene
print(len(nombres)) #le pasamos como parametro la lista

#Agregamos un elemento
nombres.append('Marcelo')
print(nombres)

#Insertar un elemento en un indice especifico
nombres.insert(1,'Alberto')
print(nombres)
nombres.insert(3,'Debora')
print(nombres)

#eliminamos un elemento de la lista
nombres.remove('Alberto')
print(nombres)

#Eliminar el ultimo elemento
nombres.pop()
print(nombres)

#Eliminar un indice especifico
del nombres[2] #del significa delete (eliminar)
print(nombres)

#eliminar, borrar o limpiar todos los elementos
nombres.clear()
print(nombres)

#Eliminar la lista
del nombres
#print(nombres)

'''
Sintaxis de range(inicio<opcional>, fin <requerido>, incremento<opcional>)
'''

#Ejercicio 1: Iterar un rango de 0 a 10 e imprimir numeros divisibles entre 3
#ejemplo de ejecucion: 0,3,6,9

print('Rango de 0 a 10 con numeros divisibles entre 3')
for i in range(11):
    if i % 3 == 0:
        print(i)

#ejercicio 2: Crear un rango de numeros de 2 a 6 a imprimelos
#ejemplo de ejecucion: 2,3,4,5,6

print('Rango con valores de inicio = 2 y fin = 6')
rango = range(2,7)
for i in rango:
    print(i)

#Ejercicio 3: Crear un rango de 3 a 10 pero con incremento de 2 en 2, en lugar de 1 en 1
#ejemplo de ejecucion: 3,5,7,9

print('Rango con valores de inicio = 3, fin = 10, incremento =2 ')
for i in range(3,11,2):
    print(i)