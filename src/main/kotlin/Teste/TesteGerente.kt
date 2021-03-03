package main.kotlin.Teste

import main.kotlin.Gerente
import main.kotlin.ImprimeRelatorioFuncionario

fun main() {
    val maria = Gerente( "Mariia do Carmo", "123.123.123-12", 8000.0, "Senha123")
    ImprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao().autentica(maria)
}

