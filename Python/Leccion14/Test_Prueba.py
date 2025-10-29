from MundoPC.Computadora import Computadora
from MundoPC.Monitor import Monitor
from MundoPC.Teclado import Teclado
from MundoPC.Raton import Raton
from MundoPC.Orden import Orden

monitor1 = Monitor("Dell", "24 pulgadas")
teclado1 = Teclado("Bluetooth", "Corsair")
raton1 = Raton("Bluetooth", "Logitech")
comp1 = Computadora("PC Gamer", monitor1, teclado1, raton1)

monitor2 = Monitor("Samsung", "27 pulgadas")
teclado2 = Teclado("USB", "Redragon")
raton2 = Raton("Cable", "HyperX")
comp2 = Computadora("PC Oficina", monitor2, teclado2, raton2)

computadoras1 = [comp1, comp2]
orden1 = Orden(computadoras1)
print(orden1)

monitor3 = Monitor("Acer", "27 pulgadas")
teclado3 = Teclado("USB", "Redragon")
raton3 = Raton("Cable", "HyperX")
comp3 = Computadora("PC Oficina", monitor3, teclado3, raton3)

orden1.agregar_computadoras(comp3)
print(orden1)

monitor4 = Monitor("Dell", "24 pulgadas")
teclado4 = Teclado("Bluetooth", "Corsair")
raton4 = Raton("Bluetooth", "Logitech")
comp4 = Computadora("PC Gamer", monitor4, teclado4, raton4)

orden2 = Orden([comp4])
print(orden2)
orden2.agregar_computadoras(comp1)
print(orden2)