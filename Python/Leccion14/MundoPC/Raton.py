from .DispositivoEntrada import DispositivoEntrada


class Raton(DispositivoEntrada): #Clase Raton que hereda de DispositivoEntrada
    contadorRaton = 0

    def __init__(self, tipoEntrada, marca): #Constructor de la clase Raton
        super().__init__(tipoEntrada, marca) #Llama al constructor de la clase padre
        Raton.contadorRaton += 1
        self._idRaton = Raton.contadorRaton

    def __str__(self): 
        return f'[ID: {self._idRaton}, Marca: {self._marca}, Tipo de Entrada: {self._tipoEntrada}]'
    
#Pruebas
if __name__ == '__main__': 
    raton1 = Raton('USB', 'Logitech')
    print(raton1)

    raton2 = Raton('Bluetooth', 'Microsoft')
    print(raton2)