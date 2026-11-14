package lote_91_100

fun main() {
    print("Digite um numero inteiro de tres algarismos: ")
    val numero = readLine()!!.toInt()
    val centena = numero / 100
    if (centena % 2 == 0) println("O algarismo das centenas e par: $centena")
    else println("O algarismo das centenas e impar: $centena")
}
