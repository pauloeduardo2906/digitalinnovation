package one.digitalinnovation.digionebank

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double
) : Pessoa(nome, cpf) {
    protected abstract fun calculoAuxilio(): Double
    protected abstract fun totalSalario(): Double

    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Salário: R$ $salario
        Auxílio: R$ ${calculoAuxilio()}
        Salário Final: R$ ${totalSalario()}
    """.trimIndent()
}