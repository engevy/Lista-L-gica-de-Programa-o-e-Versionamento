package lote_91_100

fun main() {
    print("Digite um numero inteiro: ")
    val numero = readLine()!!.toInt()
    if (numero % 10 == 0) println("Multiplo de 10")
    else if (numero % 2 == 0) println("Multiplo de 2")
    else if (numero % 5 == 0) println("Multiplo de 5")
    else println("Nao e multiplo de 2 nem de 5")
}
