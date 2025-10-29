class DispositivoEntrada:
    def __init__(self, tipoEntrada, marca):
        self._tipoEntrada = tipoEntrada
        self._marca = marca

    def __str__(self):
        return f'Tipo de Entrada: [{self._tipoEntrada}, Marca: {self._marca}]'
    
    @property #getter del atributo tipoEntrada
    def tipoEntrada(self):
        return self._tipoEntrada

    @tipoEntrada.setter #setter del atributo tipoEntrada
    def tipoEntrada(self, tipoEntrada):
        self._tipoEntrada = tipoEntrada

    @property #getter del atributo marca
    def marca(self):
        return self._marca

    @marca.setter #setter del atributo marca
    def marca(self, marca):
        self._marca = marca