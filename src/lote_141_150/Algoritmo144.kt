package lote_141_150

fun main() {
    print("Saldo médio: ")
    val saldo = readln().toDouble()
    if (saldo < 0) { println("Saldo inválido"); return }
    val credito = when {
        saldo < 501 -> 0.0
        saldo < 1001 -> saldo * 0.30
        saldo < 3001 -> saldo * 0.40
        else -> saldo * 0.50
    }
    println("Saldo médio: R$ ${"%.2f".format(saldo)}")
    if (credito == 0.0) println("Nenhum crédito")
    else println("Crédito: R$ ${"%.2f".format(credito)}")
}
