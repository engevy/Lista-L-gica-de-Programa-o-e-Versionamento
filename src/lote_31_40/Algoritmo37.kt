package lote_31_40

fun main() {
    print("Entre com um número: ")
    val numero1 = readLine()!!.toInt()

    print("Entre com outro número: ")
    val numero2 = readLine()!!.toInt()

    val produto = numero1 * numero2
    println("Produto: $produto")
}
