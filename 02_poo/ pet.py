# ARQUIVO   : pet.py
# Disciplina: Programação de Sistemas (2026-2)
# Aula      : Aula 20 Por que POO?
# Autor     : Anna Comin
# Conceitos : Classe, objeto, atributos, métodos, encapsulamento
# Atividade : Classe Pet


class Pet:

    def __init__(
        self,
        nome,
        especie,
        idade,
        raca,
        peso,
        nome_dono,
        telefone_dono,
        vacinado
    ):

        # Atributos principais
        self.nome = nome
        self.especie = especie
        self.idade = idade
        self.hospedado = False

        # Novos atributos
        self.raca = raca
        self.peso = peso
        self.nome_dono = nome_dono
        self.telefone_dono = telefone_dono
        self.vacinado = vacinado

    def exibir_dados(self):

        print("\n--- Dados do Pet ---")
        print(f"Nome: {self.nome}")
        print(f"Espécie: {self.especie}")
        print(f"Idade: {self.idade}")
        print(f"Hospedado: {'Sim' if self.hospedado else 'Não'}")

        # Novos atributos
        print(f"Raça: {self.raca}")
        print(f"Peso: {self.peso} kg")
        print(f"Nome do dono: {self.nome_dono}")
        print(f"Telefone do dono: {self.telefone_dono}")
        print(f"Vacinado: {'Sim' if self.vacinado else 'Não'}")

    def registrar_entrada(self):

        self.hospedado = True
        print(f"{self.nome} entrou no hotel.")

    def registrar_saida(self):

        self.hospedado = False
        print(f"{self.nome} saiu do hotel.")

    def calcular_diaria(self):

        # Exemplo simples de cálculo
        diaria = 50

        # Pets grandes pagam taxa extra
        if self.peso > 20:
            diaria += 20

        print(f"Diária do pet {self.nome}: R$ {diaria}")

    def verificar_vacinacao(self):

        if self.vacinado:
            print(f"{self.nome} está vacinado.")
        else:
            print(f"{self.nome} NÃO está vacinado.")

    def atualizar_peso(self, novo_peso):

        self.peso = novo_peso
        print(f"Novo peso de {self.nome}: {self.peso} kg")

    def emitir_resumo(self):

        print("\n===== RESUMO DO PET =====")
        print(f"Nome: {self.nome}")
        print(f"Espécie: {self.especie}")
        print(f"Raça: {self.raca}")
        print(f"Dono: {self.nome_dono}")
        print(f"Hospedado: {'Sim' if self.hospedado else 'Não'}")
        print("=========================")


# ==========================================
# TESTES COM 3 OBJETOS
# ==========================================

pet1 = Pet(
    "Rex",
    "Cachorro",
    5,
    "Labrador",
    28.5,
    "Carlos Silva",
    "(11) 99999-9999",
    True
)

pet2 = Pet(
    "Mimi",
    "Gato",
    3,
    "Persa",
    4.2,
    "Ana Souza",
    "(21) 98888-8888",
    False
)

pet3 = Pet(
    "Thor",
    "Cachorro",
    7,
    "Pastor Alemão",
    35.0,
    "João Lima",
    "(31) 97777-7777",
    True
)


# ==========================================
# TESTANDO PET 1
# ==========================================

pet1.exibir_dados()
pet1.registrar_entrada()
pet1.calcular_diaria()
pet1.verificar_vacinacao()
pet1.atualizar_peso(30)
pet1.emitir_resumo()


# ==========================================
# TESTANDO PET 2
# ==========================================

pet2.exibir_dados()
pet2.registrar_entrada()
pet2.calcular_diaria()
pet2.verificar_vacinacao()
pet2.atualizar_peso(4.5)
pet2.emitir_resumo()


# ==========================================
# TESTANDO PET 3
# ==========================================

pet3.exibir_dados()
pet3.registrar_entrada()
pet3.calcular_diaria()
pet3.verificar_vacinacao()
pet3.atualizar_peso(36)
pet3.emitir_resumo()