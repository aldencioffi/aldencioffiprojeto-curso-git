package main.kotlin.Teste

import main.kotlin.Banco

fun main() {
    val digiOneBank = Banco(nome= "DigiOne", numero= 12)

    println(digiOneBank.info())


    val banco2 = digiOneBank.copy(nome = "Banco2")

    println(banco2.info())

}