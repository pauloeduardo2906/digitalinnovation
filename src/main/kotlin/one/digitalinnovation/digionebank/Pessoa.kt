package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Paulo"
    var cpf: String = "111.222.333-11"
}

fun main(){
    val paulo = Pessoa()

    println(paulo.nome)
    println(paulo.cpf)
}