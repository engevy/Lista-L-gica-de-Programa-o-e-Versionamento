package lote_91_100

fun main() {
    print("Digite o primeiro numero: ")
    val num1 = readLine()!!.toDouble()
    print("Digite o segundo numero: ")
    val num2 = readLine()!!.toDouble()
    val soma = num1 + num2
    if (soma > 20.0) println("Soma: ${soma + 8}") else println("Soma: ${soma - 5}")
}
