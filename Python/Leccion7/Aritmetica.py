class Aritmetica:

    """ 
    El nombre de este tipo de comentario es: Docstring
    esto es documentacion de la clase en python
    Vamos a hacer en esta clase algunas operaciones de: suma, resta, multiplicacion y mas

    """

    def __init__(self, operadorA, operadorB):
        self.operadorA = operadorA
        self.operadorB = operadorB

    # metodo para sumar
    def sumar(self):
        return self.operadorA + self.operadorB

    def resta(self):
        return self.operadorA - self.operadorB
    
    def multiplicar(self):
        return self.operadorA * self.operadorB
    
    def dividir(self):
        return self.operadorA / self.operadorB
    
    
aritmetica1 = Aritmetica(7, 9) # le pasamos los argumentos
print(aritmetica1.sumar())
print(f'La resta es {aritmetica1.resta()}')
print(f'La multiplicacion es {aritmetica1.multiplicar()}')
print(f'La division es {aritmetica1.dividir()}')



