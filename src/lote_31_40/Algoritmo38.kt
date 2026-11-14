package lote_31_40

fun main() {
    print("Entre com um número real: ")
    val numero = readLine()!!.replace(',', '.').toDouble()

    println("A terça parte é: ${numero / 3.0}")
}
