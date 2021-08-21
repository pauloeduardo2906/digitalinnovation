package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val anakin = Cliente(
        nome = "Anakin Skywalker",
        cpf = "123.123.123-78",
        clienteTipo = ClienteTipo.PF,
        senha = "SenhaMuitoForte"
    )

    println(anakin)

    TesteAutenticacao().autentica(anakin)
}
