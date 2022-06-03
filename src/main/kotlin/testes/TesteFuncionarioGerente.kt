package testes

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val maria = Gerente("Maria Jane", "3336667770", 5000.0)

    ImprimeRelatorioFuncionario.imprime(maria)

}
