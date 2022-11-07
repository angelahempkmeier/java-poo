class Pessoa:

    def __init__(self, nome):
        self.nome = nome
    

from tokenize import Double

notas = [5]
class Aluno(Pessoa):
    
    def __init__(self):
        super().__init__()
    '''
    def receberNotas(object):
        notas.append(object)
    '''
    def calcular_media(self) -> Double:
        for i in self.notas:
            media += i
        m = media/5
        return m
    
    def resultado(self) -> str:
        if self.calcular_media()>=7:
            return "Aprovado"
        else:
            return "Exame"

    def __repr__(self) -> str:
        return "nome: " + super().__repr__() + "," + "media: " + self.media + "resultado: " + self.resultado
    

class Professor(Pessoa):

    def __init__(self, salario):
        self.salario = salario
        super().__init__()
        
class Main:
    def __init__(self) -> None:
        pass

    aluno1 = Aluno()
    
    #aluno1.receberNotas()
    aluno1.calcular_media()
    print(aluno1.__repr__())