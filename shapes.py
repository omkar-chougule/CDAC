
import math
from abc import ABC,abstractmethod

class Shape(ABC):
    def __init__(self,shapeid=0,color=""):
        self.__shapeid=shapeid
        self.__color=color
    def __str__(self):
        return f"Shape Id :{self.__shapeid} Color {self.__color}"
    def set_shapeid(self,id):
        self.__shapeid=id
    def get_shapeid(self):
        return self.__shapeid
    def set_color(self,c):
        self.__color=c
    def get_color(self):
        return self.__color
    @abstractmethod
    def calculateArea(self):
        pass
    @abstractmethod
    def calculatePrimeter(self):
        pass
    
class Triangle(Shape):
    def __init__(self,shapeid=0,color="",s1=0,s2=0,b=0,h=0):
        super().__init__(shapeid,color)
        self.__s1=s1
        self.__s2=s2
        self.__b=b
        self.__h=h
    
    def set_s1(self,s):
        self.__s1=s
        
    def get_s1(self):
        return self.__s1
    
    def set_s2(self,s):
        self.__s2=s
        
    def get_s2(self):
        return self.__s2
    
    def set_b(self,s):
        self.__b=s
        
    def get_h(self):
        return self.__h
    
    def calculateArea(self):
        return 0.5*self.__b*self.__h
    
    def calculatePrimeter(self):
        return self.__s1+self.__s2+self.__b
    
    def __str__(self):
        return super().__str__()+f"side1 {self.__s1} side2 {self.__s2} base {self.__b} height {self.__h}"

class Circle(Shape):
    def __init__(self,shapeid=0,color="",r=0):
        super().__init__(shapeid,color)
        self.__r=r
    
    def set_r(self,r):
        self.__r=r
    def get_r(self):
        return self.__r
    
    def calculateArea(self):
        return math.pi*self.__r**2
    
    def calculatePrimeter(self):
        return math.pi*2*self.__r
    
    def __str__(self):   
        return super().__str__()+f"radius {self.__r}"

class Rectangle(Shape):
    def __init__(self,shapeid=0,color="",l=0,b=0):
        super().__init__(shapeid,color)
        self.__l=l
        self.__b=b
    
    def set_l(self,l):
        self.__l=l
        
    def get_l(self):
        return self.__l
    
    def set_b(self,b):
        self.__b=b
        
    def get_b(self):
        return self.__b
    
    def calculateArea(self):
        return self.__l*self.__b
    
    def calculatePrimeter(self):
        return 2*(self.__l+self.__b)
    
    def __str__(self):   
        return super().__str__()+f"length {self.__l} breadth {self.__b}"

if __name__ =="__main__":
    t1=Triangle(12,3,5,3)
    print(t1)
    