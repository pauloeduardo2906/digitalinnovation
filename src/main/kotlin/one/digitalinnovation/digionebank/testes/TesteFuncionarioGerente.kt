package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa

fun main(){
    val dexter = Gerente(nome = "Dexter Morgan", cpf = "564987321", salario = 5000.0)

    ImprimeRelatorioFuncionario.imprime(dexter)

}

