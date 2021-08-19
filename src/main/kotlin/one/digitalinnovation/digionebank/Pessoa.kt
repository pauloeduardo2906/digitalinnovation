package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Paulo"
    var cpf: String = "111.222.333-11"

    private set
}

fun main(){
    val paulo = Pessoa()

    println(paulo)

    println(paulo.nome)
    println(paulo.cpf)
}