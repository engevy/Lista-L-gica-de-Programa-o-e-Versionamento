package lote_41_50
import kotlin.math.sqrt

fun main() {
    print("Digite a base do retângulo: ")
    val base = readLine()!!.replace(',', '.').toDouble()

    print("Digite a altura do retângulo: ")
    val altura = readLine()!!.replace(',', '.').toDouble()

    val perimetro = 2.0 * (base + altura)
    val area = base * altura
    val diagonal = sqrt(base * base + altura * altura)

    println("Perímetro: $perimetro")
    println("Área: $area")
    println("Diagonal: $diagonal")
}
