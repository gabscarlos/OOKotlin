package testes

import one.digitalinnovation.digionebank.Analista


fun main() {
    val joao = Analista("Joao Alves", "5556667770", 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)

}
