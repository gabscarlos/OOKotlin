package one.digitalinnovation.digionebank

import java.math.BigDecimal

class Analista(nome: String, cpf: String, salario: Double) : Funcionario(nome, cpf, salario) {
    override fun calculoAuxilo() = salario * 0.1
}