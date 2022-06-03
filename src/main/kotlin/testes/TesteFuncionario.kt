package testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val gabriel = Pessoa(nome = "Gabriel Carlos", cpf = "12345678901")

    println(gabriel.nome)
    println(gabriel.cpf)

    val joao = Funcionario("Joao Alves", "55566677700", BigDecimal.valueOf(2000.0))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}