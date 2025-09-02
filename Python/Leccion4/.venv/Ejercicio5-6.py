import random

# Generar un número aleatorio entre 1 y 100
numeroAleatorio = random.randint(1, 100)
intentos = 0

print("¡Bienvenido adivinar el número!")
print("He elegido un número entre 1 y 100. ¿Puedes adivinarlo?")

while True:
    try:
        # Pedir un número al usuario
        adivinanza = int(input("Introduce tu número: "))
        intentos += 1

        if adivinanza < numeroAleatorio:
            print("Es mayor. Sigue intentando.")
        elif adivinanza > numeroAleatorio:
            print("Es menor. Sigue intentando.")
        else:
            print(f"¡Felicidades! Adivinaste el número en {intentos} intentos.")
            break  # corta el bucle

    except ValueError:
        print("Entrada no válida. Por favor, introduce un número.")