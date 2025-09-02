# 1. Creamos la lista vacía
tabla = []

try:
    # Pedimos el número al usuario y lo convertimos a entero de inmediato
    numero = int(input("Por favor, introduce un número para saber su tabla: "))

    # 3. Usamos un ciclo for para calcular la tabla de multiplicar hasta el 10
    for i in range(1, 11):
        resultado = numero * i
        tabla.append(resultado)

    # 4. Imprimimos el mensaje inicial antes de la lista
    print(f"La tabla de multiplicar de {numero} es:")

    # 5. Iteramos sobre la lista para imprimir cada resultado
    for i, resultado in enumerate(tabla):
        # Usamos el argumento `end` para evitar el salto de línea.
        # Imprimimos una coma y un espacio después de cada número, excepto el último.
        if i < len(tabla) - 1:
            print(resultado, end=', ')
        else:
            print(resultado, end='')

except ValueError:
    print("Error: Por favor, introduce un número entero válido.")