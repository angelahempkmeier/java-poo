class Unidade:
    def __init__(self, cidade, quantidadeUnidade, estoqueCarros, clientesTotais):
        self.cidade = cidade
        self.quantidadeUnidade = quantidadeUnidade
        self.estoqueCarros = estoqueCarros
        self.clientesTotais = clientesTotais
    
def __str__(self):
    print(f"Cidade: {self.cidade}\n"
    F"Quantidade de Unidades na cidade: {self.quantidadeUnidade}\n"
    f"Estoque de carros: {self.estoqueCarros}\n"
    f"Clientes totais: {self.clientesTotais}")

joinville = Unidade('Joinville', 5, 99, 1020)
jaragua = Unidade('Jaraguá do Sul', 2, 65, 801)

joinville.__str__()
jaragua.__str__()