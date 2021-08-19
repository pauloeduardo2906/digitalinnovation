package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Paulo"
    var cpf: String = "111.222.333-11"

    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}



fun main(){
    val paulo = Pessoa()

    println(paulo.pessoaInfo())
}