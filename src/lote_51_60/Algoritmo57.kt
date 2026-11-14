package lote_51_60

import kotlin.math.floor
import kotlin.math.round

fun main() {
    print("Digite a nota PR1: ")
    val pr1 = readLine()!!.toDouble()
    print("Digite a nota PR2: ")
    val pr2 = readLine()!!.toDouble()
    val media = (pr1 + pr2) / 2
    val truncada = floor(media)
    val arredondada = floor(media + 0.5)
    println("Média truncada = ${truncada.toInt()}")
    println("Média arredondada = ${arredondada.toInt()}")
}
