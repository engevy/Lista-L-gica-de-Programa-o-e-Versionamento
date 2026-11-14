package lote_91_100

fun main() {
    print("Digite um numero inteiro: ")
    val numero = readLine()!!.toInt()
    if (numero % 3 == 0) println("Multiplo de 3") else println("Nao e multiplo de 3")
}
