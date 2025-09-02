
# Creamos la lista
personajes = []
# Agregamos los personajes
personajes.append({
    "nombre": "aragon",
    "clase": "guerrero",
    "raza": "dunadan del norte"
})

personajes.append({
    "nombre": "gandalf",
    "clase": "mago",
    "raza": "istar"
})

personajes.append({
    "nombre": "legolas",
    "clase": "arquero",
    "raza": "elfo sindar"
})

personajes.append({
    "nombre": "frodo",
    "clase": "portador del anillo",
    "raza": "hobbit"
})

personajes.append({
    "nombre": "gimli",
    "clase": "guerrero",
    "raza": "enano"
})

#Se muestra la lista de personajes.
print("Esta es la lista de personajes: ")
for personaje in personajes:
    print(f"Nombre: {personaje['nombre']}, Clase: {personaje['clase']}, Raza: {personaje['raza']}")

