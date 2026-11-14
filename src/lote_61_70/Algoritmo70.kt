package lote_61_70

fun main() {
    print("Entre com o valor da conta: ")
    val conta = readLine()!!.toDouble()
    val total = conta * 1.10
    println("O valor da conta com a gorjeta será: %.2f".format(total))
}
