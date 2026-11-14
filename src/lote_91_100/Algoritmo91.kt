package lote_91_100

fun main() {
    print("Digite o primeiro numero: ")
    val num1 = readLine()!!.toInt()
    print("Digite o segundo numero: ")
    val num2 = readLine()!!.toInt()
    val soma = num1 + num2
    if (soma > 10) println("Soma: $soma")
}
