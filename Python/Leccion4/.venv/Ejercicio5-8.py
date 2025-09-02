# se solicita frase al usuario
fraseOriginal = input("Introduce una frase: ")

# Eliminar los espacios de la frase
fraseSinEspacio = fraseOriginal.replace(" ", "")

# cuenta la longitud de la frase
longitudFrase = len(fraseSinEspacio)

# Mostrar los resultados
print(f"Frase final: {fraseSinEspacio}")
print(f"Número de caracteres: {longitudFrase}")