package lote_41_50
import kotlin.math.sqrt

fun main() {
    print("Digite um número: ")
    val numero = readLine()!!.replace(',', '.').toDouble()
    require(numero >= 0.0) { "Para calcular a raiz quadrada real, informe um número não negativo." }

    val quadrado = numero * numero
    val raizQuadrada = sqrt(numero)

    println("Número: $numero")
    println("Quadrado: $quadrado")
    println("Raiz quadrada: $raizQuadrada")
}
