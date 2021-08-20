package one.digitalinnovation.digionebank

class Gerente(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {
    override fun calculoAuxilio() = salario * 0.4
    override fun totalSalario() = salario + (salario * 0.4)
}