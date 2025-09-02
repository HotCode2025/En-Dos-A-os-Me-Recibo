# Definicion de listas

lista1 = ['banana','pera','sandia','melon','frutilla']
lista2 = ['manzana','uva','pera','melon','naranja']

#Muestro las listas:
print(f"lista 1: {lista1}")
print(f"lista 2: {lista2}")

#Se elimian duplicados de cada lista
lista1SinRepetidos =[]
lista2SinRepetidos =[]

for i in lista1:
    if i is not lista1SinRepetidos:
        lista1SinRepetidos.append(i)


for i in lista2:
    if i is not lista2SinRepetidos:
        lista2SinRepetidos.append(i)

# Acontinuacion creamos las listas solicitadas

unionLista1Y2 = []
for elem in lista1SinRepetidos:
    if elem not in unionLista1Y2:
        unionLista1Y2.append(elem)

for elem in lista2SinRepetidos:
    if elem not in unionLista1Y2:
        unionLista1Y2.append(elem)

print("\n1. Palabras en ambas listas (sin repetir):", unionLista1Y2)

# Palabras que aparecen en la primera lista pero no en la segunda

solo_lista1 = []
for j in lista1SinRepetidos:
    if j not in lista2SinRepetidos:
        solo_lista1.append(j)

print("2. Palabras solo en la primera lista:", solo_lista1)

# Palabras que aparecen en la segunda lista pero no en la primera

solo_lista2 = []
for k in lista2SinRepetidos:
    if k not in lista1SinRepetidos:
        solo_lista2.append(k)

print("3. Palabras solo en la segunda lista:", solo_lista2)

#Palabras que aparecen en ambas listas (intersección)
interseccion = []
for iterador in lista1SinRepetidos:
    if iterador in lista2SinRepetidos:
        interseccion.append(iterador)
print("4. Palabras en ambas listas:", interseccion)