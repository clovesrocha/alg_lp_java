# Função para calcular a média e determinar a situação
def calcular_situacao(nota1, nota2, nota_final=None):
    media = (nota1 + nota2) / 2
    if media >= 7.0:
        return "Aprovado direto!"
    elif media >= 4.0:
        if nota_final is not None:
            media_final = (media + nota_final) / 2
            if media_final >= 5.0:
                return "Aprovado na final!"
            else:
                return "Reprovado na final!"
        else:
            tela = 5.0 - media
            return f"Tela: {tela:.2f} para ser aprovado na final!"
    else:
        return "Reprovado direto!"

# Entrada de notas
nota1 = float(input("Nota 1: "))
nota2 = float(input("Nota 2: "))

# Cálculo da situação
situacao = calcular_situacao(nota1, nota2)
print(situacao)

# Se necessário, entrada da nota final
if situacao == "Aprovado na final!" or "para ser aprovado na final" in situacao:
    nota_final = float(input("Final: "))
    situacao_final = calcular_situacao(nota1, nota2, nota_final)
    print(situacao_final)
