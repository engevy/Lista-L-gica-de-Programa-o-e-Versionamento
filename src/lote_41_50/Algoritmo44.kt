package lote_41_50
import kotlin.math.ln

fun main() {
    print("Entre com o logaritmando: ")
    val numero = readLine()!!.replace(',', '.').toDouble()

    print("Entre com a base: ")
    val base = readLine()!!.replace(',', '.').toDouble()

    require(numero > 0.0) { "O logaritmando deve ser maior que zero." }
    require(base > 0.0 && base != 1.0) { "A base deve ser positiva e diferente de 1." }

    val logaritmo = ln(numero) / ln(base)
    println("O logaritmo de $numero na base $base é: $logaritmo")
}
