#clase padre figuraGeometrica
class figuraGeometrica:
    def __init__(self, alto, ancho):
        
        self.alto = alto
        self.ancho = ancho
        
    def get_alto(self):
        return self.alto
    
    def get_ancho(self):
        return self.ancho
    
    def set_alto(self, alto):
        self.alto = alto
        
    def set_ancho(self, ancho):
        self.ancho = ancho
        
    def __str__(self):
        return f"Figura Geométrica: Alto = {self.alto}, Ancho = {self.ancho}"
    
    
#clase padre color
class color:
    def __init__(self, color):
        self.color = color
        
    def get_color(self):
        return self.color
    
    def set_color(self, color):
        self.color = color
        
    def __str__(self):
        return f"Color: {self.color}"
    
    
#clase hija cuadrado
class cuadrado(figuraGeometrica, color):
    def __init__(self, alto, ancho, color):
        super().__init__(alto, ancho)
        color.__init__(color)
        
    def area(self):
        return self.alto * self.ancho
    
    def __str__(self):
        return f"Cuadrado: alto = {self.alto}, ancho = {self.ancho}, color = {self.color}"

#clase hija rectangulo
class rectangulo(figuraGeometrica, color):
    def __init__(self, alto, ancho, color):
        super().__init__(alto, ancho)
        color.__init__(color)
        
    def area(self):
        return self.alto * self.ancho
    
    def __str__(self):
        return f"Rectangulo: alto = {self.alto}, ancho = {self.ancho}, color = {self.color}"
    