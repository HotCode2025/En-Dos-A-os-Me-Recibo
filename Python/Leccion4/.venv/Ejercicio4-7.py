# Ejercicio 4.7
# Modificar los elementos de una lista
# Llenar una lista con los numeros del 1 al 10,
# luego modificar los elemendos de la lista
# multiplicando por un valor ingresado por el usuario

numeros = list(range(1, 11)) #llenamos la lista con números del 1 al 10
print("Lista original:", numeros) #mostramos la lista original

valor = float(input("Ingrese un valor para multiplicar los elementos de la lista: "))

for i in range(len(numeros)):
    numeros[i] = numeros[i] * valor #modificamos los elementos multiplicandolos por valor ingresado
print("Lista modificada:", numeros)