class Estoque:
    def __init__(self, unidadesDisponiveis, unidadesAlugadas, unidadesEmReforma, unidadesParaChegar):
       self.unidadesDisponiveis = unidadesDisponiveis 
       self.unidadesAlugadas = unidadesAlugadas
       self.unidadesEmReforma = unidadesEmReforma
       self.unidadesParaChegar = unidadesParaChegar

def __str__(self):
    print(f"Unidades disponiveis: {self.unidadesDisponiveis}\n"
    F"Unidades Alugadas: {self.unidadesAlugadas}\n"
    f"Unidades que estão em reforma: {self.unidadesEmReforma}\n"
    f"Unidades para chegar ao estoque: {self.unidadesParaChegar}")

joinville = Estoque(99, 23, 2, 12)
joinville.__str__()
jaragua = Estoque(65, 19, 2, 4)
jaragua.__str__()