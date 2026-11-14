package lote_91_100

fun main() {
    print("Digite um numero inteiro de quatro algarismos: ")
    val numero = readLine()!!.toInt()
    val milharesECentenas = numero / 100
    if (milharesECentenas % 4 == 0) println("O numero formado pelos algarismos de milhar e centena e multiplo de 4: $milharesECentenas")
    else println("O numero formado pelos algarismos de milhar e centena nao e multiplo de 4: $milharesECentenas")
}
