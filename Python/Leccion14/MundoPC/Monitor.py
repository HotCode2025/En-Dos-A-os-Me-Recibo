class Monitor():
    contadorMonitores = 0

    def __init__(self, marca, tamaño):
        Monitor.contadorMonitores += 1
        self._idMonitor = Monitor.contadorMonitores
        self._marca = marca
        self._tamaño = tamaño

    def __str__(self):
        return f'[ID: {self._idMonitor}, Marca: {self._marca}, Tamaño: {self._tamaño}]'

    @property #getter del atributo marca
    def marca(self):
        return self._marca

    @marca.setter #setter del atributo marca
    def marca(self, marca):
        self._marca = marca

    @property #getter del atributo tamaño
    def tamaño(self):
        return self._tamaño

    @tamaño.setter #setter del atributo tamaño
    def tamaño(self, tamaño):
        self._tamaño = tamaño

if __name__ == '__main__':
    monitor1 = Monitor('Dell', '24 pulgadas')
    print(monitor1)

    monitor2 = Monitor('Samsung', '27 pulgadas')
    print(monitor2)