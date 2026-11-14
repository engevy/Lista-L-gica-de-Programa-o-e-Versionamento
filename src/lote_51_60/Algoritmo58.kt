package lote_51_60

import kotlin.math.ln

fun main() {
    print("Entre com o 1º valor: ")
    val xnum1 = readLine()!!.toDouble()
    print("Entre com o 2º valor: ")
    val xnum2 = readLine()!!.toDouble()
    print("Entre com o 3º valor: ")
    val xnum3 = readLine()!!.toDouble()


    val x = xnum1 + xnum2 / (xnum3 + xnum1) +
        2 * (xnum1 - xnum2) + ln(64.0) / ln(2.0)
    println("X = $x")
}
