package lote_91_100

fun main() {
    print("Digite um numero inteiro: ")
    val numero = readLine()!!.toInt()
    if (numero % 5 == 0) println("E divisivel por 5") else println("Nao e divisivel por 5")
}
