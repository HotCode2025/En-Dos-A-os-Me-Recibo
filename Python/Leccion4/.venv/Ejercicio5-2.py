#Ejercicio 5: Factorial de un numero positivo
#Hacer un programa para calcula el factorial de un numero positivo

valor = int(input("Ingrese el numero al que desea su factorial: "))

factorial= 1
for i in range(1, valor + 1):
    factorial *= i

print("El valor del factorial es", factorial)