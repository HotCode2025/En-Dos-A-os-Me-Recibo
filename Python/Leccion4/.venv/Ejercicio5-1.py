#Ejercicio 4: Sumar numeros pares dentro de un rango
# Hacer un programa para sumar numeros pares dentro de un rango por ejemplo
#suma de numeros pares al 2 al 30
#suma = 240

minRango = int(input("Ingrese el valor minimo del rango: "))
maxRango = int(input("Ingrese el valor maximo del rango: "))

suma=0
for i in range(minRango,maxRango+1):
    if (i % 2 != 0):
        i=i+1
    else:
        suma+=i

print("La suma de los numeros pares es: ", suma)