package main.kotlin.Teste

import main.kotlin.Analista
import main.kotlin.ImprimeRelatorioFuncionario

fun main() {
    val joao = Analista( "Joao de Deus", "123.123.123-12", 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
    }

