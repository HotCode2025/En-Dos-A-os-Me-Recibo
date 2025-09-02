# Ejercicio 4.8
# Insertar elementos y ordenarlos
# Pedir números y meterlos en una lista,
# cuando el usuario introduzca un número 0,
# nuestro programa dejaria de insertar.
# Por último, mostrar los números ordenados de menor a mayor.

numeros = []
while True:
    num = int(input("Ingrese un número (0 para terminar): "))
    if num == 0:
        break
    numeros.append(num)
numeros.sort() #ordena la lista de menor a mayor
print("Números ordenados:", numeros) #asi mostramos la lista ordenada
