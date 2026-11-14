package lote_21_30

import kotlin.math.round

fun main() {
    println("TESTANDO HIERARQUIA DE OPERADORES")

    val resto = 6 % 2
    println("6 % 2 = $resto")

    val resultadoComRestoZero = Double.POSITIVE_INFINITY
    println("\n18 / 6 % 2 (interpretacao do UAL) = $resultadoComRestoZero")
    println("Em Kotlin, 18 / 6 % 2 = ${(18 / 6) % 2}")


    println("\n20 / 4 div 2 (resultado do exemplo) = ${round((20.0 / 4.0) / 2.0).toInt()}")
    println("30 / 4 div 2 (resultado do exemplo) = ${round((30.0 / 4.0) / 2.0).toInt()}")

    println("\n7. div 4 = ${round(7.0 / 4.0).toInt()}")
    println("7 div 4 = ${7 / 4}")
    println("6. div 4 = ${round(6.0 / 4.0).toInt()}")
    println("6 div 4 = ${6 / 4}")

    println("\nObservacao: as expressoes foram parentizadas para demonstrar o comportamento do UAL.")
    println("A precedência de operadores do Kotlin nao é idêntica à do UAL.")
}
