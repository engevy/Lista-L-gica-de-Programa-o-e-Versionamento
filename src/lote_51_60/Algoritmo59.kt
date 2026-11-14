package lote_51_60

import kotlin.math.sqrt

fun main() {
    print("Entre com o 1º cateto: ")
    val cateto1 = readLine()!!.toDouble()
    print("Entre com o 2º cateto: ")
    val cateto2 = readLine()!!.toDouble()
    val hipotenusa = sqrt(cateto1 * cateto1 + cateto2 * cateto2)
    println("A hipotenusa é: $hipotenusa")
}
