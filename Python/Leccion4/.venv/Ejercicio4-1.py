#EJERCICIO 4.1 EN PYTHON: Eliminar duplicados de una lista
# Escriba un programa donde tenga una lista y que acontinuacion elimine los elementos repetidos,
# por ultimo mostrar la lista.

miLista = [2,3,3,4,5,6,7,7,8,9,1,1]
print(f"La lista es la siguiente: {miLista}")
listaSinDuplicados = []
for i in miLista:
    if i not in listaSinDuplicados:
        listaSinDuplicados.append(i)

print(f"Esta es la lista sin elementos duplicados: {listaSinDuplicados}")

