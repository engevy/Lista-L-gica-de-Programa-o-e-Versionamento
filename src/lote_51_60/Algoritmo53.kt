package lote_51_60

import kotlin.math.sqrt

fun main() {
    print("Digite a base: ")
    val a = readLine()!!.toDouble()
    print("Digite a altura: ")
    val b = readLine()!!.toDouble()
    print("Digite a profundidade: ")
    val c = readLine()!!.toDouble()
    val diagonal = sqrt(a * a + b * b + c * c)
    println("Diagonal: $diagonal")
}
