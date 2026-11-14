package lote_41_50
import kotlin.math.ln

fun main() {
    print("Entre com o logaritmando: ")
    val numero = readLine()!!.replace(',', '.').toDouble()
    require(numero > 0.0) { "O logaritmando deve ser maior que zero." }

    val logaritmo = ln(numero) / ln(10.0)
    println("Logaritmo na base 10: $logaritmo")
}
