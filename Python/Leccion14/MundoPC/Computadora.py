from .Monitor import Monitor
from .Teclado import Teclado
from .Raton import Raton

class Computadora:

    contadorComputadora = 0

    def __init__(self, nombre, monitor, teclado, raton):
        Computadora.contadorComputadora += 1
        self._idComputadora = Computadora.contadorComputadora
        self._nombre = nombre
        self._monitor = monitor
        self._teclado = teclado
        self._raton = raton

    def __str__(self):
        return f'''
        Computadora [ID: {self._idComputadora}, Nombre: {self._nombre}]
        Monitor: {self._monitor}
        Teclado: {self._teclado}
        Ratón: {self._raton} \n'''

    @property #getter del atributo nombre
    def nombre(self):
        return self._nombre

    @nombre.setter #setter del atributo nombre
    def nombre(self, nombre):
        self._nombre = nombre

    @property #getter del atributo monitor
    def monitor(self):
        return self._monitor

    @monitor.setter #setter del atributo monitor
    def monitor(self, monitor):
        self._monitor = monitor

    @property #getter del atributo teclado
    def teclado(self):
        return self._teclado

    @teclado.setter #setter del atributo teclado
    def teclado(self, teclado):
        self._teclado = teclado

    @property #getter del atributo raton
    def raton(self):
        return self._raton

    @raton.setter #setter del atributo raton
    def raton(self, raton):
        self._raton = raton

if __name__ == "__main__":
    monitor1 = Monitor("Dell", "24 pulgadas")
    teclado1 = Teclado("Bluetooth", "Corsair")
    raton1 = Raton("Bluetooth", "Logitech")
    comp1 = Computadora("PC Gamer", monitor1, teclado1, raton1)
    print(comp1)

    monitor2 = Monitor("Samsung", "27 pulgadas")
    teclado2 = Teclado("USB", "Redragon")
    raton2 = Raton("Cable", "HyperX")
    comp2 = Computadora("PC Oficina", monitor2, teclado2, raton2)
    print(comp2)