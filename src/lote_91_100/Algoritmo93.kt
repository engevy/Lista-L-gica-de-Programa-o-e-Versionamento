package lote_91_100

fun main() {
    print("Digite um numero: ")
    val numero = readLine()!!.toDouble()
    if (numero > 0.0) println("Raiz: ${kotlin.math.sqrt(numero)}")
    else if (numero < 0.0) println("Quadrado: ${numero * numero}")
}
