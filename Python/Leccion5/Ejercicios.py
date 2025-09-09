#Ejercicio10: No repetir carcateres
#Hacer un programa que pida una cadena por teclado, y luego meter los caracteres en una lista sin repetir caracteres

cadena = input("Digite una cadena: ")
lista = []
for i in cadena:
    if i not in lista:
        lista.append(i)
print("Lista: ", lista)


#Ejercicio11: Agenda telefónica
#Hacer un programa que simule una agenda de contactos, crear un diccionario donde la clave sea el nombre del usuario y el valor sea el teléfono, el programa tendrá el sgte menú de opciones:
#1. Nuevo contacto
#2. Borrar contacto
#3. Ver contactos existentes
#4. Salir

agenda = {
    "Juan": 123456789,
    "Maria": 987654321,
    "Pedro": 456789123
}

while True:
    print("1. Nuevo contacto")
    print("2. Borrar contacto")
    print("3. Ver contactos existentes")
    print("4. Salir")
    opcion = int(input("Seleccione una opción: "))
    if opcion == 1:
        nombre = input("Ingrese el nombre del contacto: ")
        telefono = int(input("Ingrese el teléfono del contacto: "))
        agenda.update({nombre: telefono})
        print("Contacto agregado correctamente.")
    elif opcion == 2:
        print(agenda)
        nombre = input("Ingrese el nombre del contacto a borrar: ")
        agenda.pop(nombre)
        print("Contacto borrado correctamente.")
    elif opcion == 3:
        print(agenda)
    elif opcion == 4:
        print("Gracias por usar el programa.")
        break
    else:
        print("Opción inválida.")



#Ejercicio 1 Funciones: 
#Crear una función para sumar los valores recibidos de tipo numerico, utilizando argumentos variablles *args como parámetro de la función y agregar como resultado la suma de todos los valores pasados como argumentos
def sumarValores(*args):
    suma = 0
    for i in args:
        suma += i
    return suma

print(sumarValores(1, 2, 3, 4, 5))

#Ejercicio 2 Funciones: 
#Crear una funcion para multiplicar los valores recibidos de tipo numerico, utilizando argumentos varriables *args como parámetro de la función y regresar como resultado la multiplicación de todos los valores pasados como argumentos
def multiplicarValores(*args):
    multiplicacion = 1
    for i in args:
        multiplicacion *= i
    return multiplicacion

print(multiplicarValores(1, 2, 3, 4, 5))


#Ejercicio 3 Funciones: 
#Imprimir números de 5 a 1 de manera descendente usando funciones recursivas, puede ser cualquier valor positivo.
def contador(num):
    if num < 1:
        return
    else:
        print(num)
        contador(num - 1)

resultado = int(input("Ingrese un número positivo: "))
contador(resultado)

#Ejercicio 4 Funciones: 
#Crear funcion para clcular el total de un pago incluyendo un impuesto aplicado (IVA)
def calcularTotal():
    total = float(input("Ingrese el total del pago: "))
    impuesto = float(input("Ingrese el impuesto aplicado: "))
    totalConImpuesto = total + (total * impuesto / 100)
    return totalConImpuesto

print("El total del pago incluyendo el impuesto es: ", calcularTotal())


# Ejercicio 5 Funciones: 
# Realizar dos funciones para convertir de grados celsius a fahrenheit y viseversa

def celsiulAFahrenheit(num):
    return (num * 9/5) + 32

def fahrenheitACelsius(num):
    return (num - 32) * 5/9

while True:
    print("1. Celsiul a Fahrenheit")
    print("2. Fahrenheit a Celsiul")
    print("3. Salir")
    opcion = int(input("Seleccione una opción: "))
    if opcion == 1:
        num = int(input("Ingrese la temperatura en grados Celsius: "))
        print("La temperatura en grados Fahrenheit es: ", celsiulAFahrenheit(num))
    elif opcion == 2:
        num = int(input("Ingrese la temperatura en grados Fahrenheit: "))
        print("La temperatura en grados Celsius es: ", fahrenheitACelsius(num))
    elif opcion == 3:
        print("Gracias por usar el programa.")
        break
    else:
        print("Opción inválida.")
