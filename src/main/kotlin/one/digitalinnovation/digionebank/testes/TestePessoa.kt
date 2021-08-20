package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Pessoa


fun main(){
    val paulo = Pessoa(nome = "Paulo Eduardo Jr.", cpf = "123456789")

    println(paulo.nome)
    println(paulo.cpf)
}