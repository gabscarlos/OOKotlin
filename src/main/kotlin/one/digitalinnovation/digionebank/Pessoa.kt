package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Gabriel"
    var cpf: String = "123.456.789-01"
    private set
}

fun main() {
    val gabriel = Pessoa()

    println(gabriel)
    println(gabriel.nome)
    println(gabriel.cpf)
}