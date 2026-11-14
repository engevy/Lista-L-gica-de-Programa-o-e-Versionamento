package lote_51_60

import kotlin.math.sqrt

fun main() {
    print("Digite o lado do quadrado: ")
    val lado = readLine()!!.toDouble()
    val perimetro = 4 * lado
    val area = lado * lado
    val diagonal = lado * sqrt(2.0)
    println("Perímetro: $perimetro")
    println("Área: $area")
    println("Diagonal: $diagonal")
}
