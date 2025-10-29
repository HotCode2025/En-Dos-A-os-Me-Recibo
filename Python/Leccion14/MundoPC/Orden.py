from .Computadora import Computadora
from .Monitor import Monitor
from .Teclado import Teclado
from .Raton import Raton

class Orden:
    contadorOrden = 0

    def __init__(self, computadoras):
        Orden.contadorOrden += 1
        self._idOrden = Orden.contadorOrden
        self._computadoras = computadoras

    def agregar_computadoras(self, computadoras):
        self._computadoras.append(computadoras)
        print(f'Computadora agregada correctamente a la Orden: {self._idOrden}')

    def __str__(self):
        computadoras_str = ''
        for i in self._computadoras:
            computadoras_str += i.__str__()
        return f'''
        Orden: {self._idOrden}{computadoras_str}\n'''
    
if __name__ == "__main__":
    monitor1 = Monitor("Dell", "24 pulgadas")
    teclado1 = Teclado("Logitech", "Inalámbrico")
    raton1 = Raton("Razer", "Óptico")
    comp1 = Computadora("PC Gamer", monitor1, teclado1, raton1)
    orden1 = Orden([comp1])
    print(orden1)


