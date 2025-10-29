from .DispositivoEntrada import DispositivoEntrada

class Teclado(DispositivoEntrada): #Clase Teclado que hereda de DispositivoEntrada
    contadorTeclado = 0

    def __init__(self, tipoEntrada, marca): #Constructor de la clase Teclado
        super().__init__(tipoEntrada, marca) #Llama al constructor de la clase padre
        Teclado.contadorTeclado += 1
        self._idTeclado = Teclado.contadorTeclado

    def __str__(self):
        return f'[ID: {self._idTeclado}, Marca: {self._marca}, Tipo de Entrada: {self._tipoEntrada}]'
    
#Pruebas
if __name__ == '__main__':
    teclado1 = Teclado('USB', 'Redragon')
    print(teclado1)

    teclado2 = Teclado('Bluetooth', 'HyperX')
    print(teclado2)