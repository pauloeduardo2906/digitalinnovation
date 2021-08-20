package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal


fun main(){
    val paulo = Pessoa(nome = "Paulo Eduardo Jr.", cpf = "123456789")

    println(paulo.nome)
    println(paulo.cpf)

    val eduardo = Funcionario(nome = "Paulo Eduardo Jr.", cpf = "123456789", salario = BigDecimal.valueOf(1000.0))

    println(eduardo.nome)
    println(eduardo.cpf)
    println(eduardo.salario)
}