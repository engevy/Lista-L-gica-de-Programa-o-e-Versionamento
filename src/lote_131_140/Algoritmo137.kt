package lote_131_140

import kotlin.math.sqrt

fun main() {
    print("a: ")
    val a = readln().toDouble()
    print("b: ")
    val b = readln().toDouble()
    print("c: ")
    val c = readln().toDouble()
    if (a == 0.0) {
        println("Não é equação do segundo grau")
    } else {
        val delta = b * b - 4 * a * c
        if (delta < 0.0) println("Não há raízes reais")
        else {
            val x1 = (-b + sqrt(delta)) / (2 * a)
            val x2 = (-b - sqrt(delta)) / (2 * a)
            println("x1 = $x1; x2 = $x2")
        }
    }
}
