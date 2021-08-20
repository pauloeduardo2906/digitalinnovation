package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa

fun main(){
    val eduardo = Analista(nome = "Paulo Eduardo Jr.", cpf = "123456789", salario = 2000.0)

    ImprimeRelatorioFuncionario.imprime(eduardo)
}
