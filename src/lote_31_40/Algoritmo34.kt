package lote_31_40


fun main() {
    print("Entre com um número: ")
    val numero = readLine()!!.toInt()

    val antecessor = numero - 1
    val sucessor = numero + 1

    println("O sucessor é: $sucessor")
    println("O antecessor é: $antecessor")
}
