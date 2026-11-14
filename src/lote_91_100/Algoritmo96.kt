package lote_91_100

fun main() {
    print("Digite um numero inteiro: ")
    val numero = readLine()!!.toInt()
    if (numero % 3 == 0 && numero % 7 == 0) println("Divisivel por 3 e por 7")
    else println("Nao e divisivel por 3 e por 7")
}
