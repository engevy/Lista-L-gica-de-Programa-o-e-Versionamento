package lote_81_90

fun main() {
    print("Digite um número inteiro: ")
    val numero = readLine()!!.trim().toInt()
    if (numero % 2 == 0) println("PAR") else println("ÍMPAR")
}
