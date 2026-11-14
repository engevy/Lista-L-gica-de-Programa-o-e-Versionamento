package lote_51_60

import kotlin.math.PI

fun main() {
    print("Digite o raio do círculo: ")
    val raio = readLine()!!.toDouble()
    val perimetro = 2 * PI * raio
    val area = PI * raio * raio
    println("Perímetro: $perimetro")
    println("Área: $area")
}
