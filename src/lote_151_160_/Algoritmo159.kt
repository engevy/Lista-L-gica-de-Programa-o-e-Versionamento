package lote_151_160_

import kotlin.math.sqrt

fun main() {
    print("Valor de x: ")
    val x = readln().toDouble()
    if (x > 4.0 || x < -4.0) {
        val fx = (5.0 * x + 3.0) / sqrt(x * x - 16.0)
        println("f(x) = $fx")
    } else println("NÃO PODE SER FEITA")
}
