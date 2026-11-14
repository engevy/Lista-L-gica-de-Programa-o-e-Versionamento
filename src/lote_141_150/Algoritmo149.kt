package lote_141_150

fun main() {
    print("Nome do produto: ")
    val produto = readln()
    print("Valor da compra: ")
    val compra = readln().toDouble()
    if (compra < 0) { println("Valor inválido"); return }
    val fator = when {
        compra < 10 -> 1.70
        compra < 30 -> 1.50
        compra < 50 -> 1.40
        else -> 1.30
    }
    println("$produto será vendido por R$ ${"%.2f".format(compra * fator)}")
}
